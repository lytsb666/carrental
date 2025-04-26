import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // 严格遵循图片中的调用方式
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setTitle("汽车租赁管理系统时钟");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new ClockExample());
            frame.pack();
            frame.setVisible(true);
        });
    }
}