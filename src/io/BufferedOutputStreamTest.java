package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//보조스트림과 main스트림
//보조스트림은 부모 스트림을 찾아라
public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		
		try {

			// 기반스트림 (소스에 연결)
			// 보조스트림을 사용하는 방법
			// 보조스트림을 보면 어떻게 주스트림으로 확장하는 방법을 배울수 있다.
			// 동적으로 확장 - 데코레이션 패턴!!! - Java I/O의 대부분이 이렇게 되어 있다.
			// 상속은 객체 생성없이 코드를 활용
			// bos = new BufferedOutputStream(new FileOutputStream("test.txt"));

			// 기반스트림(소스에 연결)
			FileOutputStream fos = new FileOutputStream("test.txt");

			// 보조스트림(기반 스트림에 연결)
			bos = new BufferedOutputStream(fos);

			for (int i = 'a'; i <= 'z'; i++) {
				bos.write(i);
			}

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("File Not Found : " + e);
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("error : " + e);
		} finally {
			try {
				if (bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}
	}

}
