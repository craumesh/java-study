package io_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("입력 문자열 : ");
		
		try(BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in))) {
			OutputStream os = System.out;
			String str = "입력한 데이터는 '"+buffer.readLine()+"' 입니다";
			os.write(str.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
