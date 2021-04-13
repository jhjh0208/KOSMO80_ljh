package Gnyang;
//**** 만들기
// ***
//  **
//   *
import java.util.Scanner;

public class samgakhyung {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int 길이를입력하시오 = sc.nextInt();
		
		
		for(int i=1;i<=길이를입력하시오;i++) {
			for(int j = 1; j<=길이를입력하시오;j++) {
				if(i<=j) {
					System.out.print("*");
				}else if (i>=j) {
					System.out.print(" ");
				}
				}
				System.out.println();
			}
		}
		
		}
		
			
	
	

