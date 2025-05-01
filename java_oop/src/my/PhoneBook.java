package my;

import java.util.Scanner;

public class PhoneBook {

    static int phoneIndex = 1;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Phone[] phones = new Phone[100];

        // 샘플 데이터
        phones[0] = new Phone("위희수", "010-0000-0000");

        boolean flag = true;

        final String SAVE = "1";
        final String SEARCH_ALL = "2";
        final String SEARCH_BY_NAME = "3";
        final String REVISE_NUMBER = "4";
        final String DELETE_NUMBER = "5";
        final String END = "0";

        while (flag) {
            System.out.println("---메뉴선택---");
            System.out.println("1.저장 2.조회 3.선택조회 4.수정 5.삭제 0.종료");
            String choice = scanner.nextLine();
            if (choice.equals(SAVE)) {
                System.out.println(">> 저장하기 <<");
                save(scanner, phones);
            } else if (choice.equals(SEARCH_ALL)) {
                System.out.println(">> 조회하기 <<");
                search(scanner, phones);

            } else if (choice.equals(SEARCH_BY_NAME)) {
                System.out.println(">> 이름으로 조회하기 <<");
                searchByName(scanner, phones);

            } else if (choice.equals(REVISE_NUMBER)) {
                System.out.println(">> 전화번호 수정하기 <<");

            } else if (choice.equals(DELETE_NUMBER)) {
                System.out.println(">> 전화번호 삭제하기 <<");

            } else if (choice.equals(END)) {
                System.out.println("프로그램을 종료합니다");

                flag = false;
            } else {
                System.out.println("잘못된 선택 입니다");
            }
        }

    } // end of main

    // 함수 만들기
    //1.저장 - 이름, 전화번호
    public static void save(Scanner scanner, Phone[] phones) {
        System.out.println("--- save() ---");
        System.out.println("이름을 입력하세요");
        String name = scanner.nextLine();
        System.out.println("전화번호를 입력하세요");
        String phoneNumber = scanner.nextLine();

        Phone phone = new Phone(name, phoneNumber);

        if (phoneIndex > phones.length) {
            System.out.println("더이상 저장할 공간이 없습니다");
            return;
        }
        phones[phoneIndex] = phone;
        phoneIndex++;
    }

    // 2.조회 - 전체 연락처 조회, 이름으로 조회
    public static void search(Scanner scanner, Phone[] phones) {
        System.out.println("--- search() ---");
        System.out.println("연락처 조회");
        for (int i = 0; i < phones.length; i++) {
            if (phones[i] != null) {
                System.out.println(phones[i].getName() + ", " + phones[i].getPhoneNumber());
            }
            String nameA = scanner.nextLine();
            if (phones[i].getName().equals(nameA.trim())) {
                System.out.println(phones[i].getName() + ", " + phones[i].getPhoneNumber());
                return;
            }
        }
    }


    // 3.선택조회 - 이름 입력 -> 전화번호 출력
    public static void searchByName(Scanner scanner, Phone[] phones) {
        System.out.println("--- searchBySelect() ---");
        System.out.println("이름으로 전화번호 조회");
        String name = scanner.nextLine();

        boolean isFind = false;

        for (int i = 0; i < phones.length; i++) {
            if (phones[i] != null) {
                if (phones[i].getName().equals(name.trim())) {
                    System.out.println(phones[i].getPhoneNumber());
                    isFind = true;
                    break;
                }
            }
        } //end of for


//        // 4.수정 - 기존 연락처 전화번호만 변경
//        public static void revise () {
//            System.out.println("--- revise() ---");
//        }
//
//
//        // 5.삭제 - 입력한 연락처 삭제
//        public static void delete () {
//            System.out.println("--- delete() ---");
        }

    } // end of class
