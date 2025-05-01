package _my_test;

import javax.swing.*;
import java.awt.*;

public class MyPaintFrame extends JFrame {

    private Panel myPaintFrame;

    public MyPaintFrame() {
        initData();
        setInitData();

    }

    private void initData() {
        setTitle("집 만들기");
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        myPaintFrame = new Panel();

    }

    private void setInitData() {
        super.add(myPaintFrame);

    }

    // 내부 클래스
    static  class MyPanel extends JPanel {

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawRect(30,30,500,500);

        }
    } // end of static inner class

    // 메인 함수
    public static void main(String[] args) {
        new MyPaintFrame();
    }


}
