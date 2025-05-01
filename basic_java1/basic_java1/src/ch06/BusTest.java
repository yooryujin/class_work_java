package ch06;

public class BusTest {

    public static void main(String[] args) {

        Bus b1 = new Bus();
        b1.color = "초록색";
        b1.area = "시내";
        b1.charge = 1300;
        b1.busNumber = 81;
        b1.dispatchTime = 20;

        Bus b2 = new Bus();
        b2.color = "파란색";
        b2.area = "시외";
        b2.charge = 2400;
        b2.busNumber = 125;
        b2.dispatchTime = 30;

    }
}
