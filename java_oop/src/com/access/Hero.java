package com.access;

public class Hero {

    private String name;
    private int hp;
    private int power;
    private double defence;
    private boolean isDie;

    // getter 5개 만들어주세요
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    public double getDefence() {
        return defence;
    }

    public boolean getIsDie() {
        return isDie;
    }

    // setter 5개 만들어주세요
    public void setName(String n) {
        name = n;
    }

    public void setHp(int h) {
        // 방어적 코드 작성
        if (h < 0) {
            System.out.println("0 이하 값을 넣을 수 없습니다.");
        } else {
            hp = h;
        }
    }

    public void setPower(int p) {
        power = p;
    }

    public void setDefence(double d) {
        defence = d;
    }

    public void setIsDie(boolean i) {
        isDie = i;
    }

}
