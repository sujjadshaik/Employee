package EmployeeApp;

import java.util.Scanner;

public class Duplicate {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
	
		
		char[] chararr = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (chararr[i] == chararr[j] && chararr[i] != '*') {
					chararr[j] = '*';
					break;

				} 

			}
		}
		System.out.println(str.valueOf(chararr));
	

	}

}
