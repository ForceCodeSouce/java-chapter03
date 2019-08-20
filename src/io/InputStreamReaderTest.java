package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		FileInputStream fis = null;;
		InputStreamReader isr = null;;
		
		try {

			// fis = new FileInputStream("ms949.txt");

			isr = new InputStreamReader(new FileInputStream("ms949.txt"), "MS949");

			int data = -1;
			int count = 0;
			while ((data = isr.read()) != -1) {
				System.out.println((char) data);
				count++;
			}
			System.out.println(count);

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("File Not Found :" + e);
		} catch (UnsupportedEncodingException e) {
			// TODO: handle exception
			System.out.println("Unsupported Encoding :" + e);
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("error :" + e);
		} finally {

			try {
				if (isr != null) {
					isr.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			

		}
	}

}
