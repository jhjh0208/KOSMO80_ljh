package Gnyang;

import java.util.Arrays;
import java.util.Random;

//로또
public class Q17 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] ar = new int[6];
		
		ar[0] = r.nextInt(45) + 1;
		
		for(int i = 1; i < ar.length; i++) {
			ar[i] = r.nextInt(45) + 1;
			
			for(int x = 0; x < i; x++) {
				if(ar[x] == ar[i]) {
					i--;
				}
			}/////////end of inner for
			
		}/////////////end of outer for
	 
		for (int index : ar) {
			System.out.print(index + " ");
		}
		
	}/////////////////end of main
} 
				
			
		
	
	
 		
