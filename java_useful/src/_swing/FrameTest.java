package _swing;

import javax.swing.*;
import java.awt.*;

public class FrameTest extends JFrame {

    public FrameTest() {

        ImageIcon icon = new ImageIcon();
        FrameTest.class.getResource("/test/image/icon.png");

        // ImagineIcon 객체에서 Image 호출
        Image img = icon.getImage();

        // 추출된 Image 의 크기 조절하여 새로운 Image 객체 생성
        Image updateImg = img.getScaledInstance(165,100, Image.SCALE_SMOOTH);

        // 새로운 Image 객체로 ImageIcon 객체 생성
        ImageIcon updateIcon = new ImageIcon(updateImg);
        JLabel imgLabel = new JLabel(updateIcon);
        getContentPane().add(imgLabel);

        // 프레임 설정
        setTitle("FrameTest");
        setSize(500,500);
        setVisible(true);
    }

}
