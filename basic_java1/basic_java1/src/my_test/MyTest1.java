package my_test;

public class MyTest1 {

    public static void main(String[] args) {

        // 이전 배웠던 내용 + 복합 대입연산자 활용해서 직접 문제를 만들고 결과를 확인해 봅시다.

        // 고정지출 건물 월세 500 관리비 30
        // 매달 수입과 알바비는 변경된다.
        // 1월 수입 2000 알바비 70
        // 2월 수입 2800 알바비 80

        final double A = 500 + 30;
        double b = 70;
        double c = 2000;
        c -= A + b;
        System.out.println(c);

        c += 2800;
        b = 80;
        c -= A + b;
        System.out.println(c);

    } // end of main

} // end of class
