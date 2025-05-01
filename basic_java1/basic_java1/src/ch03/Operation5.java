package ch03;

/**
 * 논리 연산자 &&, ||, !
 * 비교 연산자(<, <= ...)와 함께 많이 사용 된다.
 * 연산의 결과가 true, false 로 반환 된다.
 */
public class Operation5 {

    // 메인 함수 (코드의 진입점)
    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 200;

        // 1. 논리 곱 ( && )
        //                    t    &&    t
        boolean result1 = (n1 > 0) && (n2 > 0);
        System.out.println("result1 : " + result1);

        //                    t    &&    f
        boolean result2 = (n1 > 0) && (n2 < 0);
        System.out.println("result2 : " + result2);

        // 2. 논리합 ( || )
        //                    t    ||     f
        boolean result3 = (n1 > 0) || (n2 < 0);
        System.out.println("result3 : " + result3);
        //                    f    ||     f
        boolean result4 = (n1 < 0) || (n2 < 0);
        System.out.println("result4 : " + result4);

        // 부정 ( ! )
        System.out.println("부정 연산 확인 : " + !result4);

        // 로깅 -> 값을 확인 해본다.
        System.out.println("실제 변수 값 확인 : " + result4);

    } // end of main
} // end of class
