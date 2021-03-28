package book.ch8;

public class SuperNSebTest {
//자녀 클래스의 인스턴스화시 어떻게 부모의 메소드 원형을 알고 있는 것일까?
	public static void main(String[] args) {
		Super sup = new Super();
		Sub sup2 = new Sub();
		//Sub sub2 new Super();
		Sub sub = new Sub();
		sup.methodA();
		//자녀 클래스의 메소드만 호출됨. 이럴 경우 부모메소드는 쉐도우 메소드가 외는 것임.
		sup2.methodA();
		sub.methodA();
		sub.methodB();
		sup2.methodB();
	}

}
