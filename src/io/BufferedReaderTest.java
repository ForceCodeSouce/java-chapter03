package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {

		BufferedReader br = null;
		// 기반스트림
		try {
			FileReader fr = new FileReader("./src/io/BufferedReaderTest.java");

			// 보조스트림
			// 한줄씩 한줄씩 읽어오는 기능!!!!
			br = new BufferedReader(fr);
			
			int index = 0;
			String line = null;
			while ((line = br.readLine()) != null) {
				index++;
				System.out.print(index + ":");
				System.out.print(line);
				System.out.print("\n");
			}

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("File Not Found :" + e);

		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("error :" + e);
		} finally {
			try {
				if(br != null) {
				br.close();
				}
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println("IOException : " + e);
			}

		}
	}

}
