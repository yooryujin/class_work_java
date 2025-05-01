package com.starcraft_v04;

public class GameTest1 {

    public static void main(String[] args) {

        // 실행의 흐름 만들어보기
        // 배열, 객체, for, 질럿만의 속성... 다형성 확인

        Unit[] units = new Unit[9];
        units[0] = new Zealot("질럿1");
        units[1] = new Zergling("저글링1");
        units[2] = new Marine("마린1");
        units[3] = new Zealot("질럿2");
        units[4] = new Zergling("저글링2");
        units[5] = new Marine("마린2");

        Marine enemy = new Marine("적군");

        for (int i = 0; i < units.length; i++) {
            if (units[i] != null) {
                units[i].showInfo();
                if (units[i] instanceof Zealot) {
                    int dp = ((Zealot) units[i]).dp;
                    System.out.println(dp);
                }
                units[i].attack(enemy);
            }
        }

        for (int i = 0; i < units.length; i++) {
            units[0].attack(units[1]);
            units[1].showInfo();
        }

    } // end of main
}
