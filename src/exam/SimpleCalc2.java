package exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class SimpleCalc2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txt0p1;
	private JTextField txtOp2;
	private JTextField txtResult;
	private JButton btnplus,btnminus;
	private JButton btnmulti;
	private JButton btnnanugi;
	private JButton btnreset;
	private JLabel lblmulempu;
	private JLabel lblneun;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalc2 frame = new SimpleCalc2();
					frame.setVisible(true);
					frame.setTitle("계산해줭");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SimpleCalc2() {
		setTitle("사칙연산계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 619, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		txt0p1 = new JTextField();
		panel.add(txt0p1);
		txt0p1.setColumns(10);
		
		lblmulempu = new JLabel("?");
		panel.add(lblmulempu);
		
		txtOp2 = new JTextField();
		panel.add(txtOp2);
		txtOp2.setColumns(10);
		
		lblneun = new JLabel("=");
		panel.add(lblneun);
		
		txtResult = new JTextField();
		panel.add(txtResult);
		txtResult.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		btnplus = new JButton("+");
		btnplus.addActionListener(this);
		panel_1.add(btnplus);
		
		btnminus = new JButton("-");
		btnminus.addActionListener(this);
		panel_1.add(btnminus);
		
		btnmulti = new JButton("*");
		btnmulti.addActionListener(this);
		panel_1.add(btnmulti);
		
		btnnanugi = new JButton("/");
		btnnanugi.addActionListener(this);
		panel_1.add(btnnanugi);
		
		btnreset = new JButton("reset");
		btnreset.addActionListener(this);
		panel_1.add(btnreset);
		
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btn = (JButton) e.getSource();
		
		int op1=Integer.parseInt(txt0p1.getText());
		int op2=Integer.parseInt(txtOp2.getText());
		int result=0;
		
		
		if(btn==btnplus) {
			
			lblmulempu.setText("+");
			result = op1+op2;
			
		}else if(btn==btnminus){
			lblmulempu.setText("-");
			result = op1-op2;
		
		}else if(btn==btnmulti) {
			lblmulempu.setText("*");
			result = op1*op2;
		
		
		}else if(btn==btnnanugi) {
			lblmulempu.setText("/");
			result = op1/op2;
		
		}else {
			txt0p1.setText("");
			txtOp2.setText("");
			txtResult.setText("");
		}
		txtResult.setText(result+""); //"" 스트링 변환
	}

}
























