package collection;

import java.util.HashSet;

public class HashSetTest2 {

	public static void main(String[] args) {
		HashSet<Money> s = new HashSet<Money>();

		s.add(new Money(1));
		s.add(new Money(2));
		s.add(new Money(3));
		s.add(new Money(1));

		// 순회
		// 1. Hash Code 비교
		// 2. equals 비교
		// 위에 1. 2.의 순서로 비교하는 이유는 성능 때문이다.

		for (Money m : s) {
			System.out.println(s);
		}

	}

}
