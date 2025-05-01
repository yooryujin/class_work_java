package my;

import com.books.Book;

import java.util.Scanner;

public class MyBookStore {

    static int currentBookIndex = 4;

    public static void main(String[] args) {

        // 도서관리
        // 1.저장 2.전체조회 3.선택조회 4.전체삭제 5.종료

        Scanner scanner = new Scanner(System.in);

        Book[] books = new Book[10];

        boolean flag = true;

        // 샘플 데이터 미리 만들어 두기
        books[0] = new Book("플러터UI실전", "김근호");
        books[1] = new Book("무궁화꽃이피었습니다", "김진명");
        books[2] = new Book("흐르는강물처럼", "파울로코엘료");
        books[3] = new Book("리딩으로리드하라", "이지성");

        final String SAVE = "1";
        final String SEARCH_ALL = "2";
        final String SEARCH_BY_TITLE = "3";
        final String DELETE_ALL = "4";
        final String END = "5";

        while (flag) {
            System.out.println("!! 메뉴 선택 !!");
            System.out.println("1.저장 2.전체조회 3.선택조회 4.전체삭제 5.종료");
            String number = scanner.nextLine();
            if (number.equals(SAVE)) {
                System.out.println(">> 저장하기 <<");
                save(scanner, books);

            } else if (number.equals(SEARCH_ALL)) {
                System.out.println(">> 전체조회 <<");
                readAll(books);

            } else if (number.equals(SEARCH_BY_TITLE)) {
                System.out.println(">> 책 제목으로 조회 <<");
                readByTitle(scanner, books);

            } else if (number.equals(DELETE_ALL)) {
                System.out.println(">> 전체삭제 <<");
                deleteAll(books);

            } else if (number.equals(END)) {
                System.out.println(">> 종료 <<");
                flag = false;

            } else {
                System.out.println("잘못된 선택입니다");
            }
        }

    } // end of main

    // 함수 만들기
    // 1. 저장하기
    public static void save(Scanner scanner, Book[] books) {
        System.out.println("---- save() ----");
        System.out.println("책 제목을 입력하세요");
        String title = scanner.nextLine();
        System.out.println("저자를 입력하세요");
        String author = scanner.nextLine();
        Book book = new Book(title, author);
        if (currentBookIndex > books.length) {
            System.out.println("더이상 저장할 공간이 없습니다.");
            return;
        }
        books[currentBookIndex] = book;
        currentBookIndex++;
    }

    // 2. 전체조회하기
    public static void readAll(Book[] books) {
        System.out.println("---- readAll() ----");
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].getTitle() + ", " + books[i].getAuthor());
            }
        }
    }

    // 3. 책 제목으로 조회하기
    public static void readByTitle(Scanner scanner, Book[] books) {
        System.out.println("---- readByTitle ----");
        System.out.println(">> 책 제목을 입력해주세요 <<");
        String title = scanner.nextLine();
        boolean isFind = false;

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                if (books[i].getTitle().equals(title.trim())) {
                    System.out.println(books[i].getTitle() + ", " + books[i].getAuthor());
                    isFind = true;
                    break;
                }
            }
        } // end of for
        if (!isFind) {
            System.out.println("해당 제목의 책은 존재하지 않습니다.");
        }
    }

    // 4. 전체삭제
    public static void deleteAll(Book[] books) {
        System.out.println("---- deleteAll() ----");
        for (int i = 0; i < books.length; i++) {
            books[i] = null;
        }
    }

} //end of class
