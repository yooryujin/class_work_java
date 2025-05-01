package ch06;

public class OrkMainTest {

    public static void main(String[] args) {

        Ork ork1 = new Ork();
        ork1.color = "초록색";
        ork1.name = "a";
        ork1.hauntArea = "동쪽";
        ork1.dp = 20;
        ork1.hp = 100;
        ork1.power = 10;
        System.out.println(ork1.color);
        System.out.println(ork1.name);

        Ork ork2 = new Ork();
        ork2.color = "파란색";
        ork2.name = "b";
        ork2.hauntArea = "서쪽";
        ork2.dp = 40;
        ork2.hp = 200;
        ork2.power = 30;
    }
}
