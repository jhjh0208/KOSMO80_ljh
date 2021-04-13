package UI.hanbit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JInternalFrameEx extends JFrame implements ActionListener {
	//9~15 전변. - 이른, 게으른. 현재는 이른. =을 기준으로 메모리에 상주. 그러나 아직 실행은 안 되어있다.- 아직 메인메소드가 콜을 못받음. - 콜은 jvm이 함 (외부)
	JDesktopPane desktop = new JDesktopPane();
	
	JMenuItem openItem = new JMenuItem("New");
	JMenuItem closeItem = new JMenuItem("Close");
	JMenuItem exitItem = new JMenuItem("Exit");
	
	int cnt=1;
	
	public JInternalFrameEx() {
		
		super("JInternalFrame 테스트"); //super라고 쓰고 JFrame이라고 읽는다. 
		
		buildGUI();// 기다려. -> 27번으로 넘어감.

		setBounds(300,200,500,400); //위치를 정해줌
		setVisible(true); //디스가 생략되어 있는 것과 같다.
	}
	
	void buildGUI() {//화면에서 나가기 전에 먼저 호출되는 부분이기 때문에 시점상 먼저 처리되어야 하는 부분. 이럴경우 화면에 붙어야 하는 컴포넌트에대한 정의이거나 혹은 배치. 
    	
		add(desktop, BorderLayout.CENTER); //this가 생략됨. 여기서 this는 JInternalFrameEx.
		
		JMenuBar menubar = new JMenuBar();
		setJMenuBar(menubar);//this가 생략됨. this는 JInternalFrameEx이기도 하지만(==) JFrame.
		
		JMenu fileMenu = new JMenu("File");
		menubar.add(fileMenu);
		
		fileMenu.add(openItem);//열기
		fileMenu.add(closeItem);//닫기
		fileMenu.addSeparator();
		fileMenu.add(exitItem);//나가기
		
		openItem.addActionListener(this);
		closeItem.addActionListener(this);
		exitItem.addActionListener(this);
	}

	public void openFrame() { //JInternalFrame 윈도우 자녀 x 독립적수행 x 
		JInternalFrame frame = new JInternalFrame("새문서"+cnt, true, true, true, true );
		
		JLabel imageLabel = new JLabel("새문서");
		frame.getContentPane().setBackground(Color.white);
		frame.getContentPane().add(imageLabel);
		if(cnt==1)
			frame.setSize(200,200);
		else
			frame.setBounds((cnt-1)*20, (cnt-1)*20, 200, 200);
		
		cnt++;

		desktop.add(frame);
		frame.setVisible(true);
	}
	
	public void closeFrame() {	
		JInternalFrame frame = desktop.getSelectedFrame();
		if(frame == null) { return; }		
		frame.setVisible(false);
		frame.dispose();	
	}
	
	public void actionPerformed(ActionEvent e) {
	
		Object obj = e.getSource();
		
		if(obj == openItem) {
			openFrame();
		}
		else if(obj == closeItem) {
			closeFrame();
		}
		else if(obj == exitItem) {
			setVisible(false);
			dispose();
			System.exit(0);
		}
	}
	
	public static void main(String[] args){
		new JInternalFrameEx();
	}
}