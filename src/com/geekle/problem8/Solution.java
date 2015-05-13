package com.geekle.problem8;

public class Solution {
    public static int myAtoi(String str) {
    	str = str.trim();
    	if (str.equals("")) {
			return 0;
		}
    	int i = Integer.valueOf(str);
        return i;
    }
    
    public static void main(String[] args) {
    	System.out.println(myAtoi("    -11"));
    }
}
