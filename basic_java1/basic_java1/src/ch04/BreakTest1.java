package ch04;

public class BreakTest1 {

    public static void main(String[] args) {

        // 10회 반복
        int i;
        for (i = 1; i < 10; i++) {
            // i 값이 7의 소수라면 멈추어라
            // 만약 i 값이 7이라면 반복문을 멈추어라!
            System.out.println("i : " + i);
            if(i % 7 == 0) {
                break;
            }
        } // end of for
        // 반복문이 멈추고 난 후 i 값을 출력해보자
        System.out.println("i 값 확인 : " + i);


    } // end of main
} // end of class
