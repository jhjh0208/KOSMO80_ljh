package athread.talk1;

public class TalkClientThread extends Thread {
	TalkClient tc = null;
	
	
	public TalkClientThread(TalkClient talkClient) {
		this.tc = talkClient;//조립이다. 연결
	}


	@Override
	public void run() {//여기는  듣는 곳이다.
		System.out.println("run호출 성공");
	}
}
 