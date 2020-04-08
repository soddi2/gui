package exam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConvertMile extends JFrame implements ActionListener  {
	
	private JLabel la1;
	private JTextField fi1;
	private JButton btn1;
	private JTextField fi2;
	
	public ConvertMile() {
		setSize(250, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("마일을 킬로로 변환");
		setVisible(true);
		
		JPanel to = new JPanel();
		
		la1 = new JLabel("거리를 마일로 입력");
		fi1 = new JTextField(10);
		btn1 = new JButton("변환");
		btn1.addActionListener(this);
		fi2 = new JTextField(20);
		
		to.add(la1);
		to.add(fi1);
		to.add(btn1);
		to.add(fi2);
		
		add(to);
		
		pack();
		
	}

	public static void main(String[] args) {
		ConvertMile cm = new ConvertMile();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			
			int op = Integer.parseInt(fi1.getText());
			
			fi2.setText(String.valueOf(op*1.62)+"km");
			
		}
		
	}

}








