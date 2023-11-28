package array;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int money = 2685;
		int moneyValue = money;
		int[] coin = {500, 100, 50, 10};
		int[] coinCnt = new int[coin.length];
		
		for(int i = 0; i < coin.length; i++) {
			if(money / coin[i] > 0) {
				coinCnt[i] = moneyValue / coin[i];
				moneyValue = moneyValue - coinCnt[i] * coin[i];
			}
		}
		System.out.printf("money : %d원\n500원 : %d개\n100원 : %d개\n50원 : %d개\n10원 : %d개\n남은 거스름돈 : %d원", money, coinCnt[0], coinCnt[1], coinCnt[2] , coinCnt[3], moneyValue);
	}

}
