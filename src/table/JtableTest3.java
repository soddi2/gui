package table;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JtableTest3 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JTable table;
	private DefaultTableModel model;
	private JLabel lbl1,lbl2,lbl3;
	private JButton btn1;
	private JButton btn2;
	private Vector<String> rowData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JtableTest3 frame = new JtableTest3();
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
	public JtableTest3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		lbl1 = new JLabel("이름");
		panel.add(lbl1);
		
		text1 = new JTextField();
		panel.add(text1);
		text1.setColumns(5);
		
		lbl2 = new JLabel("나이");
		panel.add(lbl2);
		
		text2 = new JTextField();
		panel.add(text2);
		text2.setColumns(5);
		
		lbl3 = new JLabel("성별");
		panel.add(lbl3);
		
		text3 = new JTextField();
		panel.add(text3);
		text3.setColumns(5);
		
		btn1 = new JButton("입력");
		panel.add(btn1);
		
		btn2 = new JButton("삭제");
		panel.add(btn2);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		//컬럼명 작성
		String columnNames[] = {"이름","나이","성별"};
		model = new DefaultTableModel(columnNames,0);
		table = new JTable(model);
		scrollPane.setViewportView(table);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String cmd = e.getActionCommand();
		if(cmd.equals("입력")) {
			// 사용자가 입력한 이름,나이,성별 가져오기 모델에 추가하기 다른데이터를 입력할 수 있도록 기존 데이터 삭제하기
			String name = text1.getText();
			String age = text2.getText();
			String gender = text3.getText();
//		Object rowData[] = {name,age,gender};
			rowData = new Vector<String>();
			rowData.add(name);
			rowData.add(age);
			rowData.add(gender);
			
			// 모델에 추가하기
			model = (DefaultTableModel) table.getModel();
			
			model.addRow(rowData);
			
			text1.setText("");
			text2.setText("");
			text3.setText("");
					
		}else { //기존 데이터 삭제
			int  selectRow = table.getSelectedRow();
			model.removeRow(selectRow);
			
		}
	}

}




















