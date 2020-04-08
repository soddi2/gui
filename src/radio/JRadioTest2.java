package radio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JTextField;

public class JRadioTest2 extends JFrame implements /*ActionListener*/ItemListener{

	private JPanel contentPane;
	private JTextField textField;
	private JRadioButton rdodog,rdocat,rdoheg,rdokoi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioTest2 frame = new JRadioTest2();
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
	public JRadioTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("좋아하는게 뭐냐");
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		rdodog = new JRadioButton("개");
//		rdodog.addActionListener(this);
		rdodog.addItemListener(this);
		panel.add(rdodog);
		
		rdocat = new JRadioButton("고양이");
//		rdocat.addActionListener(this);
		rdocat.addItemListener(this);
		panel.add(rdocat);
		
		rdoheg = new JRadioButton("고슴도치");
//		rdoheg.addActionListener(this);
		rdoheg.addItemListener(this);
		panel.add(rdoheg);
		
		rdokoi = new JRadioButton("잉어");
//		rdokoi.addActionListener(this);
		rdokoi.addItemListener(this);
		panel.add(rdokoi);
		
		//버튼그룹 생성
		ButtonGroup group = new ButtonGroup();
		group.add(rdodog);
		group.add(rdocat);
		group.add(rdoheg);
		group.add(rdokoi);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		
//		JRadioButton radio = (JRadioButton) e.getSource();
//		
//		if(radio.isSelected()) {
//			System.out.println("선택됨");
//		}else {
//			System.out.println("선택안됨");
//		}
//		
//		textField.setText(e.getActionCommand());
//	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JRadioButton radio = (JRadioButton) e.getItem();
		
		if(e.getStateChange()==ItemEvent.SELECTED) {
			if(radio == rdodog) {
				System.out.println("rdodog 선택");
			}else if(radio == rdocat) {
				System.out.println("rdocat 선택");
			}
		}else {
			if(radio == rdodog) {
				System.out.println("rdodog 해제");
			}else if(radio == rdocat) {
				System.out.println("rdocat 해제");
		}
		
	}

	}
}









