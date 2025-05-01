package ch10;

public class GoingToSchool2 {

    // 코드의 진입점
    public static void main(String[] args) {

        // 버스 객체를 3개 생성해 보시오
        Bus b1 = new Bus(81);
        Bus b2 = new Bus(133);
        Bus b3 = new Bus(1004);

        // 학생 객체를 2명 생성해 보시오
        Student s1 = new Student("누누", 10000);
        Student s2 = new Student("티모", 30000);


        // 학생이 버스를 타는 행위를 만들어 보시오
        s1.takeBus(b1);
        s2.takeBus(b3);

        // 버스의 상태 창을 출력해서 결과를 확인해 보시오
        b1.showInfo();
        b2.showInfo();
        b3.showInfo();

        System.out.println("===========================");
        s1.showInfo();
        s2.showInfo();

    } // end of main
}
