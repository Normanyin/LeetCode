package com.geekle.problem1;

import java.util.HashMap;



public class Solution {
	public static int[] twoSum(int[] nums, int target) {
		int[] results = {-1,-1};
		HashMap map = new HashMap();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				results[0] = (Integer)map.get(nums[i]) + 1;
				results[1] = i + 1;
				break;
			}
			map.put(target-nums[i], i);
		}
		return results;
	}
	
	public static int[] twoSum1(int[] nums, int target) {
		int[] results = {-1, -1};
		int length = nums.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[j] == nums[i]) {
					results[0] = j + 1;
					results[1] = i + 1;
					return results;
				}
			}
			nums[i] = target-nums[i];
		}
		return results;
	}
	
	public static int[] twoSum2(int[] nums, int target) {
		int[] results = {-1, -1};
		int length = nums.length;
		for (int i = 0; i < length/2 - 1; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[j] == nums[i]) {
					results[0] = j + 1;
					results[1] = i + 1;
					return results;
				}
				if (nums[length - j -1] ==nums[length]) {
					
				}
			}
			nums[i] = target - nums[i];
			nums[length-i - 1] = target - nums[length -i -1];
		}
		return results;
	}
	
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] result = twoSum(nums, target);
		System.out.println("index1=" + result[0] + ", index2=" + result[1]);
	}
}
