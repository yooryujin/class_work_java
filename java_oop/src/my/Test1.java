package my;

public class Test1 {
    public static void main(String[] args) {


        // for 문법
        // 변수를 값으로 치환 하는 --
        // 예제 - 스스로 응용 !
        // boolean = 10
        // for
        boolean[] checkBox = new boolean[3];
        checkBox[0] = true;
        checkBox[1] = false;
        checkBox[2] = true;

        System.out.println(checkBox[0]);
        System.out.println(checkBox[1]);
        System.out.println(checkBox[2]);

        for(int i = 0; i < checkBox.length; i++) {
            System.out.println(checkBox[i]);
        }




    }
}
