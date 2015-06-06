package com.geekle.problem007;

public class Solution {
	public static int reverse(int x) {
		int result = 0;
		if (x < 0) {
			x = -x;
			while (x%10 >= 0) {
				if (x == 0) {
					break;
				}
				if (result > 2147483647 / 10) {
					result = 0;
					break;
				}
				result = result * 10 + x % 10;
				x = x / 10;
			}
			result = -result;
		} else {
			while (x%10 >= 0) {
				if (x == 0) {
					break;
				}
				if (result > 2147483647 / 10) {
					result = 0;
					break;
				}
				result = result * 10 + x % 10;
				x = x / 10;
			}
		}
		return result;
    }
	
	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
	}
}
