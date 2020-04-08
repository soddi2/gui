package exam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;

public class RockScissorPaper extends JFrame implements ActionListener{
	private JTextField textField;
	
	private static final int ROCK=0;
	private static final int PAPER=1;
	private static final int SCISSOR=2;
	
	public RockScissorPaper() {
		setTitle("가위바위보");
		
		JLabel lblNewLabel = new JLabel("아래의 버튼 중에서 하나를 클릭하시오");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 16));
		getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 16));
		getContentPane().add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btnNewButton = new JButton("ROCK");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("PAPER");
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SCISSOR");
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 20));
		panel.add(btnNewButton_2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
