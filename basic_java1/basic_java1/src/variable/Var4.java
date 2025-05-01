package variable;

public class Var4 {
    // 코드의 진입점
    public static void main(String[] args) {

        // 변수
        // 변수를 선언했다. 변수에 값을 넣다. 변수를 사용할 수 있다.
        // 변수를 선언했을 때 ---> 이름 짓기

        // 변수를 만들 때 규칙이 있다.

        // 1. 규칙
        // 대소문자를 명확히 구분하면 길이에 제한이 없다.
        int age = 10;
        int AGE = 20;
        int aGe = 30;
        // 참고 -> 같은 파일에 같은 이름의 변수를 선언할 수 없다.
        //int age;

        // 2. 규칙
        // 자바에서 사용하는 예약어는 사용할 수 없다.
        // int if = 10; if는 예약어라서 변수 이름으로 사용할 수 없다.
        // int, double, char, for, while, if

        // 3. 규칙
        // 변수 이름은 숫자로 시작할 수 없다.
        // int 30age;
        // int 5age;
        int tel30box; // 단어 중간에 숫자 또는 끝에는 사용이 가능하다.

        // 4. 규칙
        // 특수 문자는 _(언더바), $(달러) 표기만 사용 가능하다.
        int _count;
        int $tel;
        //int !abc; 사용불가
        int count_10;
        int $_tel;

        // 권장사항
        // 표기법
        // xxx.java 파일을 만들 때
        // 대문자로 시작하고 다음 단어는 소문자로 진행 그리고 연결의 단어 시작은 대문자로 작성
        // HelloJava.java (파일을 만들 때 표기법) - 파스칼 케이스

        // int telBox 변수를 선언할 때 표기법
        // 단어 시작은 소문자로 시작하고 연결어 단어 시작은 대문자로 시작한다.
        // 카멜 케이스로 작성한다.

    } // end of main

} // end of class
