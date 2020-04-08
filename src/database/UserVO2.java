package database;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class UserVO2 { //오라클 userTBl 연동
	private int no;
	private String username;
	private int birthYear;
	private String addr;
	private String mobile;
	
}
