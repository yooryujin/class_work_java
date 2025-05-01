package exercise;

public class Exercise4 {

    public static void main(String[] args) {

        // 59.99 달러
        // 30% 할인된 가격을 출력하시오

//        1. 제품의 원래 가격과 할인율을 상수로 선언하십시오.
        final double A = 59.99;
        final double B = 0.30; // 30% -> 퍼센트 100분의 --> 30 / 100 --> 0.30
//        2. 할인된 가격을 계산하고, 그 결과를 정수로 형변환하여 최종 가격을 구하십시오.
//       할인된 가격 = 원가 × (1 − 할인율)
        double c = A * (1 - B);
//        3. 최종 가격을 출력하십시오.
        System.out.println((int) c);

    } //end of main
} // end of class
