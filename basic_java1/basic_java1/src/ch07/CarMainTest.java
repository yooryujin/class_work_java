package ch07;

public class CarMainTest {

    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car();
        System.out.println(c1);
        System.out.println(c2);
        c1.color = "white";
        c1.modelYear = 2021;
        c1.price = 40_000_000;
        System.out.println(c1.color);
        System.out.println(c1.modelYear);
        System.out.println(c1.price);
        c2.color = "black";
        c2.modelYear = 2025;
        c2.price = 100_000_000;
        System.out.println(c2.color);
        System.out.println(c2.modelYear);
        System.out.println(c2.price);
    }
}
