package _swing;

import javax.swing.*;
import java.awt.*;

/**
 *  배치관리자 - 설정을 아무것도 안하면 또는 null 값으로 세팅을 하면
 *   좌표 기준으로 배치를 할 수 있다.
 */
public class NoLayoutEx01 extends JFrame {

    private JButton button1;
    private JButton button2;
    private JButton button3;


    private NoLayoutEx01() {
        initData();
        setInitLayout();
    }

    private void initData() {
        setTitle("좌표값으로 버튼 배치하기");
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        JButton button[] = new JButton[5];
        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton("버튼" + (i+1));
            add(button[i]);
        }

        button1 = new JButton("button1");
        button2 = new JButton("button2");
        button3 = new JButton("button3");
    }

    private void setInitLayout() {
        // 좌표값으로 배치 ( 반드시 null 값을 입력하자 )
        setLayout(null);

        // 좌표값을 선택하게 되면 먼저 컴포넌트에 사이즈를 결정해주어야 한다.
        // setter 메서드
        button1.setSize(100,100);
        button2.setSize(200,200);
        button3.setSize(150,100);

        // 배치관리자가 좌표값이기 때문에 x, y 값을 지정해주어야 한다.
        button1.setLocation(0,0);
        button2.setLocation(200,200);
        button3.setLocation(0,150);

        // 패널에 붙이기
        add(button1);
        add(button2);
        add(button3);
    }

    // 테스트 코드 작성
    public static void main(String[] args) {
        new NoLayoutEx01();

    } // end of main
}
