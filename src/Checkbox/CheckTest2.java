package Checkbox;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;

public class CheckTest2 extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JCheckBox ch1,ch2,ch3;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckTest2 frame = new CheckTest2();
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
	public CheckTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		ch1 = new JCheckBox("두리안");
		panel_1.add(ch1);
		
		ch2 = new JCheckBox("망고");
		panel_1.add(ch2);
		
		ch3 = new JCheckBox("망고스틴");
		panel_1.add(ch3);
		
		textArea = new JTextArea();
		panel.add(textArea);
		
		ch1.addItemListener(this);
		ch2.addItemListener(this);
		ch3.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// 각 체크박스가 체크되면 체크된 과일의 이름을 TextArea에 보여주고 해제되면 과일이름 삭제
		
		JCheckBox ch = (JCheckBox) e.getItem();
		
		String s = "";
		
		if(e.getStateChange()==e.SELECTED) {
			
			textArea.append(" "+ch.getText());
			
		}else {
				//textArea에 있는 전체 문자열
				String contents = textArea.getText();
				//체크가 해제된 체크박스 문자열
				String delTxt = ch.getText();
				
				//
				StringBuffer buf = new StringBuffer(contents);
				int start = buf.indexOf(delTxt);
				int end = start+delTxt.length();
		
				buf.delete(start,end);
				textArea.setText(buf.toString());
			}
		}
		
	}































