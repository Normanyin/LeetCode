package com.geekle.problem003;


public class Solution {
    public static int lengthOfLongestSubstring(String s) {
    	StringBuilder sb = new StringBuilder();
    	int len = 0;
    	int tempindex = 0;
    	System.out.println(sb.length());
    	for (int i = 0; i < s.length(); i++) {
    		if (sb.toString().contains(s.substring(i, i + 1))){
    			tempindex = sb.length() - sb.indexOf(s.substring(i,i + 1));
    			if (len < sb.length()) {
					len = sb.length();
				}
				sb.setLength(0);
				sb.append(s.substring(i - tempindex + 1, i + 1));
			} else {
				sb.append(s.charAt(i));
			}
			if (len < sb.length()) {
				len = sb.length();
			}
		}
        return len;
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
    	String string = "ababab";
    	System.out.println(lengthOfLongestSubstring(string));
    }
}