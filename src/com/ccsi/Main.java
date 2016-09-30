package com.ccsi;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    int[] nums={3,2,8,7,11,15};
        int[] res=twoSum(nums,9);
    }
    //Given an array of integers,return indices of the two numbers such that they add up to a specific target.
    //You may assume that each input would have exactly one solution.
    public static int[] twoSum(int[]nums,int target){
        if(nums==null||nums.length<2)return null;
        int[]result=new int[2];
        Map<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])){
                map.put(target-nums[i],i);
            }else{
                result[0]=map.get(nums[i]);
                result[1]=i;
                break;
            }
        }
        return result;
    }
}
