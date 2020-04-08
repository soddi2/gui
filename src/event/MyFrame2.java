package event;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;


public class MyFrame2 extends JFrame {

	private JPanel contentPane;
	private JLabel	label;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame2 frame = new MyFrame2();
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
	public MyFrame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("누르지 마세요");
		panel.add(btnNewButton);
		
		//버튼과 리스너를 연동하는 부분
		btnNewButton.addActionListener(new Mylistener2());
		
		
		label = new JLabel("라벨");
		panel.add(label);
	}//메인 종료
	
	//이벤트 처리를 위한 클래스를 내부 클래스로 작성하기
		class Mylistener2 implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println(e.getActionCommand());
//				System.out.println(e.getSource());
				//라벨에 있는 글자를 변경
				label.setText("머리 풍성풍성");
			}
	}
}
