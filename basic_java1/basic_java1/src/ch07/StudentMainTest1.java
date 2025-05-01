package ch07;

// 코드를 실행하는 측
public class StudentMainTest1 {

    // 코드의 진입점
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.studentId = 1;
        s1.studentName = "티모";
        s1.address = "푸른언덕";

        Student s2 = new Student();
        s2.studentId = 2;
        s2.studentName = "샤코";
        s2.address = "붉은언덕";

        // 객체에 동작을 시켜보자
        s1.showInfo();
        s2.showInfo();
        System.out.println("-----------------");
        s1.study();
        s2.study();
        System.out.println("-----------------");
        s1.breakTime();
        s2.breakTime();
        System.out.println("-----------------");
        s1.test();
        s2.test();
        System.out.println("-----------------");
        s1.cleanUp();
        s2.cleanUp();

    } //end of main
}
