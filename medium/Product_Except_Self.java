package medium;

import java.util.Arrays;

// 238. Product of Array Except Self
// Medium
// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
// You must write an algorithm that runs in O(n) time and without using the division operation.

// Example 1:
// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]

// Example 2:
// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]

public class Product_Except_Self {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4 };
    // int[] nums = { -1, 1, 0, -3, 3};
    System.out.println(Arrays.toString(brute_force(nums)));
    System.out.println(Arrays.toString(better_approach(nums)));
  }


  static int[] optimal_solution(int[] nums) {
    return new int[]{};
  }

  // ----------------------------beats 5% with 4ms
  static int[] better_approach(int[] nums) {
    int n = nums.length;
    int[] pre = new int[n];
    int[] post = new int[n];
    int[] result = new int[n];
    for (int i = 0; i < nums.length; i++) {
      int index = (nums.length - 1) - i;
      if (i == 0) {
        pre[i] = 1;
        post[index + i] = 1;
      } else {
        pre[i] = nums[i - 1] * pre[i - 1];
        post[index] = nums[index + 1] * post[index + 1];
      }
    }
    for (int i = 0; i < nums.length; i++) {
      result[i] = pre[i] * post[i];
    }
    return result;
  }

  // ----------------------------Time Limit Exceeded
  static int[] brute_force(int[] nums) {
    int[] result = new int[nums.length];
    for (int i = 0; i < result.length; i++) {
      result[i] = 1;
    }
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (i != j) {
          result[i] *= nums[j];
        }
      }
    }
    return result;
  }
}
