package chapter03;

import java.util.Scanner;

//어떠한 로직을 완성하기 위해 [try - catch]를 사용하면 안된다.
public class NumericStringTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String s = scanner.nextLine();

		// Integer를 의미하는 정규표현식
		// "-?\\d+(\\.\\d+)?"
		// 아래와 같이 코드를 간편화 시키는것이 좋다!!!!
		if (s.matches("-?\\d+") == false) {
			System.out.println("숫자를 입력해야 합니다 : ");
			return;
		}

		int value = -1;
		value = Integer.parseInt(s);

		/*
		 * try { value = Integer.parseInt(s); }catch(NumberFormatException e) {
		 * System.out.println("숫자만 입력해야 합니다."); return; }
		 */

		System.out.println(value);
	}

}
