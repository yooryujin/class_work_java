package com._static;

import com.dot.C;

// 신용카드
public class Card {

    private static int cardSerialNumber = 123;

    private int cardNumber;
    private String name;

    public Card(String name) {
        this.name = name;
        cardNumber = Card.cardSerialNumber;
        cardSerialNumber++;
    }

    //메인함수
    public static void main(String[] args) {
        // 코드 테스트는 여기서 해주세요

        Card c1 = new Card("우리카드1");
        Card c2 = new Card("우리카드2");
        Card c3 = new Card("우리카드3");

        System.out.println("우리카드1 : " + c1.cardNumber);
        System.out.println("우리카드2 : " + c2.cardNumber);
        System.out.println("우리카드3 : " + c3.cardNumber);
    }
}
