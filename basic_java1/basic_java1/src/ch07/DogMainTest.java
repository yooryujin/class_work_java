package ch07;

public class DogMainTest {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        Dog d2 = new Dog();
        System.out.println(d1);
        System.out.println(d2);
        d1.name = "짱이";
        d1.age = 5;
        d2.name = "콩이";
        d2.age = 2;
        System.out.println(d1.name);
        System.out.println(d1.age);
        System.out.println(d2.name);
        System.out.println(d2.age);


    }
}
