package Gnyang;

import java.util.Vector;

public class ForEach {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();

		for(int i = 0; i < 10; i++ )
			v.add("" + i);
		
		for (String s : v)
			System.out.println(s);
		
	}

}