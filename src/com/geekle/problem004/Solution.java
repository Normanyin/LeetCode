package com.geekle.problem004;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	Arrays.parallelSort(nums1);
    	Arrays.parallelSort(nums2);

    	if (nums1.length % 2 == 0) {
			
		}
    	System.out.println(nums1);
        return 0;
    }
    
    public static void main(String[] args) {
    	int[] nums1 = {1,5,3,2,6,0};
    	int[] nums2 = {9,8,7};
    	System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
