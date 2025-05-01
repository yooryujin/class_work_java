package my;

public class StaticTest1 {

    private static int idCounter = 1;

    private int id;
    private String name;

    // 생성자
    public StaticTest1(String name) {
        this.name = name;
        this.id = StaticTest1.idCounter;
        idCounter++;
    }

    public static int totalIdCounter() {
        return idCounter;
    }

    public void showInfo() {
        System.out.println(idCounter);
        System.out.println(name + "의 학생번호는 " + id + "입니다.");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static int getIdCounter() {
        return idCounter;
    }

}
