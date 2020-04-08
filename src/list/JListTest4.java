package list;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.AbstractListModel;

public class JListTest4 extends JFrame implements ListSelectionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JList<String> list;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JListTest4 frame = new JListTest4();
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
	public JListTest4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 10, 0));
		
		list = new JList<>();
		list.setModel(new AbstractListModel<String>() {
			String[] values = new String[] {"소띠", "유띠", "박띠", "김띠", "최띠", "이띠"};
			public int getSize() {
				return values.length;
			}
			public String getElementAt(int index) {
				return values[index];
			}
		});
		panel.add(list);
		list.addListSelectionListener(this);
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		panel.add(textArea);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) { 
		//listselectionEvent => 아이탬을 선택하는 시점과 마우스에 손을 때는 시점에도 이벤트 발생
		if(e.getValueIsAdjusting()) {
			
//			textArea.append(list.getSelectedValue());
//			textArea.setText(list.getSelectedValue());
//			System.out.println(list.getSelectedValue());
//			System.out.println(list.getSelectedValuesList());
			
//			textArea.append(list.getSelectedValue());	
//			textArea.append(items.toString());
			List<String> items = list.getSelectedValuesList();
			textArea.setText("");
			for(String item:items) {
				textArea.append(item);
			}
			
		}
		
	}

}









































