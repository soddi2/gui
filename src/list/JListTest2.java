package list;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JListTest2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JListTest2 frame = new JListTest2();
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
	public JListTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
//		Vector<String> vector = new Vector<String>();
//		vector.add("서울");
//		vector.add("대구");
//		vector.add("부산");
//		vector.add("대전");
		
		
		JList<String> list = new JList<String>(new DefaultListModel<String>() {
			String datas[] = {"서울","대구","부산","대전"};
			
			@Override
			public String getElementAt(int index) {
				// TODO Auto-generated method stub
				return datas[index];
			}
			
			
			@Override
			public int getSize() {
				// TODO Auto-generated method stub
				return datas.length;
			}
			
			
			
			
		});
		contentPane.add(list,BorderLayout.CENTER);
		
		
		
	}

}



















