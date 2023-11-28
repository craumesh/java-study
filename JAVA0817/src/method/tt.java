package method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class tt {
	
	public static void main(String[] args) {
//		String s = "1 2 3 4 -5";
//		int max = Integer.MIN_VALUE;
//		int min = Integer.MAX_VALUE;	
		
//		for(int i = 1; i < s.length()-1; i++) {			
//			if(s.charAt(i - 1) == '-') {
//				if(i - 1 == 0) {
//					max = -s.charAt(i) + '0';
//					min = -s.charAt(i) + '0';
//				}
//				max = Math.max(max, -s.charAt(i) + '0');
//	        	min = Math.min(min, -s.charAt(i) + '0');     
//
//			}else {
//				if(i == 0) {
//					max = s.charAt(i-1) + '0';
//					min = s.charAt(i-1) + '0';
//				}
//				max = Math.max(max, s.charAt(i-1) + '0');
//	        	min = Math.min(min, s.charAt(i-1) + '0');
//			}
//		}
		
/////////////////////////////////////////////////////////////////////////////////////////////

//		String[] numbers = s.split(" ");
//
//		for (int i = 0; i < numbers.length; i++) {
//            int num = Integer.parseInt(numbers[i]);
//            max = Math.max(max, num);
//            min = Math.min(min, num);
//        }
//		
//		System.out.println(min + " " + max);
		
/////////////////////////////////////////////////////////////////////////////////////////////

//		String s = "hHELLO wWORLD";
//        
//		char[] chStr = s.toCharArray();
//						
//        for(int i = 0; i < chStr.length; i++){        	
//        	chStr[i] = Character.toUpperCase(chStr[i]);        	
//        	if(i != 0 && chStr[i - 1] != ' ') {
//        		chStr[i] = Character.toLowerCase(chStr[i]);
//        	}
//        }
//        System.out.println(String.valueOf(chStr));
		
/////////////////////////////////////////////////////////////////////////////////////////////

//		int[] A = {1,4,2};
//		int[] B = {5,4,4};
//        int answer = 0;
//        int[] reverseB = new int[B.length];
//        
//        Arrays.sort(A);   
//        Arrays.sort(B);
//        for(int i = B.length; i > 0; i--) {
//        	reverseB[B.length - i] = B[i - 1];
//        }        
//        
//        for(int i = 0; i < A.length; i++){
//            answer += A[i] * reverseB[i];
//        }
//        
//        System.out.println(answer);
		
/////////////////////////////////////////////////////////////////////////////////////////////

//		String s = "(()(";
//		boolean answer = false;
//		char[] chStr = s.toCharArray();
//		int cnt = 0;
//		
//		for(int i = 0; i < chStr.length; i++) {
//			if(chStr[0] == ')' || chStr[i] == ')' && cnt == 0) {
//				cnt++;
//				break;
//			}
//			cnt += chStr[i] == '(' ? 1 : -1;	
//			
//		}
//		if(cnt == 0) {
//			answer = true;
//		}
//		System.out.println(answer);		
		
/////////////////////////////////////////////////////////////////////////////////////////////

//		String s = "0111100011010";
//		int[] answer = new int[2];
//        
//        while(true){
//            char[] chArr = s.toCharArray();
//            for(int i = 0; i < chArr.length; i++){
//                if(chArr[i] == '0') answer[1] += 1;
//            }
//            answer[0] += 1;            
//            String s2 = s.replaceAll("0","");
//            s = Integer.toBinaryString(s2.length());
//            System.out.println(s);
//            
//            if(s2.length() == 1 && s2.charAt(0) == '1') break; 
//        }    
//        System.out.println(Arrays.toString(answer));
		
/////////////////////////////////////////////////////////////////////////////////////////////

//		int n = 15;
//		int answer = 0;
//		
//		boolean[] bArr = new boolean[n + 1];
//		
//		while(bArr[bArr.length-1] == false) {
//	        for(int i = 1; i < bArr.length; i++){ 
//	        	n -= i;
//	        	if(n == 0) {
//	        		answer += 1;
//	        		bArr[i] = true;
//                	break;
//	        	}
//	        	
//	        	if(bArr[i] == false) {
//		        	for(int j = i + 1; j < bArr.length; j++) {        		
//		        		n -= j;                
//		                if(n == 0) {
//		                	answer += 1;
//		                	bArr[i] = true;
//		                	break;
//		                }else if(n < 0) break;		                
//		        	}
//	        	}
//		        n = bArr.length-1;
//	        }
//		}
//		System.out.println(answer);
		
/////////////////////////////////////////////////////////////////////////////////////////////
		
//		int n = 78;
//		int i = n;		
//		while(true){
//            i++;
////          if(Integer.toBinaryString(n).replaceAll("0","").split("1").length == Integer.toBinaryString(i).replaceAll("0","").split("1").length)
//            if(Integer.bitCount(n) == Integer.bitCount(i))
//            {
//            	System.out.println(i);
//                break;            	
//            }
//        }
		
/////////////////////////////////////////////////////////////////////////////////////////////
		
//		int n = 5;
//		int answer = 0;
//		int[] F = new int[n + 1];
//		int cnt = 1;
//		
//		F[0] = 0;
//		F[1] = 1;
//		
//		for(int i = 2; i <= n; i++) {
//			cnt++;
//			F[i] = (F[i-1] + F[i-2]) % 1234567;
//			if(n == cnt) {
//				answer = F[i];
//				break;
//			}
//		}	
//		System.out.println(answer);
		
/////////////////////////////////////////////////////////////////////////////////////////////
	
//		String s = "cdcd";
//		int answer = -1;		
//		char[] chArr = s.toCharArray();
//		
//		while(true) {
//			for(int i = 1; i < chArr.length; i++) {
//				if(chArr[i-1] == chArr[i]) {
//					chArr[i-1] = '\0';
//					chArr[i] = '\0';
//				}
//			}
//			String str = new String(chArr).replaceAll("\0", "");
//			if(str.length() == 0) {
//				answer = 1;
//				break;
//			}
//			
//			if(chArr.length == str.length()) {
//				answer = 0;
//				break;
//			}
//			chArr = str.toCharArray();
//		}
//		System.out.println(answer);
		
		
//		String s = "babaa";
//		int answer = -1;
//		Stack<String> stack = new Stack<>();
//		
//		for(int i = 0; i < s.length(); i++) {
//			if(!stack.isEmpty() && stack.peek().equals(s.split("")[i])) {
//				stack.pop();
//			}else {
//				stack.push(s.split("")[i]);
//			}
//		}
//		answer = stack.size() == 0 ? 1 : 0;
//		System.out.println(answer);
		
		
//		String s = "baabaa";
//		int answer = -1;		
//      Stack<String> stack = new Stack<>();
//		String[] split = s.split("");
//
//        for (int i = 0; i < split.length; i++) {
//            if (!stack.isEmpty() && stack.peek().equals(split[i])) {
//                stack.pop();
//            } else {
//                stack.push(split[i]);
//            }
//        }
//        answer = stack.isEmpty() ? 1 : 0;
//		System.out.println(answer);		
		
/////////////////////////////////////////////////////////////////////////////////////////////
	
//		int n = 5;
//		String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
//		int[] answer = new int[2];
//        int cnt = 0;
//        Stack<String> stack = new Stack<>();
//
//        while (true) {        	
//        	if(words.length == stack.size()) {
//        		break;
//        	}
//        	
//            if (stack.contains(words[cnt])) {
//                answer[0] = cnt % n + 1;
//                answer[1] = cnt / n + 1;
//                break;
//            }
//            
//            if(!stack.isEmpty() && stack.peek().charAt(stack.peek().length()-1) != words[cnt].charAt(0)) {
//            	answer[0] = cnt % n + 1;
//                answer[1] = cnt / n + 1;
//                break;
//            }
//            
//            stack.push(words[cnt]);
//            cnt++;
//
//            if (cnt >= words.length) {
//                cnt = 0;
//            }
//        }
//        System.out.println("Answer: [" + answer[0] + ", " + answer[1] + "]");		
		
/////////////////////////////////////////////////////////////////////////////////////////////

//		long n = 118372;
//		long answer = 0;
//        String s[] = Long.toString(n).split("");   
//        String joinS = "";
//        Arrays.sort(s);
//        for(int i = s.length-1; i >= 0; i--) {
//        	joinS += s[i];
//        }
//        answer = Long.valueOf(joinS);
//        System.out.println(answer);
		
/////////////////////////////////////////////////////////////////////////////////////////////
     
//		int arr[] = {5, 9, 7, 10};
//		int divisor = 5;
//		Queue<Integer> queue = new LinkedList<>();
//        int pollInt = 0;  
//        int cntArr = 0;
//        
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] % divisor == 0){
//                queue.offer(arr[i]);
//            }            
//        }     
//
//        int answer[] = !queue.isEmpty() ? new int[queue.size()] : new int[]{-1};
//        
//        while(queue.isEmpty() == false) {
//        	pollInt = queue.poll();
//		    for(int i = 0; i < queue.size(); i++) {
//		    	if(pollInt > queue.peek()) {
//		    		queue.offer(pollInt);
//			        pollInt = queue.poll();
//			    }else {
//			        queue.offer(queue.poll());
//			    }
//	        }
//        	answer[cntArr++] = pollInt;
//        }
//        System.out.println(answer[0]);
//        System.out.println(answer[1]);
		
/////////////////////////////////////////////////////////////////////////////////////////////
	
//		int[] arr = {4,3,2,1};	
//		int[] answer = new int[arr.length - 1];
//        int minNum = arr[0];
//        int minIdx = 0;
//        int arrIdx = 0;
//        
//        for(int i = 1; i < arr.length; i++){
//            if(minNum > arr[i]){
//                minNum = arr[i];
//                minIdx = i;
//            }
//        }
//        
//        for(int i = 0; i < arr.length; i++){
//            if(i != minIdx){
//                answer[arrIdx++] = arr[i];
//            }
//        }        
//        
//        if(arr.length <= 1) answer = new int[]{-1};
//        
//        for(int i = 0; i<answer.length; i++) System.out.println(answer[i]);
		
/////////////////////////////////////////////////////////////////////////////////////////////
		
//		int left = 13, right = 17;
//		int answer = 0;
//        
//        
//        for(int i = left; i <= right; i++){
//        	int cnt = 0;
//            for(int j = 1; j <= i; j++){
//                cnt += i % j == 0 ? 1 : 0;
//                System.out.println(cnt);
//            }
//            answer += cnt % 2 == 0 ? i : -i;
//        }       
//        
//        System.out.println(answer);
		
/////////////////////////////////////////////////////////////////////////////////////////////

//		String s = "asdasd";
//		String answer = "";
//        List<String> arrayList = new ArrayList<>(Arrays.asList(s.split("")));
//        arrayList.sort(Comparator.reverseOrder());
//        System.out.println(arrayList); 
//        
//        answer = arrayList.toString().replaceAll("\\W","");
//        System.out.println(answer); 
		
/////////////////////////////////////////////////////////////////////////////////////////////
	
//		int arr[] = new int[] {1,1,3,3,0,1,1};
//		Stack<Integer> stack = new Stack<>();
//        
//        for(int i = 0; i < arr.length; i++){            
//            if(!stack.isEmpty() && stack.peek() == arr[i]) continue;
//            stack.push(arr[i]);
//        }
//        
//        int[] answer = new int[stack.size()];
//        
//        for(int i = answer.length; i > 0; i--){
//            answer[i - 1] = stack.pop();
//        }
//        System.out.println(Arrays.toString(answer));
		
/////////////////////////////////////////////////////////////////////////////////////////////

//	    int num = 45;
//		int answer = 0;
//	    final int TRI = 3;
//	    String tri = "";
//
//	    while (num > 0) {
//	        int re = num % TRI;
//	        tri = re + tri;
//	        num /= TRI;
//	    }
//
//	    System.out.println("Original 3-digit reversed: " + tri);
//
//	    String[] triArr = tri.split("");
//
//	    for (int i = 0; i < triArr.length / 2; i++) {
//	        String temp = triArr[i];
//	        triArr[i] = triArr[triArr.length - 1 - i];
//	        triArr[triArr.length - 1 - i] = temp;
//	    }
//
//	    tri = String.join("", triArr);
//	    System.out.println("Reversed 3-digit: " + tri);
//
//	    int power = triArr.length - 1;
//	    for (int i = 0; i < triArr.length; i++) {
//	        int triDigit = Integer.parseInt(triArr[i]);
//	        answer += triDigit * Math.pow(TRI, power);
//	        power--;
//	    }
//	    System.out.println("Answer: " + answer);

		int n = 50010;
		System.out.println((int)Math.ceil((double)100010 / 100 * 5));
		System.out.println((double)50010/100 * 20);
		
	}	
}
