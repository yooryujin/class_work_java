package com.method;

public class CoffeeMachineMain {

    public static void main(String[] args) {

        // 커피머신 객체 생성 -> 인스턴스화 --> 인스턴스 (객체)
        CoffeeMachine machine1 = new CoffeeMachine();

        // 재료 채우기 동작을 시켜 보자 (물, 원두)
//        machine1.refillWater(200); // 200 <- 인수
//        machine1.refillCoffee(30);
        System.out.println("----------------");

        // 사용자 정의 생성자 사용하는 문법
        CoffeeMachine machine2 = new CoffeeMachine(200, 30);


        // 커피 만들기 테스트
        System.out.println("커피 주문!");
        String result = machine2.makeCoffee();
        System.out.println("머신 1 : " + result);
        // 또 커피 주문
        System.out.println("또 커피 주문!");
        System.out.println("머신 1 : " + machine2.makeCoffee());
        // 또 커피 주문 (재료 부족 테스트)
        System.out.println("마지막 커피 주문!");
        System.out.println(machine2.makeCoffee());

    } // end of main
}
