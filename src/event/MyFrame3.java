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


public class MyFrame3 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel	label;
	private JButton btn1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame3 frame = new MyFrame3();
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
	public MyFrame3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		btn1 = new JButton("누르지 마세요");
		panel.add(btn1);
		
		//버튼과 리스너를 연동하는 부분
		btn1.addActionListener(this);
		
		
		label = new JLabel("라벨");
		panel.add(label);
	}//메인 종료
	
	//이벤트 처리를 위한 클래스를 내부 클래스로 작성하기
//		class Mylistener2 implements ActionListener{
//			@Override
//			public void actionPerformed(ActionEvent e) {
////				System.out.println(e.getActionCommand());
////				System.out.println(e.getSource());
//				//라벨에 있는 글자를 변경
//				label.setText("머리 풍성풍성");
//			}
//	}

		@Override
		public void actionPerformed(ActionEvent e) {
			//버튼에 글자 변경
			btn1.setText("너무 졸려~~~~~~~~~~~~~~~~~");
			//라벨에 글자 변경
			label.setText("졸려~~~~~~~~~~~~~~~~~~~~~~~~");
			
			
		}
}





























