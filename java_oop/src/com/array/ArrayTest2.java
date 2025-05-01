package com.array;

public class ArrayTest2 {

    public static void main(String[] args) {

        char[] alphabet = new char[26];

        // char 타입은 원래 정수 값이다.
        // 컴퓨터는 0,1 이진수로 데이터를 표현한다.
        // 문자, 문자열을 아주 많이 다루고 있다.
        // 컴퓨터에서 문자를 표현하기 위해서 문자표라는 것을 사용한다.
        // 아스키코드, EUC-KR, 유니코드 문자표를 전세계 공통으로 사용하기 위해 만들었다.
        // 아스키 코드는 1바이트 안에 하나의 문자를 다 표현할 수 있다.
        // [][][][][][][][] <-- 정수 0 ~ 127

        alphabet[0] = 'A'; // -> 정수값 65
        System.out.println((int) alphabet[0]); // -> 강제형변환을 통해 확인 가능

        alphabet[1] = 'B'; // -> 정수값 66
        System.out.println((int) alphabet[1]);

        // 인코딩
        // 문자를 컴퓨터가 이해할 수 있는 숫자(코드값)로 바꾸는 과정을 말한다.
        int code1 = (int) 'A'; // -> 인코딩

        // 디코딩
        // 숫자(코드값)를 사람이 읽을 수 있는 문자로 바꾸는 과정을 말한다.
        char code2 = (char) 66; // -> 디코딩

        // 반복문을 통해서 알파벳 A ~ Z 출력
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        System.out.println("---------------------------------");
        for (int i = 0; i < alphabet.length; i++) {
            System.out.println(alphabet[i]);
        }
    } // end of main

} // end of class
