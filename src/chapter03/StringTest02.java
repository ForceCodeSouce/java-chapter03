package chapter03;

public class StringTest02 {
	
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";
		String s3 = s2;
		
		s2 = s1.toUpperCase();
		String s4 = s2.concat("??");
		
		//"!!".toString();	//객체가 1개 생성됨!!!
	
		//Method chain 가능
		//내부에서 새로운 String 객체를 만들어서 자기의 값을 변경!!!
		String s5 = "!!".concat(s2).concat("@");
		
		//객체와 객체를 더한다. 
		//원래는 못하는 코드이다
		// String s = "abc";
		// String a = "efg";
		// s + a = "abcefg" //이러식의 코드는 원래 안되는데, JVM이 내부적으로 동작해서 가능하게 해주는 것이다.
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}

}
