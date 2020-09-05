package cn.sj.test.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class fifteen_day_jdbc {
    private static final String DBDRIVER = "com.mysql.jdbc.Driver";
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/sys?useSSL=false";
        String username = "root";
        String password = "123456";
        Connection connection = null;

        Class.forName(DBDRIVER);
        connection = DriverManager.getConnection(url,username,password);
        String sql = "INSERT INTO member(mid,name,birthday,age,note) VALUES " +
                " (myseq.nextval,?,?,?,?)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()){
            int mid = rs.getInt(1);
        }
        connection.close();



    }
}
