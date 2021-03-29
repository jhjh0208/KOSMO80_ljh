package level2.basic;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Sukje extends JFrame {
	JPanel jpn_text = new JPanel();
	JPanel jpn_make = new JPanel();
	JButton jbtn_make = new JButton("만들기");
	JTextField jtf = new JTextField(20);
	
	public Sukje() {
		initDisplay();
	}
	public void initDisplay() {
//		this.setLayout(new BorderLayout());
		this.setLayout(null);
		jtf.setBounds(205, 200, 200, 90);
		jpn_text.add(jtf);
		jpn_make.add(jbtn_make);
		this.add("Center",jpn_text);
		this.add("South", jpn_make);
		this.setSize(500,400);
		this.setTitle("성적처리");
		this.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new Sukje();
		
	}
}

