package pl.coderslab.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

        public static String DB_NAME = "workshop2";
        private static String DB_URL = "jdbc:mysql://localhost:3306/"+DB_NAME+"?useSSL=false&characterEncoding=utf8";
        private static final String DB_USER = "root";
        private static final String DB_PASS = "coderslab";

        public static Connection getConnection() throws SQLException {
            DB_URL = "jdbc:mysql://localhost:3306/"+DB_NAME+"?useSSL=false&characterEncoding=utf8";
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        }


}
