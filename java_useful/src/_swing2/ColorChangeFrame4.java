package _swing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeFrame4 extends JFrame implements ActionListener {

    private JPanel panel1;
    private JPanel panel2;

    private JButton[] buttons = new JButton[7];



    public ColorChangeFrame4() {
        initData();
        setInitData();
        addEventListener();
    }

    private void initData() {
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel1 = new JPanel();
        panel1.setBackground(Color.cyan);
        panel2 = new JPanel();
        panel1.setBackground(Color.GRAY);

        String[] directions = {"빨간색", "주황색", "노란색", "초록색", "파랑색", "남색", "보라색"};
        buttons[0] = new JButton("빨간색");
        buttons[1] = new JButton("주황색");
        buttons[2] = new JButton("노란색");
        buttons[3] = new JButton("초록색");
        buttons[4] = new JButton("파랑색");
        buttons[5] = new JButton("남색");
        buttons[6] = new JButton("보라색");

    }

    private void setInitData() {
        setLayout(new BorderLayout());
        // panel1 -> FlowLayout ( 수평 컴포넌트)
        for (int i = 0; i < buttons.length; i++) {
            panel1.add(buttons[i]);
        }

        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);

        setVisible(true);
    }

    private void addEventListener() {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].addActionListener(this);
        }

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttons[0]) {
            panel2.setBackground(Color.yellow);
        } else if(e.getSource() == buttons[1]) {
            panel2.setBackground(Color.BLACK);
        } else if (e.getSource() == buttons[2]) {
            panel2.setBackground(Color.BLUE);
        } else if (e.getSource() == buttons[3]) {
            panel2.setBackground(Color.RED);
        } else if (e.getSource() == buttons[4]) {
            panel2.setBackground(Color.GRAY);
        } else if (e.getSource() == buttons[5]) {
            panel2.setBackground(Color.GRAY);
        }


    }


    // 메인 함수
    public static void main(String[] args) {
        new ColorChangeFrame4();

    }


}
