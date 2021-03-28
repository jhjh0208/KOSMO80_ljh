package athread.talk1;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class TalkServerThread extends Thread {
	TalkServer            ts = null;
	Socket client            = null;
	ObjectOutputStream oos   = null;
	ObjectInputStream ois    = null;
	//닉네임
	String nickName          = null;//재훈님 창, 희태님, 제정님
	/*
	 * 클라이언트측에서 서버소켓에 접속하고 나면 생성자를 통해ㅓㅅ TalkServer의 주소번지를 받게 되고 이것으로 소켓에 접근이 가능함.
	 * 이 소켓으로 ois와 oos를 생성하고 접속해온 사용자의 정보를 청취함.
	 * 청취한 내용을 TalkSerVer의 Jta_log에 출력해 봄.
	 */
	
	public TalkServerThread(TalkServer talkServer) {
		this.ts = talkServer;
		this.client = ts.client;
		try {
			oos = new ObjectOutputStream(client.getOutputStream());//홀수자리 소켓 -쓰기역할
			ois = new ObjectInputStream(client.getInputStream());//짝수자리 소켓 - 닫게ㅐ;
			String msg = (String)ois.readObject();
			ts.jta_log.append(msg+"\n");
		}catch (Exception e) {
			
		}
		//현재 입장해 있는 친구들 모두에게 메시지 전송하기 구현
		//
		public void broadCasting(String msg) {
			for(TalkServerThead tst:ts.globalList) {
				//그 스레드에 send메소드 호출하여 메시지 전송함.
				tst.send(msg);
			}
		}
		}
	}
		
	//현재 입장해 있는 친구들 모두에게 메시지 전송하기 구현
	
	//클라이언트에게 말하기 구현
	public void send(String msg) {
		try {
			oos.writeObject(msg);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		boolean isStop = false;
		
		try {
			run_start:
				
		} catch (Exception e) {
			// TODO: handle exception
		}
		while(!isStop) {
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
	}
}
 