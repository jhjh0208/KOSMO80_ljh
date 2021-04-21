package Gnyang;

//**** 만들기
// ***
//  **
//   *
import java.util.Scanner;

public class samgakhyung2 {

	public static void main(String[] args) {
		Scanner	sc		= new Scanner(System.in);
		int		length	= sc.nextInt();

		for (int i = 0; i < length; i++) {

			for (int j = 0; j <= length; j++) {

				if (i >= j) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		for (int k = 1; k < length; k++) {
			
			for (int s = 0; s < length; s++) {
				
				if (k <= s) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}


			
			
			
			
			}
			
	
			
		
	


