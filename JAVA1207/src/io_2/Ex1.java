package io_2;

import java.io.IOException;
import java.io.OutputStream;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 모니터로 데이털르 출력하는 방법
		 * 1. 기본 출력스트림인 OutputStream 사용(byte 단위로 처리)
		 * - write() 메서드를 호출하여 byte 단위 출력
		 * - byte 단위로 처리되므로 문자열 데이터 자체를 처리할 수 없음
		 */
		
		// OutputStream 객체를 연결하기 위해서는 System.out 사용
//		OutputStream os = System.out;
		
//		char ch = 'A';
//		char ch = '강'; // 1Byte 단위가 아닌 문자는 출력 불가
		
//		try(OutputStream os = System.out) {
//			os.write(ch);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		// =============================================================================
		// String 타입 데이터(문자열)를 OutputStream 으로 출력
		String str = "Hello, 자바!";
		try(OutputStream os = System.out) {
			os.write(str.getBytes()); // 한글, 한자 및 문자열도 출력 가능
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
