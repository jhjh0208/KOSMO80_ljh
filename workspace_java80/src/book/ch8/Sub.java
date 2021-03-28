package book.ch8;

public class Sub extends Super {
	public Sub() {
		System.out.println("Sub() 호출성공");
	}
	public Sub(String title) {
		System.out.println("Sub(String) 호출성공");
		this.title = title;
	}
	@Override
	public void methodA() {
		System.out.println("Sub methodA 호출성공");
	}
	public void methodA(int x){
		System.out.println("Sub methodA(int) 호출성공");
	}
	public void methodB() {
		System.out.println("Sub methodB 호출성공");
	}
}
