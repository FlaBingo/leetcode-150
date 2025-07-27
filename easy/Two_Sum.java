package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Leetcode 1
// Given an array of integers 'nums' and an integer 'target', return 'indices' of the 'two numbers' such that they add up to 'target'.
// You may assume that each input would have 'exactly one solution', and you may not use the same element twice.
public class Two_Sum {
  public static void main(String[] args) {
    int[] nums = { 15, 7, 2, 3 };
    int target = 9;
    System.out.println(Arrays.toString(brute_force(nums, target)));
    // System.out.println(Arrays.toString(twoSum(nums, target)));
  }

  static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        return new int[] { map.get(complement), i };
      }
      map.put(nums[i], i);
    }
    return new int[] {-1, -1};
  }

  static int[] brute_force(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] >= target) {
        continue;
      }
      for (int j = 0; j < nums.length; j++) {
        // if (nums[i] == nums[j] || (nums[i] + nums[j]) > target || (nums[i] + nums[j])
        // < target) {
        // continue;
        // }
        if (nums[i] + nums[j] == target) {
          return new int[] { i, j };
        }
        // continue;
      }
    }
    return new int[] { -1, -1 };
  }
}

// A 'HashMap' is a fundamental data structure in java that stores 'key-value'
// pairs and provides efficient data retrieval. It's part of the Java
// Collections Framework and implements the 'Map' interface.
// Key Characteristics:
// 1. Key-value Storage: Stores data in pairs (key -> value)
// 2. No Duplicate Keys: Each key can map to only one value
// 3. Permits Null Value: Allows one null key and multiple null values
// 4. Unordered: Doesn't guarantee any specific order of entries
// 5. Not Thread-Safe: For concurrent access, use 'ConcurrentHashMap' or
// 'Collections.synchronizedMap()'