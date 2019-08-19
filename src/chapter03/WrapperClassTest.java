package chapter03;

public class WrapperClassTest {
	
	//Wrapper
	public static void main(String[] args) {
		Integer i = new Integer(10);
		Character c = new Character('A');
		Boolean b = new Boolean(true);
		
		
		//int k = 10; //이건 권장하지 않는다.
		
		//Auto Boxing
		Integer i2 = 10;	// 객체가 자동생성 - construct
		Integer i3 = 20;
		
		System.out.println(i2 == i3);
		
		//기본 타입과 객체를 더하고 있는 모습
		//int j = 20 + i2;
		
		//Auto Unboxing
		//int j = 20 + i2.intValue();
		
		
		System.out.println(i);
		System.out.println(c);
		System.out.println(b);
		
	}

}
