import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PizzaPanel extends JFrame {

	public PizzaPanel() {
		setSize(500, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("피자 좋아");
		
		JPanel totalpane = new JPanel();
		totalpane.setLayout(new BorderLayout());
		
		//레이아웃 상단
		JPanel topPane = new JPanel();
		JLabel label = new JLabel("피자좋아 피자좋아 피자 좋아");
		topPane.add(label);
		totalpane.add(topPane,BorderLayout.NORTH);
		
		//레이아웃 하단
		JPanel downPane = new JPanel();
		JTextField field = new JTextField(10);
		JLabel ac = new JLabel("개수");
		JButton btn1 = new JButton("어깨피자");
		JButton btn2 = new JButton("허리피자");
		JButton btn3 = new JButton("다피자");
		downPane.add(btn1);
		downPane.add(btn2);
		downPane.add(btn3);
		downPane.add(ac);
		downPane.add(field);
		totalpane.add(downPane,BorderLayout.SOUTH);
		
		add(totalpane);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		PizzaPanel pizza = new PizzaPanel();

	}

}
