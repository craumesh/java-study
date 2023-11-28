package collection_framework;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {	
		LottoCollect<Integer> lotto = new LottoCollect<Integer>();
		Set<Integer> thisweekLotto = lotto.drawLotto(lotto.setLotto());
		Set<Integer> myLotto = lotto.drawLotto(lotto.setLotto());
		
		System.out.println("이번주 당첨번호 : " + lotto.sortLotto(thisweekLotto));
		System.out.println("나의 로또 번호 : " + lotto.sortLotto(myLotto));
		
		LottoCollect.matchLotto(lotto.sortLotto(thisweekLotto), lotto.sortLotto(myLotto));
	}
}

class LottoCollect <T> {
	
	public Set<T> setLotto() {
		Set<T> Lotto = new HashSet<T>();		
		return Lotto;
	}
	
	public Set<Integer> drawLotto(Set<Integer> Lotto) {
		while(Lotto.size() != 6) {
			Lotto.add((int)(Math.random()*45)+1);
		}		
		return Lotto;
	}
	
	public Set<Integer> sortLotto(Set<Integer> Lotto) {
		Set<Integer> treeSet = new TreeSet<Integer>(Lotto);
		return treeSet;
	}	
	
	public static void matchLotto(Set<Integer> thisWeekLotto, Set<Integer> myLotto) {
		ArrayList<Integer> containsArr = new ArrayList<Integer>();
		int cnt = 0;
		
//		Object[] thisWeekLottoArr = thisWeekLotto.toArray();
//		
//		for(int i = 0; i < thisWeekLottoArr.length; i++) {
//			if(myLotto.contains(thisWeekLottoArr[i])) {
//				containsArr.add((Integer)thisWeekLottoArr[i]);
//				cnt++;
//			}
//		}		
		
		for(int i : thisWeekLotto) {
			if(myLotto.contains(i)) {
				containsArr.add(i);
				cnt++;
			}
		}
		
		System.out.print("번호 일치 개수 : " + cnt + "개" + containsArr.toString() + " - ");		
		switch(cnt) {
		case 6: System.out.println("1등!"); break;
		case 5: System.out.println("2등!"); break;
		case 4: System.out.println("3등!"); break;
		case 3: System.out.println("4등!"); break;
		default: System.out.println("꽝!");
		}
	}
}