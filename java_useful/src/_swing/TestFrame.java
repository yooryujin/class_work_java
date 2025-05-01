package _swing;

import javax.swing.*;

public class TestFrame extends JFrame {

    public TestFrame() {
        // 라벨 생성
        JLabel imgLabel = new JLabel();

        // 아이콘 생성
        // 생성자 인수 --> 현재 클래스명.class.getResource("/패지키명/이미지폴더명/이미지파일명")
        // 이미지 파일명은 반드시 확장자까지 같이 적어둘것
        ImageIcon icon = new ImageIcon(TestFrame.class.getResource("img.png"));

        // 라벨에 아이콘(이미지)생성
        imgLabel.setIcon(icon);

        // 라벨 설정(크기, 정렬...)
        imgLabel.setBounds(210,30,165,150);
        imgLabel.setHorizontalAlignment(JLabel.CENTER);

        // 프레임에 컴포넌트 추가
        getContentPane().add(imgLabel);

        // 프레임 보이기 지정
        setVisible(true);

    }
}
