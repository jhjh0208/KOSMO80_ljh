 package nodap;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;



public class nodap1 {
	
	int max = 0;
	int[] nrr = new int[10];
	
	void rnum() {
		Random r = new Random();
		for(int i = 0; i < nrr.length; i++) { 
			nrr[i] = r.nextInt(20);
		}
	}
	
	void maxnum() {
		max = nrr[0];
		for(int i = 0; i < nrr.length; i++) {
			if(max <= nrr[i]) {
				max = nrr[i];
			} 
		}
	}
	
	void printArray() {
		System.out.print("배열 : ");
		for(int i = 0; i < nrr.length; i++) {
			if(i == (nrr.length - 1)) {
				System.out.println(nrr[i]);
			}
			else {
				System.out.print(nrr[i] + ", ");				
			}
		}
		System.out.println("가장 큰 수는 " + max +"입니다");
	}
	
	public static void main(String[] args) {
		nodap1 mn = new nodap1();
		mn.rnum();
		mn.maxnum();
		mn.printArray();
	}

}
