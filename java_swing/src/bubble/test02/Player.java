package bubble.test02;

import javax.swing.*;

public class Player extends JLabel implements Moveable {

    private int x;
    private int y;

    private ImageIcon playerR;
    private ImageIcon playerL;
    private ImageIcon playerJ;

    // 플레이어의 속도 상태
    private final int SPEED = 4;
    private final int JUMP_SPEED = 2;

    // 플레이어의 움직인 상태
    private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;

    // setter 메서드
    public void setLeft(boolean left) {
        this.left = left;
    }
    public void setRight(boolean right) {
        this.right = right;
    }
    public void setUp(boolean up) {
        this.up = up;
    }

    public Player() {
        initData();
        setInitLayout();
    }

    private void initData() {

        playerR = new ImageIcon("img/playerR.png");
        playerL = new ImageIcon("img/playerL.png");
        // 플레이어 초기 상태 설정
        x = 55;
        y = 535;

        left = false;
        right = false;
        up = false;
        down = false;
    }

    private void setInitLayout() {

        setSize(50,50);
        setIcon(playerR);
        setLocation(x,y);
    }


    @Override
    public void left() {
        left = true;
        setIcon(playerL);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (left) {
                    x = x - SPEED;
                    setLocation(x,y);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
    }

    @Override
    public void right() {
        right = true; // 움직임 상태값 변경
        setIcon(playerR);
        // 익명 클래스 - thread.start() ---> run() 메서드 안에 구문 동작된다.
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (right) {
                    x = x + SPEED;
                    setLocation(x,y);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
    }

    @Override
    public void up() {
        System.out.println("점프!");
        up = true;
        setIcon(playerR);
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < (65 / JUMP_SPEED); i++) {
                    y = y - JUMP_SPEED;
                    setLocation(x,y);
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e); // 예외를 발생키시는거는 알겠어 근데 printStackTrace(); 써서 에러로그 확실히 보면 안될까?
                    }
                } // end of for
                // 객체의 상태값을 잘 조절해야 한다.
                up = false;
                down();
            }
        }).start();

    }

    @Override
    public void down() {
        System.out.println("다운!");
        down = true;
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < (65 / JUMP_SPEED); i++) {
                    y = y + JUMP_SPEED;
                    setLocation(x,y);
                    try {
                        Thread.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace(); //
                    }
                }
            }
        }).start();
        // 상태 처리
        down = false;

    }
}
