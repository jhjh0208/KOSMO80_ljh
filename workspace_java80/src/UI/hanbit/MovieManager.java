package UI.hanbit;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class MovieManager extends JFrame {
	Logger logger = LogManager.getLogger(MovieManager.class);
	
	JPanel jpn_west = new JPanel(new GridLayout(6,0,3,3));
	JPanel jpn_center = new JPanel();
	JButton jbtn_1 = new JButton("1");
	JButton jbtn_search = new JButton("검색");
	JButton jbtn_ticketing = new JButton("예매");
	JTextArea jta_1 = new JTextArea();
	
	public MovieManager() {
		initDisplay();
	}
	
	
	private void initDisplay() {
		jpn_west.add(jbtn_1);
		jpn_west.add(jbtn_search);
		jpn_west.add(jbtn_ticketing);
		jpn_center.add(jta_1);
		jta_1.setBackground(Color.blue);
		
		jbtn_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				logger.info("1번 버튼 호출");
				System.out.println("11111111");
				open1();
			}
			
		});
		jbtn_search.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ae) {
				System.out.println("2222");
				logger.info("검색 버튼 호출");
				
			}
			
		});
		jbtn_ticketing.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ae) {
				System.out.println("33333");
				logger.info("예매 버튼 호출성공");
				
			}
			
		});
		
		
		this.setLayout(new BorderLayout());
		this.add("West",jpn_west);
		this.add("Center",jpn_center);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("무비매니저");
		this.setSize(500,500);
		this.setVisible(true);
	}
	
	
	public void open1() {
		JInternalFrame frame = new JInternalFrame();
		JLabel imageLabel = new JLabel("1번창");
		jta_1.add(frame);
		frame.setSize(200,200);
		frame.setVisible(true);
	}


	public static void main(String[] args) {
		new MovieManager();
		
	}

}

