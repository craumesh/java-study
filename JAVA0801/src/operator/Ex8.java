package operator;

class Item{
	
	int payMoney;
	String Item_Name;
	String Item_Grade;
	int Item_Enhance_Grade;
	
	public Item(String sItemName, String sItemGrade, int iItemEnhanceGrade) {
		Item_Name = sItemName;
		Item_Grade = sItemGrade;
		Item_Enhance_Grade = iItemEnhanceGrade;		
	}	

	void Enhance() {
		System.out.println("번쩍!");
	    if (ItemEnhance(Item_Grade, Item_Enhance_Grade)) {
	    	if(Item_Enhance_Grade < 15) {
	    		Item_Enhance_Grade++;
	    		System.out.println("강화 성공!");
	    		}
	    	} else {	        
	    	if(Item_Enhance_Grade != 0) {
	    		Item_Enhance_Grade--;
	    		System.out.println("강화 실패...");
	    	}
	    }
	}
	
	boolean ItemEnhance(String sItemGrade, int iItemEnhanceGrade) {
	    int enhanceProbability = 100;

	    switch (sItemGrade) {
	        case "Legend": enhanceProbability = 75; break;
	        case "Rare": enhanceProbability = 80; break;
	        case "Uncommon": enhanceProbability = 90; break;
	        case "Common": break;
	        default:
	    }

	    switch (iItemEnhanceGrade) {
	        case 0:
	        case 1:
	        case 2:
	        case 3:
	        case 4: break;
	        case 5:
	        case 6:
	        case 7:
	        case 8:
	        case 9: enhanceProbability -= 10; break;
	        case 10:
	        case 11: enhanceProbability -= 6; break;
	        case 12: enhanceProbability -= 5; break;
	        case 13: enhanceProbability -= 4; break;
	        case 14: enhanceProbability -= 3; break;
	        default:
	    }
	    return enhanceProbability > (int)(Math.random() * 100);
	}
}

public class Ex8 {
	
	public static void main(String[] args) {
	/* 삼항연산자(?:)
	 * - 피연산자가 3개 , 조건식
	 */
		
		Item Weapon = new Item("서리한", "Legend", 0);
        System.out.println("강화 전 등급: " + Weapon.Item_Enhance_Grade);
        
        for (int i = 0; i < 30; i++) {
        	if(Weapon.Item_Enhance_Grade < 15) {
        		System.out.println("\n강화 " + (i + 1) + "회");
        		Weapon.Enhance();
            	System.out.println(Weapon.Item_Name + " +" + Weapon.Item_Enhance_Grade);
        	}
	    	else {
	    		System.out.println("\n더 이상 강화할 수 없습니다!");
	    		break;
	    	}
        }
	}
}
