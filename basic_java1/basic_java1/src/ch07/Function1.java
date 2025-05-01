package ch07;

public class Function1 {

    // 함수를 만들어보자 (함수를 설계하는 코드)
    // 함수를 만들기 위해서는 당연히 머리 속에 어떻게 코드를 만들지 들어가 있어야 한다.
    // 두 개의 정수값을 받아서 덧셈 연산을 하고 그 결과를 반환하는 함수를 만들어보자.

    // static -> 아직 생략
    // int <-- 반환될 데이터의 타입
    // add <-- 함수의 이름
    // 괄호(n1, n2) <-- 매개 변수 (파마리터)
    // {....} <-- 함수의 몸체 (body)

    // 기능 묶음 (두 개의 정수값을 받아서 덧셈 연산 하는 함수이다.)
    static int add(int n1, int n2) {
        // int result = n1 + n2;
        // 클래스 바로 아래 쓰는 변수를 - 멤버 변수
        // 함수 안에 선언하는 변수를 - 지역 변수
        int result; // 지역 변수를 선언 - 반드시 초기화 필요하다.
        result = n1 + n2;
        return result;
    }

    static int add2(int n1, int n2, int n3) {
        int result;
        result = n1 + n2 + n3;
        return result;
    }

    static double add3(double d1, double d2) {
        double result = d1 + d2; // 지역 변수 선언과 동시에 초기화(값을 넣다) 했다.
        return result;
    }

    // 함수 -> 콘솔창에 안녕 내 나이는 xx 이야 출력하는 함수를 만들어보자.
    // void -> 텅 빈
    static void sayHello(double myAge) {
        System.out.println("안녕 내 나이는 " + myAge + " 이야");
        // 리턴 타입 void - 반환 값이 없다. 그래서 return 키워드를 사용하지 않아도 된다.

    }

    // 코드 실행 시 진입
    public static void main(String[] args) {

        sayHello(10);
        sayHello(20);

    }

}


