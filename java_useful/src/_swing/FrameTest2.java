package _swing;

import javax.swing.*;
import java.awt.*;

public class FrameTest2 extends JFrame {

    public FrameTest2() {
        JLabel imgLabel = new JLabel();
        ImageIcon icon = new ImageIcon(FrameTest2.class.getResource("/test/image/icon.png"));

        Image image = icon.getImage();
        Image updateImg = image.getScaledInstance(165,100,Image.SCALE_SMOOTH);
        ImageIcon updateIcon = new ImageIcon(updateImg);

        imgLabel.setIcon(updateIcon);

        imgLabel.setBounds(210,30,165,150);
        imgLabel.setHorizontalAlignment(JLabel.CENTER);

        getContentPane().add(imgLabel);
        setVisible(true);
    }
}
