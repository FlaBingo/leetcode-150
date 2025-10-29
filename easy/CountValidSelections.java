package easy;

import java.util.Arrays;

public class CountValidSelections {

  static int mySolution(int[] nums) {
    int res = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        // int[] tempNums = Arrays.copyOf(nums, nums.length);
        res += countValid(Arrays.copyOf(nums, nums.length), i, true);
        res += countValid(Arrays.copyOf(nums, nums.length), i, false);
      }
    }
    return res;
  }

  static int countValid(int[] tempNums, int index, boolean bool) {
    int res = 0;
    while (index >= 0 && index <= tempNums.length - 1) {
      if (tempNums[index] != 0) {
        tempNums[index]--;
        if (bool) {
          index++;
        } else {
          index--;
        }
        bool = !bool;
      } else {
        if (bool) {
          index--;
        } else {
          index++;
        }
      }
    }
    if (Arrays.equals(tempNums, new int[tempNums.length])) {
      return res + 1;
    }
    return 0;
  }

  public static void main(String[] args) {
    int[] nums = { 16, 13, 10, 0, 0, 0, 10, 6, 7, 8, 7 };
    // System.out.println(Arrays.equals(nums, new int[nums.length]));
    System.out.println(mySolution(nums));
  }

  static int two_pointer(int[] nums) {
    int n = nums.length;
    int totalSum = 0;
    for (int x : nums) {
      totalSum += x;
    }
    int result = 0;
    int leftSum = 0;
    for (int i = 0; i < n; i++) {
      if (nums[i] == 0) {
        int rightSum = totalSum - leftSum;
        if (leftSum == rightSum) {
          result += 2;
        } else if (Math.abs(leftSum - rightSum) == 1) {
          result += 1;
        }
      }
      // Only add to leftSum if nums[i] > 0 (non-zero) — though adding zero has no
      // effect anyway
      leftSum += nums[i];
    }
    return result;
  }

}
