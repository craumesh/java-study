package io_1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 키보드로부터 데이터를 입력받아 처리하는 방법
		 * 5. BufferedReader 객체를 사용하여 String 단위로 입력 데이터를 처리하는 방법
		 * - InputStream 객체를 파라미터로 갖는 InputStreamReader 객체 생성 후
		 * 	다시 InputStreamReader 객체를 파라미터로 갖는 BufferedReader 객체를 생성
		 * 	=> 보조스트림을 사용하는 스트림 체이닝(Stream Chaining) 방식 문법 구성
		 * 	=> 이처럼 기본스트림을 꾸며주는 역할을 하는 보조스트림을 적용하여
		 * 		입출력을 처리하는 방식을 데코레이션패턴(Decoration Pattern) 이라고 함
		 * - read() 메서드가 아닌 readLine() 메서드를 사용하여 String 단위로 처리
		 * 	=> 즉 데이터를 한 문장(라인 = 엔터키 기준) 단위로 읽어들여 처리
		 * - 키보드를 통해 임력되는 데이터를 처리하는 최종적인 방법(가장 효율적)
		 */
		
		// 스트림 체이닝을 통한 데코레이션 패턴 구현
		// 1. 기본 입력스트림 객체(InputStream) 생성 = byte 단위 처리
//		InputStream is = System.in;
		
		// 2. 입력스트림을 연결하는 보조스트림 InputStreamReader 객체 생성 = char 단위 처리
//		InputStreamReader reader = new InputStreamReader(is);
		
		// 3. 향상된 입력 보조스트림 BufferedReader 객체 생성 = String 단위 처리
//		BufferedReader buffer = new BufferedReader(reader);
		
//		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("데이터를 입력하세요 : ");
		
		try(BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in))) {
			String str = buffer.readLine();
			while(str != null) {
				System.out.println("입력된 문자열 : "+str);
				str = buffer.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
