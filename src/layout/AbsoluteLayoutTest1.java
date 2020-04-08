package layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AbsoluteLayoutTest1 extends JFrame {
	//절대 위치 (x , y , 컴포넌트 크기)
	public AbsoluteLayoutTest1() {
		
		setTitle("AbsoluteLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JButton btn1 = new JButton("배");
		btn1.setBounds(33, 24, 97, 23);
		panel.add(btn1);
		
		JButton btn2 = new JButton("사과");
		btn1.setBounds(297, 65, 97, 23);
		panel.add(btn2);
		
		JButton btn3 = new JButton("딸기");
		btn1.setBounds(73, 180, 97, 23);
		panel.add(btn3);
		
		add(panel);
	}
	
	
	
	
	public static void main(String[] args) {
		AbsoluteLayoutTest1 absolute = new AbsoluteLayoutTest1();

	}

}
