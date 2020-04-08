package exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ButtenDemo extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnleft,btnmiddle,btnright;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtenDemo frame = new ButtenDemo();
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
	public ButtenDemo() {
		setTitle("버튼 이미지 넣기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		btnleft = new JButton("Disable middel button");
		btnleft.setMnemonic('D');
		btnleft.setActionCommand("disable");
		btnleft.setIcon(new ImageIcon(ButtenDemo.class.getResource("/exam/left.gif")));
		btnleft.addActionListener(this);
		panel.add(btnleft);
		
		btnmiddle = new JButton("middle button");
		btnmiddle.setMnemonic('M');
		btnmiddle.setActionCommand("middel");
		btnmiddle.setIcon(new ImageIcon(ButtenDemo.class.getResource("/exam/middle.gif")));
		btnmiddle.addActionListener(this);
		panel.add(btnmiddle);
		
		btnright = new JButton("enable middle button");
		btnright.setMnemonic('E');
		btnright.setActionCommand("enable");
		btnright.setIcon(new ImageIcon(ButtenDemo.class.getResource("/exam/right.gif")));
		btnright.addActionListener(this);
		panel.add(btnright);
		
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// e.getSource() / e.getActionCommand()
		
		String cmd = e.getActionCommand();
		if(cmd.equals("disable")) {
			btnmiddle.setEnabled(false);
			btnleft.setEnabled(false);
			btnright.setEnabled(true);
		}else {
			btnmiddle.setEnabled(true);
			btnleft.setEnabled(true);
			btnright.setEnabled(false);
		}
		
		
	}

}































