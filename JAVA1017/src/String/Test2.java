package String;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTest str = new StringTest();
		str.setJumin("999999-5010111");
		str.checkJumin1();
		str.checkJumin2();
		
		System.out.println("================================================================");
		
		StringTest2 str2 = new StringTest2();
		str2.setAddress("Address : 부산광역시 부산진구 동천로 109 삼한골든게이트");
		System.out.println(str2.adrSubString());
		
		System.out.println("================================================================");
		
		StringTest3 str3 = new StringTest3();
		str3.setAddress("Address : 부산광역시 부산진구 동천로 109,Floor : 7층,Tel : 051-803-0909");
		for(int i = 0; i < str3.splitStr().length; i++) {
			System.out.println(str3.splitStr()[i]);
		}

		System.out.println("================================================================");
		
		for(int i = 0; i < str3.splitStr().length; i++) {
			str3.splitStr2(str3.splitStr()[i]);
		}
		
		
	}

}

class StringTest{
	private String jumin;

	public void setJumin(String jumin) {
		this.jumin = jumin.split("-")[1];
	}
	
	public void checkJumin1() {		
		if(jumin.charAt(0) == '1' || jumin.charAt(0) == '3') {
			System.out.println("남성");
		} else if(jumin.charAt(0) == '2' || jumin.charAt(0) == '4') {
			System.out.println("여성");
		} else {
			System.out.println("외국인");
		}
	}	
	
	public void checkJumin2() {		
		switch(jumin.charAt(0)) {
		case '1': case '3':
			System.out.println("남성"); break;
		case '2': case '4':
			System.out.println("여성"); break;
		default :
			System.out.println("외국인");
		}
	}	
}

class StringTest2 {
	private String address;

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String adrSubString() {
		return address.substring(10);
	}
}

class StringTest3 {
	private String address;
	private String[] addStr;

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String[] splitStr() {
		return address.split(",");
	}
	
	public void splitStr2(String str) {
		addStr = str.split(":");
		for(int i = 0; i < addStr.length; i++) {
			if(i % 2 != 0)
			System.out.print(addStr[i] + " ");
		}
	}
}

