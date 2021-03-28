package Gnyang;

public class Q3 {
	//1부터 100까지 출력하는데 5의 배수가 나오면 fizz 7의 배수가 나오면 buzz 5,7 공배수가 나오면 fizz buzz출력
	public static void main(String[] args) {
		int i = 1;
		int j = 1;
//		for(i=1;i<=100;i++) {
//			if(i%5==0 & i%7==0) {
//				System.out.println("fizz buzz");
//			} 
//			else if(i%7==0) {
//					 System.out.println("buzz");
//				}
//			else if(i%5==0) {
//				System.out.println("fizz");
//			}
//			else {
//				System.out.println(i);
//			}
//			
//		}
		while(i<100) {
			if(i%5==0 & i%7==0) {
				System.out.println("fizz buzz");
			}
			else if (i%7==0) {
				System.out.println("fizz");
			}
			else if (i%5==0) {
				System.out.println("buzz");
			}
			else {
				System.out.println(i);
			}
			i++;
			}
		}
	}


