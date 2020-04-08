package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.net.nt.ConnectDescription;

public class MemberDAO {
	//드라이버 클래스 로드
	static{
		try {
			Class.forName("oracle.jdbc.oracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//커넥션 연결
	public Connection getConnection() {
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String user="javadb"; //허가 받은 사용자
		String password="12345"; 
		
		Connection con =  null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}
	//데이터베이스 요청 작업
	
}






























