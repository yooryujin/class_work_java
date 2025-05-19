package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author 유류진
 *  데이터 베이스 연결을 관리하는 유틸리티 클래스
 */
public class DatabaseUtil {
    // "jdbc:mysql://localhost:3306/mydatabase?serverTimezone=Asia/Seoul";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/library?serverTimeZone=Asia/Seoul";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "asd1234";

    // 데이터 베이스 연결 객체 a 를 반환 하는 함수
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

}
