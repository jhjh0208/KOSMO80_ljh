package athread.talk2;
/*******************************************************
 * 이벤트 핸들러의 역할은 말하기 이고
 * 클라이언트측의 스레드 역할은 듣기이다.
 * @author user
 *
 */

import java.util.StringTokenizer;
import java.util.Vector;

public class as97164ClientThread extends Thread{
	as97164Client as97164c = null;
	public as97164ClientThread(as97164Client as97164c) {
		this.as97164c = as97164c;
	}
	@Override
	public void run() {
		boolean isStop = false;
		while(!isStop) {
			try {
				String msg = "";//100#apple
				msg = (String)as97164c.ois.readObject();
				StringTokenizer st = null;
				int protocol = 0;//100|200|201|202|500
				if(msg !=null) {
					st = new StringTokenizer(msg,"#");
					protocol = Integer.parseInt(st.nextToken());//100
				}
				switch(protocol) {
					case 100:{//100#apple
						String nickName = st.nextToken();
						as97164c.jta_display.append(nickName+"님이 입장하였습니다.\n");
						Vector<String> v = new Vector<>();
						v.add(nickName);
						as97164c.dtm.addRow(v);
					}break;
					case 200:{
						
					}break;
					case 201:{
						String nickName = st.nextToken();
						String message = st.nextToken();
						as97164c.jta_display.append("["+nickName+"]"+message+"\n");
						as97164c.jta_display.setCaretPosition
						(as97164c.jta_display.getDocument().getLength());					
					}break;
					case 202:{
						String nickName = st.nextToken();
						String afterName = st.nextToken();
						String message = st.nextToken();
						//테이블에 대화명 변경하기
						for(int i=0;i<as97164c.dtm.getRowCount();i++) {
							String imsi = (String)as97164c.dtm.getValueAt(i, 0);
							if(nickName.equals(imsi)) {
								as97164c.dtm.setValueAt(afterName, i, 0);
								break;
							}
						}
						//채팅창에 타이틀바에도 대화명을 변경처리 한다.
						if(nickName.equals(as97164c.nickName)) {
							as97164c.setTitle(afterName+"님의 대화창");
							as97164c.nickName = afterName;
						}
						as97164c.jta_display.append(message+"\n");
					}break;
					case 500:{
						String nickName = st.nextToken();
						as97164c.jta_display.append(nickName+"님이 퇴장 하였습니다.\n");
						as97164c.jta_display.setCaretPosition
						(as97164c.jta_display.getDocument().getLength());
						for(int i=0;i<as97164c.dtm.getRowCount();i++) {
							String n =(String)as97164c.dtm.getValueAt(i, 0);
							if(n.equals(nickName)) {
								as97164c.dtm.removeRow(i);
							}
						}
					}break;
				}////////////end of switch
			} catch (Exception e) {
				// TODO: handle exception
			}
		}////////////////////end of while
	}////////////////////////end of run

		
	}
	/*
	@Override
	public synchronized void run() {
		
	}
	@Override
	public void run() {
		synchronized(this) {
			
		}
	}
	*/



