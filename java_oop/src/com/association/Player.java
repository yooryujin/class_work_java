package com.association;

public class Player {

    private String name;
    private Team team;

    public Player(String name) {
        this.name = name;
        team = null;
    }

    // 팀에 들어가다.
    public void join(Team team1) {
        this.team = team;
        System.out.println(name + "이(가) " + team.getName() + "에 입단합니다.");
    }

    // 팀에서 나오다.
    public void withDraw(Team team) {
        if (this.team == null) {
            System.out.println("해당 팀의 선수가 아닙니다.");
        } else {
            System.out.println(name + "이(가) " + team.getName() + "을 탈퇴합니다.");
            this.team = null;
        }
    }

    // 선수 정보
    public void showInfo() {
        if (this.team != null) {
            System.out.println(name + "이(가) " + this.team.getName() + "팀에 있습니다.");
        } else {
            System.out.println("팀에 입단되어 있지 않습니다.");
        }
    }
}
