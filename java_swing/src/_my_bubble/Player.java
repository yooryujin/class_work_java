package _my_bubble;

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

    // 벽에 충돌한 상태
    private boolean leftWallCrash;
    private boolean rightWallCrash;

    // setter 메서드
    public void setLeft(boolean left) {this.left = left;}
    public void setRight(boolean right) {this.right = right;}

    @Override
    public int getX() {
        return x;
    }

    public boolean isRightWallCrash() {
        return rightWallCrash;
    }

    @Override
    public int getY() {
        return y;
    }

    public ImageIcon getPlayerL() {
        return playerL;
    }

    public ImageIcon getPlayerR() {
        return playerR;
    }

    public ImageIcon getPlayerJ() {
        return playerJ;
    }

    public int getSPEED() {
        return SPEED;
    }

    public int getJUMP_SPEED() {
        return JUMP_SPEED;
    }

    public boolean isLeft() {
        return left;
    }

    public boolean isRight() {
        return right;
    }

    public boolean isUp() {
        return up;
    }

    public boolean isDown() {
        return down;
    }

    public boolean isLeftWallCrash() {
        return leftWallCrash;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPlayerR(ImageIcon playerR) {
        this.playerR = playerR;
    }

    public void setPlayerL(ImageIcon playerL) {
        this.playerL = playerL;
    }

    public void setPlayerJ(ImageIcon playerJ) {
        this.playerJ = playerJ;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public void setLeftWallCrash(boolean leftWallCrash) {
        this.leftWallCrash = leftWallCrash;
    }

    public void setRightWallCrash(boolean rightWallCrash) {
        this.rightWallCrash = rightWallCrash;
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
                } // end of while
            } // end of run
        }).start(); // end of Thread
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
                } // end of while
            } // end of run
        }).start(); // end of Thread
    }

    @Override
    public void up() {
        System.out.println("player up() 메서드 호출 됨");
        up = true;
        setIcon(playerR);
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 130 / JUMP_SPEED; i++) {
                    y = y - JUMP_SPEED;
                    setLocation(x,y);
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } // end of for
                up = false;
                down();
            } // end of run

        }).start();

    }

    @Override
    public void down() {

    }
}
