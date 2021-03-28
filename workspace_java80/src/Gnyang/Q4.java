package Gnyang;
//5의 배수의 갯수를 구하시오.
public class Q4 {

	public static void main(String[] args) {
		int i;
		int c = 0;
		for(i=1;i<=100;i+=1) {
			if(i%5==0) {
				c+=1;
			}
		}
		System.out.println(c);
	}

}
