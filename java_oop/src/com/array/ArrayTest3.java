package com.array;

import java.util.Random;

public class ArrayTest3 {

    public static void main(String[] args) {

        // 난수 발생 기능 - 랜덤 숫자 하나 만들어주는 도구
        // 자바 개발자들이 미리 만들어준 기능
        Random random = new Random();
        // 문서 <-- 구글링 <-- AI 활용
        // 0 ~ 44 까지 랜덤한 숫자를 하나 발생해 준다.
        // 1 ~ 45

        // 배열과 for 문을 활용해서 코드를 수정해주세요
        int ranInt1 = random.nextInt(45) + 1;
        int ranInt2 = random.nextInt(45) + 1;
        int ranInt3 = random.nextInt(45) + 1;
        int ranInt4 = random.nextInt(45) + 1;
        int ranInt5 = random.nextInt(45) + 1;
        int ranInt6 = random.nextInt(45) + 1;

        int[] number = new int[6];


        for(int i = 0; i < number.length; i++){
            // i : 0
            // i : 1
            // i : 2
            // i : 3
            // i : 4
            // i : 5
            number[i] = random.nextInt(45) + 1;
        }
        // [4][13][1][4][2][44]

        for (int i = 0; i < number.length; i++){
            System.out.println(number[i]);
        }
//        System.out.println(number[0]);
//        System.out.println(number[1]);
//        System.out.println(number[2]);
//        System.out.println(number[3]);
//        System.out.println(number[4]);
//        System.out.println(number[5]);

    } // end of main

} // end of class
