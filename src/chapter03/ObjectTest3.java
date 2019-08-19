package chapter03;

import java.util.HashSet;

public class ObjectTest3 {
	
	public static void main(String[] args) {
		HashSet<Point> set = new HashSet<Point>();
		
		set.add(new Point(10, 20));
		set.add(new Point(20, 10));
		set.add(new Point(1,  10));
		
		System.out.println(set);
	}

}
