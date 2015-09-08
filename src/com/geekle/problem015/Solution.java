package com.geekle.problem015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> results = new ArrayList<List<Integer>>();  	
    	if (nums.length==0) {
    		return results;
		}
    	Arrays.sort(nums);

    	if (nums.length < 3) {
			return results;
		}
    	for (int i = 0; i < nums.length-2&&nums[i] <= 0; i++) {
			for (int j = i+1; j < nums.length-1 && nums[i] + nums[j] <= 0; j++) {
				
				for (int k = nums.length - 1; k > j && nums[k] >= 0; k--) {
					if (nums[i]+nums[j]+nums[k] > 0) {
						continue;
					}
					if (nums[i]+nums[j]+nums[k] < 0) {
						break;
					}
					else {
						if (!results.contains(Arrays.asList(nums[i],nums[j],nums[k]))) {
							results.add(Arrays.asList(nums[i],nums[j],nums[k]));
							break;
						}
						
					}
				}
			}
		}
    	
        return results;
    }
    
    public static void main(String[] args) {
//    	int[] a = {-1,0,0,1,0,1,0,0,0,2};
//    	int[] a = {0};
//    	int[] a = {0,0,0};
//    	int[] a = null;
    	int[] a = {7,-1,14,-12,-8,7,2,-15,8,8,-8,-14,-4,-5,7,9,11,-4,-15,-6,1,-14,4,3,10,-5,2,1,6,11,2,-2,-5,-7,-6,2,-15,11,-6,8,-4,2,1,-1,4,-6,-15,1,5,-15,10,14,9,-8,-6,4,-6,11,12,-15,7,-1,-9,9,-1,0,-4,-1,-12,-2,14,-9,7,0,-3,-4,1,-2,12,14,-10,0,5,14,-1,14,3,8,10,-8,8,-5,-2,6,-11,12,13,-7,-12,8,6,-13,14,-2,-5,-11,1,3,6};
//		int[] a = {0,7,-4,-7,0,14,-6,-4,-12,11,4,9,7,4,-10,8,10,5,4,14,6,0,-9,5,6,6,-11,1,-8,-1,2,-1,13,5,-1,-2,4,9,9,-1,-3,-1,-7,11,10,-2,-4,5,10,-15,-4,-6,-8,2,14,13,-7,11,-9,-8,-13,0,-1,-15,-10,13,-2,1,-1,-15,7,3,-9,7,-1,-14,-10,2,6,8,-6,-12,-13,1,-3,8,-9,-2,4,-2,-3,6,5,11,6,11,10,12,-11,-14};
//    	long start = System.currentTimeMillis();
		System.out.println(threeSum(a));
//		System.out.println(System.currentTimeMillis()-start);
	}
}
