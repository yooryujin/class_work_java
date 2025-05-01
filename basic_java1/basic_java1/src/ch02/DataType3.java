package ch02;

public class DataType3 {

    public static void main(String[] args) {

        // 데이터 타입 - 실수형
        // 수학적으로 정수가 아닌 숫자를 의미합니다.
        // 예를 들어 3.14, 0.5, 1.55

        // float, double

        // L value = R value
        float floatBox1 = 0.5f; // 접미사
        double doubleBox1 = 0.123;
        // 실수형 기본 연산의 단위는 double 타입이다.

        // R value 기본적인 연산의 단위가 있다 (기본 연산 단위)

        long a = 2200000000L; // 정수형 기본 연산의 단위는 int 형이다.

        // 왜 실수형에서는 4바이트 float 을 기본으로 하지 않고
        // 8바이트 double을 기본 연산의 단위로 사용할까?
        // 소수점의 길이가 더 길수록 정확하기 때문에 8바이트 double을 기본 연산의 단위로 사용

    } // end of main
} // end of class
