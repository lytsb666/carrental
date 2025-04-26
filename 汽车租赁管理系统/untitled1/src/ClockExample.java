import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ClockExample extends JPanel {
    private Timer timer;
    private String currentTime;

    public ClockExample() {
        // 基础时钟初始化
        setPreferredSize(new Dimension(300, 150));
        updateTime();

        // 主计时器（每秒更新）
        timer = new Timer(1000, e -> {
            updateTime();
            repaint();
            checkAlarm(); // 新增闹钟检测
        });
        timer.start();
    }

    private void updateTime() {
        currentTime = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
    }

    // 新增闹钟功能（整点报时）
    private void checkAlarm() {
        int minutes = Calendar.getInstance().get(Calendar.MINUTE);
        if (minutes == 0) {
            timer.stop();
            for (int i = 0; i < 5; i++) {
                JOptionPane.showMessageDialog(this, "当前整点报时！");
            }
            timer.start();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("微软雅黑", Font.BOLD, 36));
        g.drawString(currentTime, 50, 80);
    }

    public void pause() { timer.stop(); }
    public void resume() { timer.start(); }
}