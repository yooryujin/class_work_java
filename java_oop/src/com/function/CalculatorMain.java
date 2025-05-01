package com.function;

/**
 * 함수란? 데이터를 받아서 처리하고 결과를 돌려주는 코드 블록이다.
 * static 을 사용하면 객체 없이 바로 호출 가능 해!
 */
public class CalculatorMain {

    public static void main(String[] args) {
        // 테스트용 숫자
        int num1 = 10;
        int num2 = 5;
        int testNumber = 7;

        // 더하기 함수 호출
        int sum = add(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + sum);

        // 빼기 함수 호출
        int a = subtract(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + a);

        // 곱하기 함수 호출
        int b = multiply(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + b);

        // 나누기 함수 호출
        double c = divide(num1, num2);
        System.out.println(num1 + " / " + num2 + " = " + c);

        // 짝수 판별 함수 호출
        boolean d = isEven(testNumber);
        System.out.println(testNumber + " 은 짝 수 = " + d);

        // 홀수 판별 함수 호출
        boolean e = isOdd(testNumber);
        System.out.println(testNumber + " 은 홀 수 = " + e);
    }

    // 두 숫자를 더하는 함수
    static int add(int a, int b) {
        return a + b; // 입력받은 a와 b를 더하고 반환
    }

    //  두 숫자를 빼는 함수
    static int subtract(int a, int b) {
        return a - b; // 입력받은 a에서 b를 빼서 반환
    }

    // 두 숫자를 곱하는 함수
    static int multiply(int a, int b) {
        return a * b; // 입력받은 a와 b를 곱해서 반환
    }

    // 두 숫자를 나누는 함수
    static double divide(int a, int b) {
        // 방어적 코드를 잘 작성해야 한다.
        if (b == 0) {
            System.out.println("0 으로 나눌 수 없습니다.");
            return 0;
        }
        return (double) a / b;
    }

    // 짝수인지 판별하는 함수 - 매개변수 1
    static boolean isEven(int number) {
        return number % 2 == 0; // 나머지가 0이면 짝수 -> true, 아니라면 false
    }

    // 홀수인지 판별하는 함수 - 매개변수 1
    static boolean isOdd(int number) {
        return number % 2 != 0; // 나머지가 0이 아니면 홀수 -> true
    }

}

