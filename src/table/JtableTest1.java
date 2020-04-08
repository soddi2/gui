package table;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class JtableTest1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTable table;
	private JButton btn1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JtableTest1 frame = new JtableTest1();
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
	public JtableTest1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		btn1 = new JButton("출력");
		btn1.addActionListener(this);
		contentPane.add(btn1, BorderLayout.SOUTH);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"soddi", "11"},
				{"yoodi ", "60"},
				{"songdi", "99"},
			},
			new String[] {
				"\uC774\uB984", "\uB098\uC774"
			}
		));
		scrollPane.setViewportView(table);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//table 내용을 가져와서 출력하기
		
		//1. 모델 가져오기
		TableModel model = table.getModel();
		System.out.println("이름/t나이");
		//2. 모델의 내용 출력하기
		for(int i=0;i<model.getRowCount();i++) {
			for(int j=0;j<model.getColumnCount();j++) {
				System.out.println(model.getValueAt(i, j));
			}
			System.out.println();
		}
	}

}
































