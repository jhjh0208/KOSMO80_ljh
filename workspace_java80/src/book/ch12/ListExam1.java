package book.ch12;

import java.util.ArrayList;

public class ListExam1 {
	
	public void methodA() {
		System.out.println();
	}
	public void methodB() {
		
	}
	
	public void methodA() {
		System.out.println();
	}
	public static void main(String[] args) {
		ListExam1 le = new ListExam1();
		ArrayList<String> al = new ArrayList();
		System.out.println("size얼마?"+ al.size());
		al.add("딸기");
		System.out.println("size얼마?"+ al.size());
		le.methodA(al);
		le.methodA(al);
	}

}
