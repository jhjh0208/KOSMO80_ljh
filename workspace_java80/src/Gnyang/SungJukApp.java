package Gnyang;

import java.util.Scanner;

public class SungJukApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("과목의 갯수와 점수의 갯수를 입력하세요.");
		int i = sc.nextInt();
		int j = sc.nextInt();
		int [][] jumsu = new int[i][j];
		for(i = 0; i<jumsu.length;i++) {
			for(j =0; j<jumsu.length;j++) {
				if(j==0) {
					System.out.println("java 점수를 입력하세요.");
				}
				else if(j==1) {
					System.out.println("oracle 점수를 입력하세요.");
				}
				else if(j==2) {
					System.out.println("html 점수를 입력하세요.");
				}
				jumsu [i][j] = sc.nextInt();
				
			}
		}
		int hap = 0;
		for(i = 0; i<jumsu.length; i++) {
			hap=hap+jumsu[0][i]; 
		}
		int hap2 = 0;
		for(i = 0; i<jumsu.length; i++) {
			hap2=hap2+jumsu[1][i];    
		}
		int hap3 = 0;
		for(i = 0; i<jumsu.length; i++) {
			hap3=hap3+jumsu[2][i];    
		}
		int[] array = {hap,hap2,hap3};
			double avg  = array[0]/3;
			double avg2 = array[1]/3;
			double avg3 = array[2]/3;
			
		String[] names = {"이재훈", "나석원", "신수원"};
			String name = names[0];
			String name2 = names[1];
			String name3 = names[2];
		
			System.out.println("이름"+"\t"+"java"+"\t"+"oracle"+"\t"+"html"+"\t"+"합"+"\t"+"평균");
			System.out.println("=======================================================");
			System.out.println(name +"\t"+ jumsu[0][0]+"\t"+jumsu[0][1]+"\t"+jumsu[0][2]+"\t"+hap+"\t"+avg);
			System.out.println(name2 +"\t"+ jumsu[1][0]+"\t"+jumsu[1][1]+"\t"+jumsu[1][2]+"\t"+hap2+"\t"+avg2);
			System.out.println(name3 +"\t"+ jumsu[2][0]+"\t"+jumsu[2][1]+"\t"+jumsu[2][2]+"\t"+hap3+"\t"+avg3);
			System.out.println("=======================================================");
			
			
			
		
	}
	
}
