package book.ch8;

public class Super {
	String title = null;
	public Super() {
		System.out.println("Super() 호출성공");
	}
	public Super(String title) {
		System.out.println("Super(String) 호출성공");
		this.title = title;
	}
	public void methodA() {
		System.out.println("Super(String) 호출성공");
	}
}
