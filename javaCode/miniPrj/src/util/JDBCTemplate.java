package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class JDBCTemplate {
	public static final Scanner SC = new Scanner(System.in);
			
	public static Connection getConn() throws Exception {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		// 계정에 따라 id 값 바꿔서 하기
		String id = "C##KH";
		String pwd = "1234";
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, id, pwd);
		
		conn.setAutoCommit(false);
		
		return conn;
	} // getConn
} // class
