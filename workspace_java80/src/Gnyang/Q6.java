package Gnyang;

import java.util.Scanner;

public class Q6 {
	Scanner sc = new Scanner(System.in);
	Q6 q6 = null;
	int i;
	boolean isFlag = false;
	
	public Q6() {
		methodA();
	}
		public void methodA() {
			while(!isFlag) {
				i = sc.nextInt();		
				if (i==0 | i==1) {
					isFlag = true;
					if(i!=0) {
						System.out.println("0");
					}
					else if(i!=1) {
						System.out.println("1");
					}
					
				}
				else {
					System.out.println("0또는 1만 입력하세요");
				}
				
			}
			
			
		}
	
	public static void main(String[] args) {
		new Q6();
	}

}
