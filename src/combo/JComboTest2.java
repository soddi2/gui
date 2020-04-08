package combo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class JComboTest2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JComboBox<String> combo;
	private JTextField field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComboTest2 frame = new JComboTest2();
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
	public JComboTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"간장", "고추장", "된장", "쌈장", "딩기장", "주차장"}));
		contentPane.add(comboBox, BorderLayout.NORTH);

		//콤보박스에 들어갈 아이템 설정
//		String[] items = {"월","화","수","목","금","토","일"};
//		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>(items);
//		JComboBox<String> combo = new JComboBox<String>();
//		combo.setModel(model);
//		contentPane.add(combo,BorderLayout.SOUTH);
		
		// Vector 이용
		Vector<String> vector = new Vector<String>();
		vector.add("자몽");
		vector.add("구아바");
		vector.add("딸기");
		vector.add("참외");
		vector.add("키위");
		vector.add("몽쉘");
		
		combo = new JComboBox<String>(vector);
		combo.setSelectedIndex(-1);
		contentPane.add(combo,BorderLayout.SOUTH);
		
		field = new JTextField();
		contentPane.add(field,BorderLayout.NORTH);
		
		combo.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JComboBox<String> JCbB = (JComboBox<String>) e.getSource();
		String  s = "";
		
		if(JCbB == combo) {
			
			field.setText(JCbB.getSelectedItem().toString());
		}
		
	}

}



























