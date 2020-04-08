package database;

import java.util.Vector;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class MemberVO {
	//memverTBL 내용 담기
	
	private int no;
	private String name;
	private int age;
	private String gender;
	
}
