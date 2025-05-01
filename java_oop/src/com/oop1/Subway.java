package com.oop1;

public class Subway {

    private int subwayNumber;
    private int count;
    private int money;

    // 생성자
    public Subway(int subwayNumber) {
        this.subwayNumber = subwayNumber;
    }

    // 승객을 태우다
    public void take(int money) {
        this.money += money;
        count++;
    }

    // 상태창
    public void showInfo() {
        System.out.println("지하철 번호 : " + subwayNumber);
        System.out.println("승객 수 : " + count);
        System.out.println("지하철 수익금 : " + money);
    }

}
