package com.association;

public class MainTest2 {
    public static void main(String[] args) {

        Team team1 = new Team("A");
        Player player = new Player("이름");

        player.join(team1);
        player.showInfo();
        player.withDraw(team1);
        player.showInfo();

    }
}
