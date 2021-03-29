package level2.basic;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class Quiz1_sub extends JPanel{
	JButton jbtn = new JButton();
	
	}

public class Quiz1 extends JFrame implements MouseListener{
	JFrame jf = null;
	JTextArea jta = null;
	JLabel jlb = null;
	
	public Quiz1() {
		initDisplay();
	}
	public void initDisplay() {
		jlb = new JLabel("화면갱신");
		jta = new JTextArea();
		
		this.add("Center", jta);
		this.add("South", jlb);
		this.setSize(500, 500);
		this.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new Quiz1();
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
