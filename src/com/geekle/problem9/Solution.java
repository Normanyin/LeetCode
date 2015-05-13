package com.geekle.problem9;

public class Solution {
	public static boolean isPalindrome(int x) {
		int temp = 0;
		if (x < 10 && x >=0) {
			return true;
		}
		if (x > 0 && x%10 == 0 ) {
			return false;
		}
		while (x > 0) {
			if (temp == x) {
				return true;
			} else if (temp == x/10) {
				return true;
			}
			else {
				temp = temp * 10 + x % 10;
				x = x/10;
			}
		}
        return false;
    }
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(100));
	}
}
