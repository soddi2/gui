package exam;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InterRest extends JFrame implements ActionListener {
	
	private JLabel lab1;
	private JTextField fi1; 
	private JLabel lab2;
	private JTextField fi2;
	private JButton btn1;
	private JTextField fi3;
	
	public InterRest() {
		setSize(300, 170);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이자 계산기");
		setVisible(true);
		setLocationRelativeTo(null);
//		setLayout(new FlowLayout(FlowLayout.LEFT,15,0));
//		setResizable(false);
	
		JPanel totalpane = new JPanel();
//		totalpane.setLayout(new GridLayout(40,0));
		
		lab1 = new JLabel("원금 입력");
		fi1 = new JTextField(10);
		lab2 = new JLabel("이율 입력");
		fi2 = new JTextField(10);
		
		btn1 = new JButton("변환");
		btn1.addActionListener(this);
		
		fi3 = new JTextField(20);
		
		totalpane.add(lab1);
		totalpane.add(fi1);
		totalpane.add(lab2);
		totalpane.add(fi2);
		totalpane.add(btn1);
		totalpane.add(fi3);
	
		add(totalpane);
		pack();
	}
	
	
	public static void main(String[] args) {
		InterRest in = new InterRest();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			
			int op1 = Integer.parseInt(fi1.getText());
			Double op2 = Double.parseDouble(fi2.getText());
			
			fi3.setText(String.valueOf(op1/op2));
			
		}
		
	}

}























