package exam;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class substring {

	
	public static void main(String[] args) {
		System.out.println("Enter String: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int count = 0;
		int n = input.length();
		char str[] = input.toCharArray();
		boolean checkDuplicate = false;
		boolean checkStrWithMiddle = false;
		 for (int len = 1; len <= n; len++) {
	            for (int i = 0; i <= n - len; i++) {
	                int j = i + len - 1;
	                String temp = "";
	                for (int k = i; k <= j; k++) {
	            		temp += str[k]; //System.out.print(str[k]);
	                }
	                System.out.println(temp);
	                checkDuplicate = getDuplicate(temp);
            		checkStrWithMiddle = checkStrWithMiddleChar(temp);
            		if(checkDuplicate == true || checkStrWithMiddle == true) {
            			count++;
            		}

	            }
	        }
		
		System.out.println(count);
		
	}

	private static boolean checkStrWithMiddleChar(String str) {
		if(str.length() % 2 == 0) return false;
		for(int i = 0, j = str.length()-1; i < j; i++, j--) {
			if(str.charAt(i) != str.charAt(j)){
				return false;
			}
		}
		
		return true;
	}

	private static boolean getDuplicate(String inputstr) {
		

		char str[] = inputstr.toCharArray();
		int n = str.length;
		
		HashSet<Character> s = new LinkedHashSet<>(n - 1);
		for (char x : str)
			s.add(x);
		
		if(s.size() > 1) return false;
		return true;
	}
}