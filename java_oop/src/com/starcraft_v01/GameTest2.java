package com.starcraft_v01;

import java.util.Scanner;

public class GameTest2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Zealot zealot1 = new Zealot("질럿1");
        Zergling zergling1 = new Zergling("저글링1");
        Marine marine1 = new Marine("마린1");

        while (true) {
            System.out.println("1. 질럿 2. 저글링 3. 마린 을 선택해주세요 0. 종료");
            int test = scanner.nextInt();
            if (test == 1) {
                System.out.println("누구를 공격하시겠습니까? 1. 저글링 2. 마린");
                int target = scanner.nextInt();
                if (target == 1) {
                    zealot1.attackZergling(zergling1);
                } else if (target == 2) {
                    zealot1.attackMarine(marine1);
                }
            } else if (test == 2) {
                System.out.println("누구를 공격하시겠습니까? 1. 질럿 2. 마린");
                int target = scanner.nextInt();
                if (target == 1) {
                    zergling1.attackZealot(zealot1);
                } else if (target == 2) {
                    zergling1.attackMarine(marine1);
                }
            } else if (test == 3) {
                System.out.println("누구를 공격하시겠습니까? 1. 질럿 2. 저글링");
                int target = scanner.nextInt();
                if (target == 1) {
                    marine1.attackZealot(zealot1);
                } else if (target == 2) {
                    marine1.attackZergling(zergling1);
                }
            } else if (test == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 선택 입니다.");
            }
        }
    }
}