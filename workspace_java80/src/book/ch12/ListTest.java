package book.ch12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListTest {
	int i;

	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		li.add(0, "사과");
		li.add(1, "포도");
		li.add(2, "딸기");

		Map<String, Object> map = new HashMap<>();

		map.put("2", 100);
		map.put("3", 10);
		map.put("1", 10);

		System.out.println(map.get("2"));

		for (Object obj : map.keySet().toArray()) {
			System.out.println(obj);
		}
	}
}
