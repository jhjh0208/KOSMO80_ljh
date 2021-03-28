package book.ch7;

public class QuizArray0219 {
	//선언부
	int nums[] = null;
	//배열의 초기화
	void initArray(int size) {
		
	}
	//배열 출력하기
	int maxInArray(int size) {
		int i, imax = 0;
		return max;
	}
	//최대값 구하기
	void printArray(int size) {
		System.out.println("배열 : ");
		if(i!=null) {//너 배열 아니지?
			for(int x=0;x<i.length;x++) {
				System.out.println("%3d", i[x]);
			}////////end of for
			System.out.println();
		}////////////end of if
		
	}
	//main
	public static void main(String[] args) {
		QuizArray0219 qa = new QuizArray0219();
		int size = 10;
		for(int a=0;a<5;a++) {
		qa.initArray(size);
		qa.printArray(size);
		int max = qa.maxInArray(size);
		System.out.println("최대값 : "+max);
		System.out.println("============================================");
	}

}

}