package exercise;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. 등록 2. 조회 3. 수정 4. 삭제 0. 종료");
            int a = sc.nextInt();
            if (a == 1) {
                System.out.println("등록 선택");
            } else if (a == 2) {
                System.out.println("조회 선택");
            } else if (a == 3) {
                System.out.println("수정 선택");
            } else if (a == 4) {
                System.out.println("삭제 선택");
            } else if (a == 5) {
                System.out.println("프로그램 종료");
                break;
            }
        }
    } //end of main
} // end of class
