import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // �ϸ���ѭͼƬ�еĵ��÷�ʽ
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setTitle("�������޹���ϵͳʱ��");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new ClockExample());
            frame.pack();
            frame.setVisible(true);
        });
    }
}