package com._this;

/**
 * this. 문법을 왜 사용하는가
 * this() 문법을 왜 사용하는가
 */
public class UserInfo {

    private String userId;
    private String userPassword;
    private String userName;
    private String userAddress;
    private String phoneNumber;

    // 생성자 매개변수 1개 ~ 5개 즉, 생성자 5개 만들어 주세요(생성자 오버로딩)

    public UserInfo(String userId) {
        this.userId = userId;
        System.out.println("1번 생성자 호출");

    }

    public UserInfo(String userId, String userPassword) {
        this(userId);
        this.userPassword = userPassword;
        System.out.println("2번 생성자 호출");

    }

    public UserInfo(String userId, String userPassword, String userName) {
        this(userId, userPassword);
        this.userName = userName;
        System.out.println("3번 생성자 호출");

    }

    public UserInfo(String userId, String userPassword, String userName, String userAddress) {
        this(userId, userPassword, userName);
        this.userAddress = userAddress;
        System.out.println("4번 생성자 호출");

    }

    public UserInfo(String userId, String userPassword, String userName, String userAddress, String phoneNumber) {
        this(userId, userPassword, userName, userAddress);
        this.phoneNumber = phoneNumber;
        System.out.println("5번 생성자 호출");

    }

    // getter 메서드 만들어 주세요
    public String getUserId() {
        return userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // setter 메서드 만들어 주세요
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void showInfo() {
        System.out.println("------유저 정보--------");
        System.out.println("userId : " + userId);
        System.out.println("userPassword : " + userPassword);
        System.out.println("userName : " + userName);
        System.out.println("userAddress : " + userAddress);
        System.out.println("phoneNumber : " + phoneNumber);
    }
}
