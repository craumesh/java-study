package collection_framework;

import java.util.*;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Queue(큐)
		 * - 한 쪽에서 삽입, 반대쪽에서 삭제가 일어나는 구조
		 * - First In First Out(FIFO) 또는 Last In Last Out(LILO) 구조
		 * 	=> 먼저 추가된 요소가 가장 먼저 삭제됨
		 * - Queue 를 상속받아 구현한 LinkedList 클래스 사용
		 * 	=> LinkedList 클래스는 List와 Queue 인터페이스를 모두 구현한 구현체
		 * - 은행의 번호표 시스템, 온라인 게임의 대기열 시스템 등에 사용
		 */
		Queue<Object> ll = new LinkedList<Object>();
		
		// offer() : 데이터 추가 
		ll.offer("1 - Ex1.java");		
		ll.offer("2 - Ex2.java");		
		ll.offer("3 - Ex3.java");		
		ll.offer("4 - Ex4.java");		
		System.out.println(ll);
		
		// peek() : 출구의 요소 확인(제거 X)
		System.out.println(ll.peek());
		System.out.println(ll.peek());
		
		// poll() : 출구의 요소 꺼내기(제거 O)
		System.out.println(ll.poll());
		System.out.println(ll.poll());
		System.out.println(ll.poll());
		System.out.println(ll.poll());
		System.out.println(ll.poll());
		// => 스택과 달리 더 이상 꺼낼 요소가 없으면 에러 대신 null 값 리턴
		
	}

}
