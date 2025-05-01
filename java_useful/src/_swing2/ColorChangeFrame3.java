package _swing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeFrame3 extends JFrame implements ActionListener {

    JButton[] buttons;
    String[] directions = {BorderLayout.SOUTH, BorderLayout.NORTH, BorderLayout.EAST, BorderLayout.CENTER, BorderLayout.WEST};


    private JPanel panel;

    public ColorChangeFrame3() {
        initData();
        setInitData();
        addEventListener();
    }

    private void initData() {
        buttons = new JButton[5];

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("버튼" + (i + 1));
        }

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();

    }

    private void setInitData() {
        setLayout(new BorderLayout());
        for (int i = 0; i < buttons.length; i++) {
            add(buttons[i], directions[i]);
        }
        setVisible(true);
    }

    private void addEventListener() {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].addActionListener(this);
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }


    // 메인 함수
    public static void main(String[] args) {
        new ColorChangeFrame3();

    }


}
