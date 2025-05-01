package com._static;

public class PrinterTest1 {

    public static void main(String[] args) {

        int a = 10;
        //static int b = 20; // class area(또는 method area 라고 부름) 영역에 포함된다.
        //static 변수는 태양이다!
        // 순서가 있다.

        NumberPrinter n1 = new NumberPrinter(1);
        NumberPrinter n2 = new NumberPrinter(2);

        n1.printWaitNumber();
        n2.printWaitNumber();
        n1.printWaitNumber();
        n2.printWaitNumber();
        n1.printWaitNumber();
        n2.printWaitNumber();

    } // end of main

} //end of class
