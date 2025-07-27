package easy;
// Leetcode 217

import java.util.HashSet;

// Given an integer array 'nums', return 'true' if any value appears at least twice in the array, and return 'false' if every element is distinct.


public class Contains_Duplicate {
  public static void main(String[] args) {
    System.out.println("---------");
    int[] nums = { 4, 2, 5, 2, 1 };
    // System.out.println(brute_force(nums));
    System.out.println(solution(nums));
  }
  
  static boolean solution(int[] nums) {
    // Hashset
    // time complexity: O(n) and space comp: O(n)
    // int[] nums = { 4, 2, 5, 2, 1 };
    
    // Create a HashSet to store elements from the array
    HashSet<Integer> seenNumbers = new HashSet<>();
    // Iterate through each elements in the array
    for (int num : nums) {
      // Check if the element is already in the HashSet
      if (seenNumbers.contains(num)) {
        return true; // Duplicate found
      }
      // Add the element to the hashset
      seenNumbers.add(num);
    }
    return false; // No duplicates found
  }
  
  static boolean brute_force(int[] nums) {
    // By applying brute force: Ex. nums=[1,2,3,4,4] we will check for every element if it's exist or not
    if (nums.length == 0 || nums.length == 1) {
      return false;
    }
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (i == j) {
          continue;
        }
        if (nums[i] == nums[j]) {
          return true;
        }
      }
    }
    return false;
    // time complexity: O(N^(2))
  }
}


// Additional Info:
// A HashSet is a fundamental data structure that stores a collection of unique elements using a hash table for implementation
// Main Features of HashSet Data Type: 
//    1. Uniqueness: Automatically ensures all elements are unique.
//    2. Unordered: Elements are not stored in any particular order.
//    3. Fast Operations: Provides avg O(1) time complexity for basic operations.
// Common Operations:
//    1. Add: Insert a new element (Ignores if already present)
//    2. Remove
//    3. Contains
//    4. Size/Count
//    5. Clear: Remove all elements