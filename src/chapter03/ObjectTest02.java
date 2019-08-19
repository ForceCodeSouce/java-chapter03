package chapter03;

public class ObjectTest02 {
	
	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		Point p3 = p2;
		
		// == : 두 객체의 동일성 비교
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		
		//equals : 두 객체의 동질성(내용비교)
		//String은 equals를 Overrideing 했다!!!
		//내용비교를 위해서!!!
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		
		//Constant pool을 안타는 녀석
		String s1 = new String("ABC");
		String s2 = new String("ABC");
			System.out.println(s1 == s2);
		 System.out.println(s1.equals(s2));
		 System.out.println(s1.hashCode() + ":" + s2.hashCode());
		 System.out.println(System.identityHashCode(s1) + ":" + System.identityHashCode(s2));
		 
		//Constant pool을 타는 녀석
		String s3 = "ABC";
		String s4 = "ABC";
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3.hashCode() + " : " + s4.hashCode());
		
		//주소기반
		//identityHashCode
		System.out.println(System.identityHashCode(s3) + ":" + System.identityHashCode(s4));
		System.out.println("===================================");
		
		//Integer i1 = 10;
		//Integer i2 = 10;
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		//동질성 비교
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		
		//String equals 좋은 코드
		String s = null;
		System.out.println(equalsHello(s));
	}
	
	public static boolean equalsHello(String s) {
		return s.equals("Hello");
	}

}
