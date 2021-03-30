package level2.basic;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Sukje extends JFrame implements ActionListener{
	JPanel jpn_text = new JPanel();
	JPanel jpn_make = new JPanel();
	JPanel jpn_myung = new JPanel();
	JButton jbtn_make = new JButton("만들기");
	JTextField jtf = new JTextField(3);
	JLabel jlb = new JLabel("명");
	
	public Sukje() {
		initDisplay();
	}
	public void initDisplay() {
		this.setLayout(new FlowLayout());
		jpn_text.add(jtf);
		jpn_text.add(jlb);
		jpn_make.add(jbtn_make);
		jbtn_make.addActionListener(this);
		this.add(jpn_text);
		this.add(jpn_myung);
		this.add(jpn_make);
		this.setSize(300,200);
		this.setTitle("성적처리");
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Sukje();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == jbtn_make) {
			this.setSize(500,400);
			this.setTitle("성적처리");
			this.setVisible(true);
		}
	}
}

