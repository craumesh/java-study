package io_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test5_2 {

	public static void main(String[] args) {
		File f = new File("C://temp/source.txt");
		try(BufferedReader br = new BufferedReader(new FileReader(f))){	
			int line = 1;
			String str = br.readLine();
			while(str != null) {
				System.out.println(line+" "+str);
				str = br.readLine();
				line++;
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("객체 입력 완료!");
	}
}
