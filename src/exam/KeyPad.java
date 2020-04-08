package exam;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeyPad extends JFrame implements ActionListener {

	private JPanel contentJPane;
	private JTextField txtinput;
	private JButton[] buttons= new JButton[9];
	private JPanel btnJPanel;
	
	public KeyPad() {
		setTitle("키패드");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,200);
		setVisible(true);
		
		contentJPane = new JPanel();
		contentJPane.setLayout(new BorderLayout());
		add(contentJPane);
		
		txtinput = new JTextField();
		txtinput.setFont(new Font("굴림",Font.BOLD, 20));
		contentJPane.add(txtinput,BorderLayout.NORTH);
		
		btnJPanel = new JPanel();
		btnJPanel.setLayout(new GridLayout(0, 3));
		contentJPane.add(btnJPanel,BorderLayout.CENTER);
		
		for(int i=0;i<buttons.length;i++) {
			buttons[i] = new JButton((i+1)+"");
			btnJPanel.add(buttons[i]);
			
			buttons[i].addActionListener(this);
			
		}
		
		add(contentJPane);
		pack();
	}
	
	
	public static void main(String[] args) {
		KeyPad keypad = new KeyPad();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		//버튼이 눌러지면 해당 버튼의 text값을 txtinput에 보여주기
		String str = e.getActionCommand();
		
		for(int i=0; i<buttons.length; i++) {
			if(e.getSource()==buttons[i]) {
//				int op = Integer.parseInt(txtinput.getText());
				
				txtinput.setText(txtinput.getText()+str);
			}
		}
	}

}
























