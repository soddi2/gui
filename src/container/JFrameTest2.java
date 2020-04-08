package container;

import java.awt.Frame;

import javax.swing.JFrame;

public class JFrameTest2 {

	public static void main(String[] args) {
		JFrame f = new JFrame("난 왜 안꺼져");
		
		// x 를 누르면 프로그램 종료
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//컨테이너의 크기 지정하기
		f.setSize(300, 300);
		//컨테이너 보여주기
		f.setVisible(true);

	}
}

		

