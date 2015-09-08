package com.geekle.problem014;


public class Solution {
	public static String longestCommonPrefix(String[] strs) {
		String result = null;
		if (strs == null||strs.length==0) {
			return null;
		}
		
		for (int i = 0; i < strs.length; i++) {
			if (strs[i] == "") {
				return "";
			}
		}

		int len = strs[0].length();
		
		
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].length() <= len) {
				len = strs[i].length();
				result = strs[i];
			}
		}
		
		while (true) {
			for (int j = 0; j < strs.length; j++) {
				if (strs[j].startsWith(result)) {
					continue;
				}
				else {
					result = result.substring(0, --len);
					j = -1;
				}
			}
			break;
		}
        return result;
    }
	
	public static void main(String[] argv){
		String[] strings = {"flower","flow","flight"};
		String[] string1 = {"aca","cba"};
//		System.out.println(longestCommonPrefix(strings));
		System.out.println(longestCommonPrefix(string1));

	}
}

