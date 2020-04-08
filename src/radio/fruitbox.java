package radio;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class fruitbox extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JCheckBox chbox1,chbox2,chbox3;
	private JLabel lbl1,lbl2,lbl3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fruitbox frame = new fruitbox();
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
	public fruitbox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		chbox1 = new JCheckBox("Apple");
		panel_1.add(chbox1);
		
		chbox2 = new JCheckBox("Grape");
		panel_1.add(chbox2);
		
		chbox3 = new JCheckBox("Orange");
		panel_1.add(chbox3);
		
		lbl1 = new JLabel("");
		
		panel.add(lbl1);
		
		lbl2 = new JLabel("");
		
		panel.add(lbl2);
		
		lbl3 = new JLabel("");
		
		panel.add(lbl3);
		
		chbox1.addItemListener(this);
		chbox2.addItemListener(this);
		chbox3.addItemListener(this);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		JCheckBox ch = (JCheckBox) e.getItem();
		ImageIcon icon = null;
		
		if(e.getStateChange()==ItemEvent.SELECTED) {
			if(ch.getText().equals("Apple")) {
				icon = new ImageIcon(getClass().getResource("apple.gif"));
				lbl1.setIcon(icon);
			}else if(ch.getText().equals("Grape")) {
				icon = new ImageIcon(getClass().getResource("grape.gif"));
				lbl2.setIcon(icon);
			}else if(ch.getText().equals("Orange")) {
				icon = new ImageIcon(getClass().getResource("orange.gif"));
				lbl3.setIcon(icon);
			}
		}else {
			if(ch.getText().equals("Apple")) {
				lbl1.setIcon(null);
			}else if(ch.getText().equals("Grape")) {
				lbl2.setIcon(null);
			}else if(ch.getText().equals("Orange")) {
				lbl3.setIcon(null);
			}
		}
	
	}
}












