package thread;

public class Ex3 {

	public static void main(String[] args) {
		// Runnable 인터페이스 구현체 클래스의 인스턴스 생성
//		YourThread yt1 = new YourThread("A작업", 100000);
//		YourThread yt2 = new YourThread("B작업", 100000);
//		YourThread yt3 = new YourThread("C작업", 100000);
		
		// Runnable 구현체 내부에는 start() 메서드가 존재하지 않는다
		// => 애초에 Runnable 인터페이스 내에도 없는 메서드이다
		// Thread 클래스의 인스턴스 생성 시 생성자 파라미터에 Runnable를 전달 가능하다
		// => Thread 객체의 start() 메서드를 통해 간접적으로 멀티쓰레딩 수행가능하다
//		Thread t1 = new Thread(yt1);
//		Thread t2 = new Thread(yt2);
//		Thread t3 = new Thread(yt3);
		
		// --------------------------------------------------------------------------------
		// YourThread 타입 변수(ytn)는 Thread 생성자에 전달 작업 외에 불필요
		// => 1회성 변수를 선언하기 보다 생성자에 인스턴스를 바로 전달 가능하다
		
		Thread t1 = new Thread(new YourThread("A작업", 100000));
		Thread t2 = new Thread(new YourThread("B작업", 100000));
		Thread t3 = new Thread(new YourThread("C작업", 100000));		
		
		t1.start();
		t2.start();
		t3.start();
	}

}

class A{}

/*
 * 이미 A클래스를 상속받은 YourThread 클래스에 멀티쓰레딩을 구현해야하는 경우
 * => Thread 클래스를 상속받지 못함(= 다중 상속 불가)
 * => Runnable 인터페이스를 구현해야함
 */

class YourThread extends A implements Runnable {
	String name;
	int count;
	
	public YourThread(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < count; i++) {
			System.out.println(name + " : " + count);
		}
	}
	
	
}