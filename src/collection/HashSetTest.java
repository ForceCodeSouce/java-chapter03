package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		String s1 = new String("고길동");
		String s2 = new String("고길동");
		
		set.add("둘리");
		set.add("마이콜");
		//set.add("둘리");	//1. Hash Code비교 / Set은 중복을 허용하지 않는다.
		set.add(s1);
		//set.add(s2);		//다른 객체이지만 2. equals를 비교한다.
		//결론적으로, Set은 값 기반이다.
		
		//Set은 주소가 아니라 값을 기반으로 비교한다.
		System.out.println(set.contains(s2));	//값을 비교하기 때문에, 결과를 True를 반환한다.
		
		set.remove(s2);
		
		//순회
		// 1. Hash Code 비교
		// 2. equals 비교
		for(String s : set) {
			System.out.println(s);
		}
		
	}

}
