package level2.basic;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Sukje_1 extends JFrame {
	JPanel jpn_text,jpn_make;
	JButton jbtn_make = new JButton("만들기");
	JTextField jtf = new JTextField();
	
	public Sukje_1() {
		initDisplay();
	}
	public void initDisplay() {
//		this.setLayout(new BorderLayout());
		this.setLayout(null);
		jpn_make = new JPanel();
		jpn_text = new JPanel();
		
		jpn_text.setBounds(0, 0, 400, 400);
		jpn_text.setLayout(null);
		jtf.setBounds(5, 150, 380, 90);
		jpn_text.add(jtf);
		this.add(jpn_text);
		
		jpn_make.setLayout(null);
		jpn_make.setBounds(405,0,95,400);
		jbtn_make.setBounds(0,150,90,90);
		jpn_make.add(jbtn_make);
		this.add(jpn_make);
		
		this.setSize(500,400);
		this.setTitle("성적처리");
		this.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new Sukje_1();
		
	}
}

