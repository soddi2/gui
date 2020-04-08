package container;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameTest5 extends JFrame {
	
	public JFrameTest5() {
		setTitle("다섯번째 프로그램");
		setBounds(200,300,100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//컴포넌트 생성하기
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("열기");
		JButton btn2 = new JButton("저장");
		JCheckBox check = new JCheckBox("GUI 프로그래밍");
		JColorChooser chooser = new JColorChooser();
		
		//컴포넌트 부착  - JPnel
		panel.add(btn1);
		panel.add(btn2);
		panel.add(check);
		panel.add(chooser);
		
		add(panel); //JPanel을 다시 Frame에 부착
		
	}
	
	public static void main(String[] args) {
		//컨테이너 생성하기
		JFrameTest5 f = new JFrameTest5();
	
		
	}
}

		

