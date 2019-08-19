package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		// Map<Money, Integer> map = new HashMap<Money, Integer>();
		// Money m = new Money(1);
		// map.put(m, 1);
		
		
		//map은 순서가 없다!!
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("one", 1); // Auto Boxing
		map.put("two", 2); // Auto Boxing
		map.put("three", 3); // Auto Boxing

		int i = map.get("two"); // auto Unboxing
		System.out.println(i);

		map.put("three", 333);
		System.out.println(map.get("three"));
		
		//순회
		Set<String> s = map.keySet();
		for(String key : s) {
			int value = map.get(key);
			System.out.println(value);
		}

	}

}
