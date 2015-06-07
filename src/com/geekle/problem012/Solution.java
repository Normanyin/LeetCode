package com.geekle.problem012;

public class Solution {
	public static String intToRoman(int num) {
		StringBuffer result = new StringBuffer();
		if (num/1000 > 0) {
			for (int i = 0; i < num/1000; i++) {
				result.append("M");
			}
			num = num - (num/1000)*1000;
		}
		if (num/900 > 0) {
			result.append("CM");
			num -= 900;
		}
		if (num/500 > 0) {
			result.append("D");
			num = num - 500;
		}
		if (num/400 > 0) {
			result.append("CD");
			num = num - 400;
		}
		if (num/100 > 0) {
			for (int i = 0; i < num/100; i++) {
				result.append("C");
			}
			num = num - (num/100)*100;
		}
		if (num/90 > 0) {
			result.append("XC");
			num -= 90;
		}
		if (num/50 > 0) {
			result.append("L");
			num = num - 50;
		}
		if (num/40 > 0) {
			result.append("XL");
			num -= 40;
		}
		if (num/10 > 0) {
			for (int i = 0; i < num/10; i++) {
				result.append("X");
			}
			num -= (num/10)*10;
		}
		if (num/9 > 0) {
			result.append("IX");
			num -= 9;
		}
		if (num/5 > 0) {
			result.append("V");
			num -= 5;
		}
		if (num/4 > 0) {
			result.append("IV");
			num -= 4;
		}
		if (num/1 > 0) {
			for (int i = 0; i < num/1; i++) {
				result.append("I");
			}
			num -= (num/1)*1;
		}
        return result.toString();
    }
	
	public static void main(String[] args) {
		System.out.println(intToRoman(990));
	} 
}
