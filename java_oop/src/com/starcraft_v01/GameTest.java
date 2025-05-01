package com.starcraft_v01;

import java.util.Scanner;

public class GameTest {

    // 코드의 진입점
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Zealot zealot1 = new Zealot("질럿1");
        Zergling zergling = new Zergling("저글링1");
        Marine marine1 = new Marine("마린1");

        while (true) {
            System.out.println("1. 질럿 2. 마린 3. 저글링 을 선택해주세요 0. 종료");
            int selected = scanner.nextInt();
            if (selected == 1) {
                System.out.println("누구를 공격할래? 1. 마린 2. 저글링");
                int target = scanner.nextInt();
                if(target == 1){
                  zealot1.attackMarine(marine1);
              } else if (target == 2) {
                }
            } else if (selected == 2) {

            } else if (selected == 3) {

            } else if (selected == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("잘못된 선택 입니다.");

            }
        }

        //zealot1.attackZergling();
        zealot1.attackMarine(marine1);
        marine1.showInfo();

    } //end of main

} // end of class
