//package _swing;
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.net.URL;
//
//public class 문자열3 extends JFrame implements ActionListener {
//    JLabel la1, la2;
//    JTextField tf;
//    JPasswordField pf;
//    JButton b1, b2;
//    JLabel poster = new JLabel();
//
//    final String ID = "admin"; // 원래 DB에 존재 하지만 임시로 부여
//    final String PWD = "1234";
//
//    public 문자열3() {
//        la1 = new JLabel("ID");
//        la2 = new JLabel("PW");
//        tf = new JTextField();
//        pf = new JPasswordField();
//        b1 = new JButton("로그인");
//        b2 = new JButton("취소");
//
//        String s = "http://search2.kakaocdn.net/argon/0x200_85_hr/L6WvGHhmxoR";
//        try {
//            poster.setIcon(new ImageIcon(new URL(s)));
//        } catch (Exception ex) {
//        }
//        setLayout(null);
//
//        la1.setBounds(10, 15, 30, 30);
//        tf.setBounds(45, 15, 150, 30);
//        la2.setBounds(10, 50, 30, 30);
//        pf.setBounds(45, 50, 150, 30);
//
//        JPanel panel = new JPanel();
//        panel.add(b1);
//        panel.add(b2);
//        panel.setBounds(10, 90, 195, 35);
//        add(la1);
//        add(tf);
//        add(la2);
//        add(pf);
//        add(panel);
//        poster.setBounds(50, 125, 300, 250); // setBounds (x, y, width, height)
//        add(poster);
//        setSize(1024, 768);
//        setVisible(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE); // 창 종료 시 계속 실행 끔
//        // Integer.MAX_VALUE; // 21억 4천... --> 상수
//        b1.addActionListener(this); // 로그인
//        b2.addActionListener(this); // 취소
//    }
//
//    public static void main(String[] args) throws Exception {
//        UIManager.setLookAndFeel("com");
//        new 문자열3();
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == b1) { // 로그인 버튼 시
//            String id = tf.getText(); // 입력한 값을 갖고와서
//            if (id.trim().length() < 1) { // 입력한 값이 오류라면
//                JOptionPane.showMessageDialog(this, "비밀번호를 입력하세요");
//                tf.requestFocus(); // focus 올려줌
//                return;
//            }
//            // 입력이 완료 ---> 처리
//            String pwd = String.copyValueOf(pf.getPassword());
//            if (pwd.equals(PWD)) {
//                JOptionPane.showMessageDialog(this, id + "님이 로그인 되었습니다");
//            } else {
//                JOptionPane.showMessageDialog(this, "패스워드가 틀립니다");
//                tf.setText("");
//                pf.setText("");
//                tf.requestFocus();
//            }
//        }
//        else if (e.getSource() == b2) {
//            System.exit(0);
//        }
//
//    }
//}