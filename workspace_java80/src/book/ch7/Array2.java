package book.ch7;

public class Array2 {
	int x = 3;
	String[] names = null;
	String[] enames = {"SMITH","KING","MIKE"};
	
	public static void main(String[] args) {
		Array2 a2 = new Array2();
		boolean[] isOK = new boolean[a2.x];
		for(boolean bo:isOK) {
			System.out.println(bo);//전체를 조회할 때.
		}
		a2.names = new String[a2.x];
		a2.names = new String[] {"이순신","강감찬","홍길동"};
	}

	
}
