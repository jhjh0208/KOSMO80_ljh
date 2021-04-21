package Gnyang;

public class QQ1 {

	public void testIfA() {

		if (testIfB("True")) {
			System.out.println("True");
		}
		else {
			System.out.println("Not true");
		}
	}

	public Boolean testIfB(String str) {
		return Boolean.valueOf(str);
		
	}

	public static void main(String[] args) {
		QQ1 qq1 = new QQ1();
		qq1.testIfA();
	}

}
