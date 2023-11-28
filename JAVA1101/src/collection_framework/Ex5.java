package collection_framework;

import java.util.*;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Stack(스택)
		 * - 하나의 상자에 데이터를 아래쪽(Bottom)에서부터 차례대로 쌓는 구조
		 * - 데이터가 한쪽(Top) 에서만 삽입과 삭제가 이루어짐
		 * 	=> First In Last Out(FILO) 또는 Last In First Out(LIFO) 구조
		 * - toString() 메서드 오버라이딩 되어 있음
		 * - 2개의 스택을 사용하면 웹브라우저의 뒤로/앞으로 기능이나
		 * 	응용프로그램의 Redo/Undo 기능 구현 가능
		 */
		
		Stack<Object> stack = new Stack<Object>();
		
		// push() : 데이터 추가
		stack.push("1 - www.itwillbs.co.kr");
		stack.push("2 - www.naver.com");
		stack.push("3 - www.google.com");
		System.out.println("모든 요소 출력 : " + stack);
		
		// peek() : TOP 에 위치한 요소 확인(제거 X)
		System.out.println("맨 위 요소 확인 : " + stack.peek());
		System.out.println("맨 위 요소 확인 : " + stack.peek());
		
		// pop() : TOP 에 위치한 요소 꺼내기(제거 O) - 더 이상 꺼낼 요소가 없을 경우 에러
		System.out.println("맨 위 요소 꺼내기 : " + stack.pop());
		System.out.println("맨 위 요소 꺼내기 : " + stack.pop());
	}

}
