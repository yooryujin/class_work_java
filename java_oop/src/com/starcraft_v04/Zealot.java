package com.starcraft_v04;

/**
 * @author 위희수
 */
public class Zealot extends Unit {

    int dp;

    // 생성자
    public Zealot(String name) {
        super.name = name;
        super.power = 5; // 기본값 설정
        super.hp = 80;// 기본값 설정
        dp = 50;
    }
}
