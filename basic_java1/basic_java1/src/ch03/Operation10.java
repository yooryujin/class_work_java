package ch03;

public class Operation10 {

    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 500;

        int max;
        // T --> 결과 1을 반환 / F --> 결과 2를 반환
        //        F
        //    100 > 500 ? 100 : 500;
        max = (n1 > n2) ? n1 : n2;
        System.out.println("max : " + max);

    } // end of main
} // end of class
