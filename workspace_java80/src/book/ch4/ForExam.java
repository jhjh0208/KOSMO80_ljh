package book.ch4;

public class ForExam {

	public static void main(String[] args) {
		int i = 0;
		int hap = 0;
		for(i=1;i<=100;i=i+1) {
			System.out.println(i);
			hap = hap+i;
		}
		
		System.out.println("===============");
		System.out.println(hap);
	}

}

//i=1 hap=0   //1
//1=2 hap=1   //3
//i=3 hap=3   //6