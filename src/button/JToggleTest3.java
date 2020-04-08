package button;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;

public class JToggleTest3 extends JFrame implements ActionListener  {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JToggleButton tglbtnNewToggleButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JToggleTest3 frame = new JToggleTest3();
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
	public JToggleTest3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tglbtnNewToggleButton = new JToggleButton("토글버튼");
		tglbtnNewToggleButton.addActionListener(this);
		tglbtnNewToggleButton.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.out.println("토글버튼클릭");
			}
		});
		contentPane.add(tglbtnNewToggleButton, BorderLayout.NORTH);
		
		btnNewButton = new JButton("그냥 버튼");
		btnNewButton.addActionListener(this);
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
		lblNewLabel = new JLabel("New label");
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		AbstractButton btn =(AbstractButton)e.getSource();
		
		if(btn==btnNewButton) { //일반버튼
			lblNewLabel.setText("일반버튼 클릭");
		}else { //toggle버튼			
			if(btn.isSelected()) {
				lblNewLabel.setText("Button on");
			}else {
				lblNewLabel.setText("Button off");
			}
		}
		
		
		
		
//		if(e.getSource()==btnNewButton) { //일반버튼
//			lblNewLabel.setText("일반버튼 클릭");
//		}else { //toggle버튼			
//			JToggleButton tgl =(JToggleButton) e.getSource();
//			if(tgl.isSelected()) {
//				lblNewLabel.setText("Button on");
//			}else {
//				lblNewLabel.setText("Button off");
//			}
//		}
		
		
		
		
		
	}
}
























