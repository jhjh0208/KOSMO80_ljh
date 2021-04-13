package Gnyang;

public class Diamond {
	String s = "*";
	public Diamond() {
		logic();
	}
	public void logic() {

		for(int i = 4; i <= 5; i--) {
			for(int j = 4 ; j<=5;j--) {
				
				System.out.print("*");				
			}
			System.out.println("");
		}
	}
		
	
	
	public static void main(String[] args) {
		new Diamond();
	
	}

}
