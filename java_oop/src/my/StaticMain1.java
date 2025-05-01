package my;

public class StaticMain1 {

    public static void main(String[] args) {

        StaticTest1 s1 = new StaticTest1("안녕");
        StaticTest1 s2 = new StaticTest1("반가워");
        StaticTest1 s3 = new StaticTest1("하이");

        System.out.println(s1.getId());
        System.out.println(s2.getId());
        System.out.println(s3.getId());
        System.out.println(StaticTest1.getIdCounter());
        System.out.println(StaticTest1.totalIdCounter());
    }
}
