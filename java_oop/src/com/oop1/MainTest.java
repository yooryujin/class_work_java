package com.oop1;

public class MainTest {

    public static void main(String[] args) {

        Student s1 = new Student("티모", 20_000);
        Bus b1 = new Bus(1004);
        Subway w1 = new Subway(123);

        s1.takeBus(b1);
        s1.showInfo();
        System.out.println("-------------");
        s1.takeSubway(w1);
        s1.showInfo();

    }
}
