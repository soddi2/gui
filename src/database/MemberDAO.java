package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import oracle.net.nt.ConnectDescription;

public class MemberDAO {
	//드라이버 클래스 로드
	static{
		try {
			Class.forName("oracle.jdbc.OracleDriver");
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
	public Vector<MemberVO> getList() {
		Vector<MemberVO> vecList = new Vector<MemberVO>();
	
		String sql = "select * from memberTBL";
		
		try(Connection con =  getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery()) {
			
			while(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setAge(rs.getInt(3));
				vo.setGender(rs.getString(4));
				vecList.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vecList;
	}
	
	public int insert(MemberVO vo) { //1.로드 2.커넥션 3.그 다음 인설트 등등
		String sql = "insert into memberTBL values(member_seq.nextval,?,?,?)";
		int result=0;
		
		try ( Connection con = getConnection();
			  PreparedStatement pstmt = con.prepareStatement(sql) //PreparedStatement 서버로 쿼리 문장 전송
					  ){
				  
				  pstmt.setString(1,vo.getName());
				  pstmt.setInt(2,vo.getAge());
				  pstmt.setString(3,vo.getGender());    //int로 넘어 오는 값을 받기 위한 작업
				  
				  result = pstmt.executeUpdate();
			  
		} catch (Exception e) {
			e.printStackTrace();
			}
		return result;
		
	}
	//no에 해당하는 레코드 가져오기
	public MemberVO getRow(int no) {
		String sql = "select * from memberTBL where no = ?";
		MemberVO vo = null;
		
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql); //자동으로 닫아 주는 코드
			) {
			
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();	//오라클에서 결과값이 나오는 칸에 있는 내용?
			if(rs.next()) { // 여러개 나올 확률이 있을땐 while  하나만 나올시에는 if
				vo=new MemberVO();
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getInt(3));
				vo.setGender(rs.getString("gender")); //리절트 셋에 내용을 자바에 옮겨 담는 작업
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		} //finally 구문은 생략
		return vo;
	}
	//no 값을 이용해서 회원 삭제하기
	// delete from memberTBL where no=?
	
	public int remove(int no) {
		int result = 0;
		String sql = "delete from memberTBL where no=?";
		
		
		try(Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)
						) {
			
				pstmt.setInt(1, no);
				result = pstmt.executeUpdate();
				
				
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}












































