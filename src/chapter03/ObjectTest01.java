package chapter03;

public class ObjectTest01 {
	
	public static void main(String[] args) {
		Point p = new Point(10,20);
		
		System.out.println(p.getClass());	//reflection - 자기 객체가 어떠한 근거로 만들어 졌는가
		System.out.println(p.hashCode());	//address X
		
		System.out.println(p);				//reference X
		
		// getClass() + "@" + hashCode()
		System.out.println(p.toString());	//address 기반의 hashing 값
		
		//hashing : 문자열이나 문자, boolean 값을 int값으로 바꾸는것!! - 탐색에 많이 사용됨.
		
		String s = "Hello World";
	}

}
