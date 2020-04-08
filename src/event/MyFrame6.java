package event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Action;
import javax.swing.JButton;

public class MyFrame6 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnYellow;
	private JButton btnred;
	private JPanel panel;
	private JButton btncloze;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame6 frame = new MyFrame6();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFrame6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.NORTH);
		
		btnred = new JButton("빨강");
		btnred.addActionListener(this);
		
		panel.add(btnred);
		
		btnYellow = new JButton("노랑");
		btnYellow.addActionListener(this);
	
		panel.add(btnYellow);
		
		btncloze = new JButton("닷기");
		btncloze.addActionListener(this);
		panel.add(btncloze);
		
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnYellow) {
			
			contentPane.setBackground(Color.YELLOW);
			panel.setBackground(Color.green);
		}else if (e.getSource()==btnred){
			
			contentPane.setBackground(Color.red);
			panel.setBackground(Color.blue);
			
		}else { //btncloze
			//프레임 종료
			System.exit(0);
		}
	}
}
















