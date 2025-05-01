package com.oop1;

public class Student {

    private String name;
    private int money;

    // 생성자
    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    // 핵심 !! 버스랑 어떻게 상호작용 시킬까?
    public void takeBus(Bus b) {
        b.take(1000);
        this.money -= 1000;
    }

    // 지하철 탑승
    public void takeSubway(Subway s) {
        s.take(2000);
        this.money -= 2000;
    }

    // 상태창
    public void showInfo() {
        System.out.println("학생 이름 : " + name);
        System.out.println("학생 소지금 : " + money);
    }
}
