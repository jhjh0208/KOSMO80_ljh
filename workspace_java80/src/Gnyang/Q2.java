package Gnyang;
//1부터 10까지 수중에 짝수를 출력하고 짝수의 합을 출력한거.
public class Q2 {

	public static void main(String[] args) {
		int hap = 0;
		int i;
	for(i = 1;i<=10;i++) {
		if(i%2==0) {
			System.out.println(i);
			hap=hap+i;
		}
		if(i==10) {
			System.out.println("===============");
			System.out.println(hap
					);
		}
	} 
	//System.out.println(i);

	}

}

