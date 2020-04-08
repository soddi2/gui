package radio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;

public class JRadioTest3 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioTest3 frame = new JRadioTest3();
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
	public JRadioTest3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("피자 크기");
		panel_1.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\uC0AC\uC774\uC988", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JRadioButton rd1 = new JRadioButton("큰거");
		rd1.addActionListener(this);
		panel.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("작은거");
		rd2.addActionListener(this);
		panel.add(rd2);
		
		JRadioButton rd3 = new JRadioButton("더 작은거");
		rd3.addActionListener(this);
		panel.add(rd3);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);

		ButtonGroup group = new ButtonGroup();
		group.add(rd1);
		group.add(rd2);
		group.add(rd3);
		
		textField = new JTextField();
		textField.setForeground(Color.RED);
		panel_2.add(textField);
		textField.setColumns(30);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		textField.setText(e.getActionCommand()+"가 선택되었습니다.");
	
		
	}

}



