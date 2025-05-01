package ch03;

/**
 * 비교 연산자
 * 연산의 결과값은 true, false 로 반환 된다.
 */
public class Operation3 {

    // 메인 함수 (코드의 진입점)
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 5;

        // 비교 연산자를 생각할 때
        // 비교 연산자 자체를 주어로 바라보자.
        //               10 < 5
        boolean result = n1 < n2;
        System.out.println(result);
        //                 10 > 5
        System.out.println(n1 > n2);
        System.out.println(n1 >= n2);
        System.out.println(n1 <= n2);
        System.out.println(100 <= 100);
        System.out.println(100 == 100);
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
        System.out.println(20 != 20);

    } // end of main
} // end of class
