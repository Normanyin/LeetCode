package com.geekle.problem6;

public class Solution {
	public static String convert(String s, int numRows) {
		StringBuilder[] temp = new StringBuilder[numRows];
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < numRows; i++) {
			temp[i] = new StringBuilder();
		}
		
		int j = 0;
		boolean flag = true;
		for (int i = 0; i < s.length(); i++) {
			temp[j].append(s.charAt(i));

			if (numRows == 1) {
				continue;
			}
			if (flag) {
				j++;
			} else {
				j--;
			}
			if (j == numRows - 1 || j == 0) {
				flag = !flag;
			}
		}
		for (int i = 0; i < temp.length; i++) {
			result.append(temp[i]);
		}
		return result.toString();
    }
	
	public static void main(String[] args) {
		String string = "AB";
		System.out.println(convert(string, 1));
	}
}
