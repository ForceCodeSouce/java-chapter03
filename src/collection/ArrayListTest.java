package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * List 밑에 있는 컬렉션을 사용하기 때문에 코드를 수정하거나 표현하기 편리하다.
 * 즉, Vector로 선언하였더라도, ArrayList로 변경하기 쉽다.
 * 위와 같은 기능을 할 수 있는 이유는 Interface를 사용했기 떄문이다.
 * 
 */

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("둘리");
		list.add("마이콜");
		list.add("또치");

		// 순회1
		int count = list.size();
		for (int i = 0; i < count; i++) {
			String s = list.get(i);
			System.out.println(s);
		}

		// 순회2
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

		// 순회3 (for ~ each)
		for (String s : list) {
			System.out.println(s);
		}
	}

}
