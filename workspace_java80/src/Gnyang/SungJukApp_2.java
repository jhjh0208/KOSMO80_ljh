package Gnyang;

import java.util.Scanner;


public class SungJukApp_2 {
		int i = 0;
		int j = 0;
		Scanner sc = new Scanner(System.in);
		int hap = 0;
		int hap2 = 0;
		int hap3 = 0;
		int [][] jumsu = null;
		String[] names = {"이재훈", "나석원", "신수원"};
		int[] array = new int[3];
		double avg  = 0.0;
		double avg2 = 0.0;
		double avg3 = 0.0;
		
	public void methodA() {
		System.out.println("과목의 갯수와 점수의 갯수를 입력하세요."); 
		i = sc.nextInt();
		j = sc.nextInt();
	}
	
	public void acount() {
		jumsu = new int[i][j];
		for( i = 0;  i< jumsu.length; i++) {
			for( j =0;  j< jumsu.length; j++) {
				if( j==0) {
					System.out.println( names[i]+"의 "+"java 점수를 입력하세요.");
				}
				else if( j==1) {
					System.out.println( names[i]+"의 "+"oracle 점수를 입력하세요.");
				}
				else if( j==2) {
					System.out.println( names[i]+"의 "+"html 점수를 입력하세요.");
				}
				 jumsu [ i][ j] =  sc.nextInt();
				
			}
		}
		for(i = 0; i<jumsu.length; i++) {
			hap=hap+jumsu[0][i]; 
		}
		for(i = 0; i<jumsu.length; i++) {
			hap2=hap2+jumsu[1][i];    
		}
		for(i = 0; i<jumsu.length; i++) {
			hap3=hap3+jumsu[2][i];  
			
		}
		array[0] = hap;
		array[1] = hap2;
		array[2] = hap3;
	}
	

	public void methodB() {
		avg=array[0]/3;
		avg2=array[1]/3;
		avg3=array[2]/3;
	}
	
	
	public static void main(String[] args) {
		SungJukApp_2 sj = new SungJukApp_2();
		sj.methodA();
		sj.acount();
		sj.methodB();

			System.out.println("이름"+"\t"+"java"+"\t"+"oracle"+"\t"+"html"+"\t"+"합"+"\t"+"평균");
			System.out.println("=======================================================");
			System.out.println(sj.names[0] +"\t"+ sj.jumsu[0][0]+"\t"+sj.jumsu[0][1]+"\t"+sj.jumsu[0][2]+"\t"+sj.hap+"\t"+sj.avg);
			System.out.println(sj.names[1] +"\t"+ sj.jumsu[1][0]+"\t"+sj.jumsu[1][1]+"\t"+sj.jumsu[1][2]+"\t"+sj.hap2+"\t"+sj.avg2);
			System.out.println(sj.names[2] +"\t"+ sj.jumsu[2][0]+"\t"+sj.jumsu[2][1]+"\t"+sj.jumsu[2][2]+"\t"+sj.hap3+"\t"+sj.avg3);
			System.out.println("=======================================================");
			
			
			
		
	}
	
}
