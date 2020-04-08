package exam;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel{
	BufferedImage img = null;
	int img_x=100, img_y=100;
	
	public MyPanel() {
		//URL url = URL.getResource("car.gif");
		try {
			img = ImageIO.read(new File("D:\\NaverCloud\\대우 직업\\javasource\\gui\\src\\exam\\car.gif"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//사용자가 4방향의 화살표를 클릭한 경우
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {}
			
			@Override
			public void keyReleased(KeyEvent e) {}
			
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch(keyCode) {
				case KeyEvent.VK_UP:
					img_y -= 100;
					break;
				case KeyEvent.VK_DOWN:
					img_y += 100;
					break;
				case KeyEvent.VK_LEFT:
					img_x -= 100;
					break;
				case KeyEvent.VK_RIGHT:
					img_x += 100;
					break;
				}
				repaint();
			}
		});
		
		//포커스 요청하기
		this.requestFocus();
		setFocusable(true);
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);
	}
}

public class CarGame extends JFrame {

	public CarGame() {
		setTitle("부릉부릉");
		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
	}
	
	
	
	public static void main(String[] args) {
		CarGame car = new CarGame();
		car.setVisible(true);

	}

}
