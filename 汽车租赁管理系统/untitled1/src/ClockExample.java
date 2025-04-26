import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ClockExample extends JPanel {
    private Timer timer;
    private String currentTime;

    public ClockExample() {
        // ����ʱ�ӳ�ʼ��
        setPreferredSize(new Dimension(300, 150));
        updateTime();

        // ����ʱ����ÿ����£�
        timer = new Timer(1000, e -> {
            updateTime();
            repaint();
            checkAlarm(); // �������Ӽ��
        });
        timer.start();
    }

    private void updateTime() {
        currentTime = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
    }

    // �������ӹ��ܣ����㱨ʱ��
    private void checkAlarm() {
        int minutes = Calendar.getInstance().get(Calendar.MINUTE);
        if (minutes == 0) {
            timer.stop();
            for (int i = 0; i < 5; i++) {
                JOptionPane.showMessageDialog(this, "��ǰ���㱨ʱ��");
            }
            timer.start();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("΢���ź�", Font.BOLD, 36));
        g.drawString(currentTime, 50, 80);
    }

    public void pause() { timer.stop(); }
    public void resume() { timer.start(); }
}