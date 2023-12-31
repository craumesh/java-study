package anonymous;

import anonymous.Button.OnClickListener;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBox cb = new CheckBox();
		cb.setOnSelectListener(new CheckBox.OnSelectListener() {
			
			@Override
			public void onSelect() {
				// TODO Auto-generated method stub
				System.out.println("으르렁!");
			}
		});		
		cb.select();
	}

}

class CheckBox {
	static interface OnSelectListener {
		void onSelect();
	}
	
	OnSelectListener listener;
	
	public void setOnSelectListener(OnSelectListener listener) {
		// 매개 변수의 다형성
		this.listener = listener;
	}
	// => 외부에서 구현 객체를 받아 필드에 대입
	
	public void select() {
		listener.onSelect();
	}	
}

class Window2 {
	// 버튼 2개 생성
	CheckBox CheckBox1 = new CheckBox();
	CheckBox CheckBox2 = new CheckBox();
	
	// 필드 초기값을 대입
	// => 필드 초기값으로 익명 구현 객체를 대입
	CheckBox.OnSelectListener listener = new CheckBox.OnSelectListener() {

		@Override
		public void onSelect() {
			System.out.println("애옹");
		}		
	};
	
	public Window2() {
		CheckBox1.setOnSelectListener(listener);
		CheckBox2.setOnSelectListener(new CheckBox.OnSelectListener() {
			
			@Override
			public void onSelect() {
				System.out.println("애옹!");
			}
		});
	}
}