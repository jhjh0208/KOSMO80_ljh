package Gnyang;

public class ParamTestReview {

	void getParam(ParamReview P) {
		P = new ParamReview();
		P.ival = 500;
		
		System.out.println(P.ival);
	} 
	
	public static void main(String[] args) {
		ParamReview p = new ParamReview();
		ParamTestReview pt = new ParamTestReview();
		p.ival = 100;
		
		pt.getParam(p);
		System.out.println(p.ival);
	}

}
