package my_test;

public class MyTest2 {

    public static void main(String[] args) {

        // 함수 연습

        int aResult1 = a(10,20);
        System.out.println(aResult1);
        int bResult1 = b(2,5);
        System.out.println(bResult1);


    } //end of main

    // 덧셈
    static int a(int a1, int a2) {
    return a1 + a2;
    }

    // 곱셈
    static int b(int b1, int b2){
        return b1 * b2;
    }

    // 콘솔창에 문자열 출력
    static void c(double price){
        System.out.println("딸기 금액 : " + price);
    }
}
