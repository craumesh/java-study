package pass_by;

import java.util.Arrays;

public class TT {

	public static int[] move(String s){  
		int[] rt = new int[2];
        switch(s){
            case "up": rt[1] = 1; break;
            case "down": rt[1] = -1; break;
            case "left": rt[0] = -1; break;
            case "right": rt[0] = 1; break;
            default: ;
        }
		return rt;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] keyinput = {"right", "right", "right", "right", "left"};
		int[] board = {9, 5};
		int[] answer = {0,0};
		
		
		
		System.out.println(Arrays.toString(answer));
	}
}
