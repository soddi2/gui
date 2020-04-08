package radio;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

public class Jradio_1 extends JFrame implements ActionListener,ItemListener {

	private JPanel contentPane,panel,btnpa,panel_2,list,topping,size;
	private JButton btn1;
	private JButton btn2;
	private JLabel lal1;
	private JRadioButton rda1,rda2,rda3,rdb1,rdb2,rdb3,rdb4,rdc1,rdc2,rdc3;
	private ButtonGroup group1,group2,group3;
	private String orderlist,ordertopping,ordersize; 
	int s = 0; 
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jradio_1 frame = new Jradio_1();
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
	public Jradio_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
//		for(int i=0;i<rb.length;i++) {
//			rb[i] = new JRadioButton((i+1)+"");
//			contentPane.add(rb[i]);
//			
//			rb[i].addActionListener(this);
//		}
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("자바피자");
		panel.add(lblNewLabel);
		
		btnpa = new JPanel();
		contentPane.add(btnpa, BorderLayout.SOUTH);
		
		btn1 = new JButton("주문");
		btn1.addActionListener(this);
		btnpa.add(btn1);
		
		btn2 = new JButton("취소");
		btn2.addActionListener(this);
		btnpa.add(btn2);
		
		lal1 = new JLabel("무료");
		btnpa.add(lal1);
		
		panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(0, 3, 0, 0));
		
		list = new JPanel();
		list.setBorder(new TitledBorder(null, "\uC885\uB958", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.add(list);
		list.setLayout(new GridLayout(0, 1, 0, 0));
		
		rda1 = new JRadioButton("콤보");
		list.add(rda1);
		
		rda2 = new JRadioButton("감자");
		list.add(rda2);
		
		rda3 = new JRadioButton("고구마");
		list.add(rda3);
		
		topping = new JPanel();
		topping.setBorder(new TitledBorder(null, "\uCD94\uAC00 \uD1A0\uD551", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.add(topping);
		topping.setLayout(new GridLayout(0, 1, 0, 0));
		
		rdb1 = new JRadioButton("피망");
		topping.add(rdb1);
		
		rdb2 = new JRadioButton("치즈");
		topping.add(rdb2);
		
		rdb3 = new JRadioButton("고기");
		topping.add(rdb3);
		
		rdb4 = new JRadioButton("케찹");
		topping.add(rdb4);
		
		size = new JPanel();
		size.setBorder(new TitledBorder(null, "\uD06C\uAE30", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.add(size);
		size.setLayout(new GridLayout(0, 1, 0, 0));
		
		rdc1 = new JRadioButton("작음");
		size.add(rdc1);
		
		rdc2 = new JRadioButton("중간");
		size.add(rdc2);
		
		rdc3 = new JRadioButton("큼");
		size.add(rdc3);
		
		group1 = new ButtonGroup();
		group1.add(rda1);
		group1.add(rda2);
		group1.add(rda3);
		
		group2 = new ButtonGroup();
		group2.add(rdb1);
		group2.add(rdb2);
		group2.add(rdb3);
		group2.add(rdb4);
		
		group3 = new ButtonGroup();
		group3.add(rdc1);
		group3.add(rdc2);
		group3.add(rdc3);
		
		rda1.addItemListener(this);
		rda2.addItemListener(this);
		rda3.addItemListener(this);
		rdb1.addItemListener(this);
		rdb2.addItemListener(this);
		rdb3.addItemListener(this);
		rdb4.addItemListener(this);
		rdc1.addItemListener(this);
		rdc2.addItemListener(this);
		rdc3.addItemListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton jopbtn = (JButton) e.getSource();
		
		if(jopbtn==btn2) {
		
		group1.clearSelection();
		group2.clearSelection();
		group3.clearSelection();
		lal1.setText("");
		}else {
	
		String option[] = {"주문","취소"};
		JOptionPane.showOptionDialog(this, "주문 : "+orderlist+"\n"+"토핑 : "+ordertopping+"\n"+"크기 : "+ordersize+"\n"+"가격 : "+s, 
				"주문내역", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
		
	}

}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		JRadioButton rd = (JRadioButton) e.getItem();
		
		if(e.getStateChange()==ItemEvent.SELECTED) {
			if(rd == rda1) {
				s+=300000;
				orderlist=rd.getText();
			}else if(rd == rda2) {
				s+=400000;
				orderlist=rd.getText();
			}else if(rd == rda3) {
				s+=500000;
				orderlist=rd.getText();
			}else if(rd == rdb1) {
				s+=100000;
				ordertopping=rd.getText();
			}else if(rd == rdb2) {
				s+=200000;
				ordertopping=rd.getText();
			}else if(rd == rdb3) {
				s+=300000;
				ordertopping=rd.getText();
			}else if(rd == rdb4) {
				s+=400000;
				ordertopping=rd.getText();
			}else if(rd == rdc1) {
				s+=500000;
				ordersize=rd.getText();
			}else if(rd == rdc2) {
				s+=600000;
				ordersize=rd.getText();
			}else if(rd == rdc3) {
				s+=700000;
				ordersize=rd.getText();
				
		}else {
			if(rd == rda1) {
				s-=300000;
				orderlist=rd.getText();
			}else if(rd == rda2) {
				s-=400000;
				orderlist=rd.getText();
			}else if(rd == rda3) {
				s-=500000;
				orderlist=rd.getText();
			}else if(rd == rdc1) {
				s-=500000;
				ordersize=rd.getText();
			}else if(rd == rdc2) {
				s-=600000;
				ordersize=rd.getText();
			}else if(rd == rdc3) {
				s-=700000;
				ordersize=rd.getText();
		} 
			
		
	}
			
			lal1.setText(""+s);
		}
	}
}

















