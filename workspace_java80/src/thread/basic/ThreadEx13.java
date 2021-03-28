package thread.basic;

class A extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<300;i++) {
			System.out.print("-");
		}
		System.out.println("[[[A스레드 run]]]");
	}//////////////end of rum////////////////
}/////////////////end of A//////////////////
class B extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<300;i++) {
			System.out.print("|");
		} 
		System.out.println("[[[B스레드 run]]]");
	}/////////////end of run/////////////////
}/////////////////end of B////////////////////
public class ThreadEx13 {
	
	static long startTime = 0;
	/*
	29[main thread시작]-30[2:스레드로딩-ready-go->32[대기중]]-31-32[A run call] - 33[B run call] 
	4-5-6(------|||||||--------|||||||----------------)
	14-15-16(||||||||||||-------|||||||||||||||||||)
	42 */	
	public static void main(String[] args) {
		A th1 = new A();
		B th2 = new B();
		th1.start();//콜백 메소드인 run 호출
		th2.start();
		//시간을 계산함. - 스레드가 뛰는 시간 (스케줄)
		startTime = System.currentTimeMillis();
		/*
		try {
			th1.join(); //th1의 작업이 끝날 때까지 기다린다.
			th2.join(); //th2의 작업이 끝날 때까지 기다린다.
		} catch(InterruptedException e) {}
		*/
		System.out.println("소요시간:" + (System.currentTimeMillis() - ThreadEx13.startTime ));	
	}   // main

}
