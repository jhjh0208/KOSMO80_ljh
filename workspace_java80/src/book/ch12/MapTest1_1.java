package book.ch12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class MapTest1_1 {
//	void methodA() {
//		List<String> li = new ArrayList<>();
//		li.add(0, "사과");
//		li.add(1, "포도");
//		li.add(2, "딸기");
//		li.add(3,"수박");
//		li.add(4,"참외");
//
//		for (String fruit : li) {
//			System.out.println(fruit);
//		}
//	}

	void methodB() {
		Map<String, Object> map = new HashMap<>();
		map.put("one", "사과");
		map.put("two", "포도");
		map.put("three", "딸기");
		System.out.println(map.get("one"));
		
		Object[]	keys	= null;
		Set			set		= map.keySet();
		keys = set.toArray();

		for (int i = 0; i < keys.length; i++) {
			String	key	= (String) keys[i];
			String	val	= String.valueOf(map.get(key));
			System.out.println(key + "," + val);

		}
	}

	public static void main(String[] args) {
		MapTest1_1 mt1 = new MapTest1_1();
//		mt1.methodA();
		mt1.methodB();
	}

}
