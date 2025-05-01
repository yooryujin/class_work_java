package com._abstract;

public abstract class Computer {

    public abstract void display();

    public abstract void typing();

    public void turnOn() {
        System.out.println("전원을 켭니다");
    }

    public void turnOf() {
        System.out.println("전원을 끕니다");
    }
}
