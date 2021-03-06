package athread.talk2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class as97164Client extends JFrame implements ActionListener {
	//////////////// 통신과 관련한 전역변수 추가 시작//////////////
	Socket socket = null;
	ObjectOutputStream oos = null;// 말 하고 싶을 때
	ObjectInputStream ois = null;// 듣기 할 때
	String nickName = null;// 닉네임 등록
	//////////////// 통신과 관련한 전역변수 추가 끝 //////////////
	JPanel jp_second = new JPanel();
	JPanel jp_second_south = new JPanel();
	JButton jbtn_one = new JButton("1:1");
	JButton jbtn_change = new JButton("대화명변경");
	JButton jbtn_font = new JButton("글자색");
	JButton jbtn_exit = new JButton("나가기");
	String cols[] = { "대화명" };
	String data[][] = new String[0][1];
	DefaultTableModel dtm = new DefaultTableModel(data, cols);
	JTable jtb = new JTable(dtm);
	JScrollPane jsp = new JScrollPane(jtb);
	JPanel jp_first = new JPanel();
	JPanel jp_first_south = new JPanel();
	JTextField jtf_msg = new JTextField(20);// south속지 center
	JButton jbtn_send = new JButton("전송");// south속지 east
	JTextArea jta_display = null;
	JScrollPane jsp_display = null;
	// 배경 이미지에 사용될 객체 선언-JTextArea에 페인팅
	Image back = null;

	public as97164Client() {
		jtf_msg.addActionListener(this);
		jbtn_exit.addActionListener(this);
		jbtn_change.addActionListener(this);
	}

	public void initDisplay() {
		// 사용자의 닉네임 받기
		nickName = JOptionPane.showInputDialog("닉네임을 입력하세요.");
		this.setLayout(new GridLayout(1, 2));
		jp_second.setLayout(new BorderLayout());
		jp_second.add("Center", jsp);
		jp_second_south.setLayout(new GridLayout(2, 2));
		jp_second_south.add(jbtn_one);
		jp_second_south.add(jbtn_change);
		jp_second_south.add(jbtn_font);
		jp_second_south.add(jbtn_exit);
		jp_second.add("South", jp_second_south);
		jp_first.setLayout(new BorderLayout());
		jp_first_south.setLayout(new BorderLayout());
		jp_first_south.add("Center", jtf_msg);
		jp_first_south.add("East", jbtn_send);
		back = getToolkit().getImage("src\\athread\\talk2\\back.jpg");
		jta_display = new JTextArea() {
			private static final long serialVersionUID = 1L;

			@Override
			public void paint(Graphics g) {
				g.drawImage(back, 0, 0, this);
				Point p = jsp_display.getViewport().getViewPosition();
				g.drawImage(back, p.x, p.y, null);
				paintComponent(g);
			}
		};
		jta_display.setLineWrap(true);
		jta_display.setOpaque(false);
		Font font = new Font("돋움", Font.BOLD, 25);
		jta_display.setFont(font);
		jsp_display = new JScrollPane(jta_display);
		jp_first.add("Center", jsp_display);
		jp_first.add("South", jp_first_south);
		this.add(jp_first);
		this.add(jp_second);
		this.setTitle(nickName);
		this.setSize(800, 550);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// swing skin 사용
		JFrame.setDefaultLookAndFeelDecorated(true);
		// 메인스레드 우선권
		as97164Client as97164c = new as97164Client();
		// 화면 부름
		as97164c.initDisplay();
		// 소켓생성 - Ts쪽ServerSocket감지 - 일반 소켓 전달됨, - run메소드 안에서 - as97164severThread생성
		// 생성자호출(this) - 든기 가능해짐 - 전제조건:oos,ois, 소켓객체 있어야 가능함
		as97164c.init();
	}

	// 소켓 관련 초기화
	public void init() {
		try {
			// 서버측의 ip주소 작성하기
			socket = new Socket("127.0.0.1", 3002);
			// Ts ServerSocket감지 -> client = server.accept(); //클라이언트 소켓에 대한 정보 갖음.
			// 홀수 소켓에 대한 처리
			oos = new ObjectOutputStream(socket.getOutputStream());
			// 짝수 소켓에 대한 처리
			ois = new ObjectInputStream(socket.getInputStream());
			// initDisplay에서 닉네임이 결정된 후 init메소드가 호출되므로
			// 서버에게 내가 입장한 사실을 알린다.(말하기)
			oos.writeObject(100 + "#" + nickName);// 말했잖아
			// as97164ServerThread의 생성자가 듣기.
			// 서버에 말을 한 후 들을 준비를 한다. - 대기탄다, 기다려.- 대답이 오면 듣기. - 프로토콜을 비교해야 한다.
			// 프로토콜 설계하기 - ERD 그린다.- 데이터 클래스 설계 - List, Map 단위테스트까지 내가...한다...
			as97164ClientThread as97164ct = new as97164ClientThread(this);
			as97164ct.start();
		} catch (Exception e) {
			// 예외가 발생했을 때 직접적인 원인되는 클래스명 출력하기
			System.out.println(e.toString());
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
