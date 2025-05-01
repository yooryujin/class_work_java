package exercise;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        // 스캐너 도구를 사용해서
        // 뺄셈, 곱셈, 나눗셈 연산하는 프로그램을 직접 만들어보자.
        // 사용자에게 값 2개를 연산 하시오.

        Scanner sc = new Scanner(System.in);
        System.out.printf("1. 정수 값을 입력하시오 : ");
        int a = sc.nextInt();
        System.out.println(); // 줄 내림

        System.out.printf("2. 정수 값을 입력하시오 : ");
        int b = sc.nextInt();
        System.out.println(); // 줄 내림

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("값 : " + (a - b));
        System.out.println("값 : " + (a * b));
        System.out.println("값 : " + (a / b));

    } // end of main
} // end of class
