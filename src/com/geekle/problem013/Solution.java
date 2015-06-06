package com.geekle.problem013;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public static int romanToInt(String s) {
		Map<Character, Integer> m = new HashMap();
		int result = 0;
		
		m.put('I', 1);
		m.put('V', 5);
		m.put('X', 10);
		m.put('L', 50);
		m.put('C', 100);
		m.put('D', 500);
		m.put('M', 1000);
		for (int i = 0; i < s.length(); i++) {
			if (i+1 == s.length()) {
				result+=m.get(s.charAt(i));
				return result;
			}
			if (m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
				result+= m.get(s.charAt(i + 1)) - m.get(s.charAt(i));
				i++;
				continue;
			}
			result+=m.get(s.charAt(i));
		}
		return result;
    }
	
	public static void main(String[] args) {
		System.out.println(romanToInt("XIV"));
	}
}
