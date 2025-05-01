package com._this;

public class UserInfoMainTest {

    public static void main(String[] args) {

        UserInfo userInfo1 = new UserInfo("test1", "test14", "testName", "123-4", "010-0000-0000");

        System.out.println("----------------------");

        // getter
        System.out.println(userInfo1.getUserId());
        System.out.println(userInfo1.getUserPassword());
        System.out.println(userInfo1.getUserName());

        userInfo1.showInfo();
        System.out.println("----------------------");

        // setter
        userInfo1.setUserId("abc");
        userInfo1.setUserPassword("abc123");
        userInfo1.setUserName("abcName");

        // 변경되었는지 확인
        userInfo1.showInfo();

    }

}
