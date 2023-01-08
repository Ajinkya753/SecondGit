package com;

public class StringOperation {
	public static void AlphabetsInstring(String str) {
		int count =0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z'
			|| str.charAt(i)>='A' && str.charAt(i)<='Z') {
				count++;
			}
		}
		System.out.println("Number of alphabets in Strings are " + count);
	}
}
