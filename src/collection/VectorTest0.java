package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest0 {
	
	//Vector 1.4버전때의 자료구조
	public static void main(String[] args) {
		
		//다른 타입을 저장한다는 의미
		Vector<String> v = new Vector<String>();
		
		v.addElement("둘리");
		v.addElement("마이콜");
		v.addElement("또치");
		
		//순회1
		//Random하게 index에 접근하는 방식
		int count = v.size();
		for(int i = 0; i < count; i++) {
			String s = v.elementAt(i);
			System.out.println(s);
		}
		
		//이렇게 사용해야 한다. 
		//remove를 사용하면 안된다.
		//혼합해서 사용하지 말아라!!!
		v.removeElementAt(1);
		
		//순회2
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s);
		}
		
		
	}

}
