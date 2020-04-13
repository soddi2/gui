package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class GameDAO {
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user="javadb";
		String password="12345";
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public Vector<GameVO> getList(){
		Vector<GameVO> vecList = new Vector<GameVO>();
		
		String sql = "select * from gamescore";
		
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery()) {
			
			while(rs.next()) {
				GameVO vo = new GameVO();
				vo.setName(rs.getString(1));
				vo.setScore(rs.getInt(2));
				vecList.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vecList;
	}
	
	public int scoreInsert(GameVO vo) {
		String sql = "insert into gamescore values(?,?)";
		int result = 0;
		
		try(Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)
						) {
			
			pstmt.setString(1, vo.getName());
			pstmt.setInt(2, vo.getScore());
			
			result = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
}





























