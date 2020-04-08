package exam;

import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class RSP extends JFrame implements ActionListener {
	
	private JPanel panel;
	private JButton btnrock,btnpaper,btnsciser;
	private JLabel la1;
	private JTextField fi1;
	//가위 바위 보에 대한 상수
	private static final int ROCK=0;
	private static final int PAPER=1;
	private static final int SCISSOR=2;
	
	
	public RSP() {
		setTitle("가위 바위 보우");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(558, 416);
		setVisible(true);
		
		panel = new JPanel();
		
		la1 = new JLabel("옆에서 하나 눌러");
		fi1 = new JTextField(10);
		
		btnrock = new JButton();
		btnrock.setIcon(new ImageIcon(RSP.class.getResource("/exam/rock.png")));
		btnrock.addActionListener(this);
		btnrock.setActionCommand("바위");
		
		btnpaper = new JButton();
		btnpaper.setIcon(new ImageIcon(RSP.class.getResource("/exam/paper1.png")));
		btnpaper.addActionListener(this);
		btnpaper.setActionCommand("보");
		
		btnsciser = new JButton();
		btnsciser.setIcon(new ImageIcon(RSP.class.getResource("/exam/scissor.png")));
		btnsciser.addActionListener(this);
		btnsciser.setActionCommand("가위");
	
		panel.add(la1);
		panel.add(btnrock);
		panel.add(btnpaper);
		panel.add(btnsciser);
		panel.add(fi1);
		
		getContentPane().add(panel);
		
//		pack();
		
	}
		
	
	public static void main(String[] args) {
		RSP rsp = new RSP();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//컴터꺼 가위바위보 생성
		Random random = new Random();
		//random.nextint(3) :  괄호안의 숫자는 미포함해서 0,1,2 중에서 나오게함
		
		int computer = random.nextInt(3);
		
		String cmd = e.getActionCommand();
		
		if(cmd.equals("바위")) {//사용자가 주먹 선택
			if(computer == ROCK) {
				fi1.setText("비김");
			}else if(computer == PAPER){
				fi1.setText("짐");
			}else  {
			fi1.setText("이겨");
			}
	}
		if(cmd.equals("가위")) {//사용자가 주먹 선택
			if(computer == ROCK) {
				fi1.setText("짐");
			}else if(computer == PAPER){
				fi1.setText("이김");
			}else  {
			fi1.setText("비김");
			}
	}
		if(cmd.equals("보")) {//사용자가 주먹 선택
			if(computer == ROCK) {
				fi1.setText("이겨");
			}else if(computer == PAPER){
				fi1.setText("비겨");
			}else  {
			fi1.setText("져");
			}
	}

	}
}
















