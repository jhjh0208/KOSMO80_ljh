package Gnyang;

public class GetSet2 {

	public static void main(String[] args) {
		GetSet gs = new GetSet();
		System.out.println(gs.q);
		System.out.println(gs.w);
		System.out.println(gs.a);
		System.out.println(gs.b);
		int p = 11;
		p = gs.geta();
		System.out.println(p);
		int o = 15;
		gs.setA(o);
		System.out.println(gs.a);
		String l = "qweq";
		gs.setQ(l);
		System.out.println(gs.q);
	}

}
