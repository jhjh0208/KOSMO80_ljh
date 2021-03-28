package Gnyang;

public class GugudanSimple {
		
	
	
	public static void guguMethod(int x, String y) {
		for(int i = 1;i < 10; i++) {
			System.out.print(x*i+"\t");
			}
		System.out.println(y);
	}
	public static void main(String[] args) {
		for (int j =2; j<10; j++) {
			guguMethod(j,"나석원");
			System.out.println();
		}
	} 
}
