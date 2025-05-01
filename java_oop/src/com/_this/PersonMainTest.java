package com._this;

public class PersonMainTest {

    public static void main(String[] args) {

        // 데이터 소문자로 시작 하면 (기본 데이터 타입)  -> 값이 담기는 녀석을 말한다
        // 데이터 대문자로 시작 하면 (참조 타입) -> 실제 heap 객체에 생성된 주소값을 담고 있다.

        // Person p1 = new Person("홍길동", 10, "010-1234-1234");
        Person p1 = new Person("홍길동", 10, "010-1234-1234", "F");

        // 결과 값 --> return this --> com._this.Person@2f4d3709
        System.out.println(p1.getPerson());

    }
}
