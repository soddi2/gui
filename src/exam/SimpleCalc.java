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

public class SimpleCalc extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txt0p1;
	private JTextField txtOp2;
	private JTextField txtResult;
	private JButton btnOK,btnCancel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalc frame = new SimpleCalc();
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
	public SimpleCalc() {
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
		
		JLabel lblNewLabel = new JLabel("+");
		panel.add(lblNewLabel);
		
		txtOp2 = new JTextField();
		panel.add(txtOp2);
		txtOp2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("=");
		panel.add(lblNewLabel_1);
		
		txtResult = new JTextField();
		panel.add(txtResult);
		txtResult.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		btnOK = new JButton("화긴");
		btnOK.addActionListener(this);
		panel_1.add(btnOK);
		
		btnCancel = new JButton("치소");
		btnCancel.addActionListener(this);
		panel_1.add(btnCancel);
		
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnOK) {
			//txtOp1, txtOp2 숫자를 가져와서 더하기를 한 후 txtResult에 결과값 보여주기
			int op1=Integer.parseInt(txt0p1.getText());
			int op2=Integer.parseInt(txtOp2.getText());
			//txtResult에 결과값 보여주기
			txtResult.setText(String.valueOf(op1+op2));
			
		}else {
			//txtOp1, txtOp2, txtResult 내용 지우기
			txt0p1.setText("");
			txtOp2.setText("");
			txtResult.setText("");
			
		}
		
	}

}
























