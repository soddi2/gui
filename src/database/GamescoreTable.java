package database;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class GamescoreTable extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;
	private JTable table;
	private JButton btn1;
	
	private GameDAO dao;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GamescoreTable frame = new GamescoreTable();
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
	public GamescoreTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		dao = new GameDAO();
		model = getmodel();
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JLabel namelbl = new JLabel("이름");
		panel.add(namelbl);
		
		text1 = new JTextField();
		panel.add(text1);
		text1.setColumns(5);
		
		JLabel scorelbl = new JLabel("점수");
		panel.add(scorelbl);
		
		text2 = new JTextField();
		panel.add(text2);
		text2.setColumns(5);
		
		btn1 = new JButton("조회");
		panel.add(btn1);
		btn1.addActionListener(this);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		JLabel mainlbl = new JLabel("명예의 전당");
		mainlbl.setFont(new Font("궁서체", Font.BOLD | Font.ITALIC, 19));
		panel_1.add(mainlbl);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(table);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable(model);
		list();
		scrollPane.setViewportView(table);
	}
	
	public DefaultTableModel getmodel() {
		String columnNames[] = {"이름","점수"};
		model = new DefaultTableModel(columnNames,0) {
			
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		return model;
	}
	
	
	public void list() {
		Vector<GameVO> vecList = dao.getList();
		
		for(GameVO vo : vecList) {
			Object[] objects = {vo.getName(),vo.getScore()};
			model.addRow(objects);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		GameVO vo = new GameVO();
		
		if(e.getSource()==btn1) {
			
			if(text1.getText().equals("") || text2.getText().equals("") ) {
				JOptionPane.showMessageDialog(this, "입력실패");
			} //점수를 확인해 주세요

			vo.setName(text1.getText());
			vo.setScore(Integer.parseInt(text2.getText()));
			
			int result = dao.scoreInsert(vo);
			
			
			if(result>0) {
				JOptionPane.showMessageDialog(this, "입력성공");
				
				model.setNumRows(0);
				list();
			}
		}
	}

}
























