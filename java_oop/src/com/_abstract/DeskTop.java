package com._abstract;

public class DeskTop extends Computer {

    @Override
    public void display() {
        System.out.println("화면을 띄우다");
    }

    @Override
    public void typing() {
        System.out.println("입력하다");
    }
}
