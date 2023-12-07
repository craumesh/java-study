package io_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C://temp/readme2.txt");
		
		System.out.println("입력하세요 : ");
		String str = "";
		try(BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(new FileWriter(f))) {			
			while(!str.equals(":wq")) {
				str = buffer.readLine();
				pw.println(str);				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
