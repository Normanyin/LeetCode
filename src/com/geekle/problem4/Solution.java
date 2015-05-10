package com.geekle.problem4;

public class Solution {
    public static String longestPalindrome(String s) {
    	String subString = new String();
		int length = 0;
    	for (int i = 0; i < s.length(); i++) {
    		int j = 0;
    		if (s.length() ==1 ) {
				subString = s;
				break;
			}
    		
			while (s.charAt(i-j) == s.charAt(i + j + 1)) {
				if (i -j == 0 || i + j + 1 == s.length()) {

					if (length < 2 * j + 2) {
						subString = s.substring( i- j , i + j + 1);
						break;
					}
				}
				j++;
			}
			if (i == j || i + j + 1 == s.length()) {
				break;
			}
			while (s.charAt( i - j - 1) == s.charAt(i + j + 1)) {
				if (i - j - 1==0 || i + j + 1 == s.length()) {
					if (length < j * 2 + 3) {
						subString = s.substring( i- j -1  , i + j + 1);
						break;
					}
				}
				if (s.charAt(i - j - 2) != s.charAt(i + j + 2) ) {
					if (subString.length() < j * 2 + 1) {
						subString = s.substring( i- j -1  , i + j + 1);
						break;
					}
				}
				j++;
			}
		}
        return subString;
    }
    
    public static void main(String[] args) {
		String string  = "aa";
		System.out.println(longestPalindrome(string));
	}
}