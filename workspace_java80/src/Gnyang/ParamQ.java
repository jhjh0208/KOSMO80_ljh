package Gnyang;

import java.util.Scanner;

public class ParamQ {
	
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	String b = sc.next();
	int c = sc.nextInt();

	public int cal(int a, String b, int c) {
		
		int result = 0;
		
		if(b.equals("+")) {
			result = a+c;
		} else if(b.equals("*")) {
			result = a*c;
		}
		return result;
	}
	
//	public int gop(int i, int j) {
//		return i*j;
//	}
//	public int hap(int i, int j) {
//		return i+j;
//	}
		
	public static void main(String[] args) {
		ParamQ pq = new ParamQ();
		System.out.println(pq.cal(pq.a, pq.b, pq.c));
	}
}
