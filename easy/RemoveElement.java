package easy;

import java.util.Arrays;

public class RemoveElement {
  public static void main(String[] args) {
    int[] nums = {0,1,2,2,3,0,4,2};
    System.out.println(mySolution(nums, 2));
    System.out.println(Arrays.toString(nums)); // oh it does modify it
  }

  static int mySolution(int[] nums, int val) {
    int len = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[len] = nums[i];
        len++;
      }
    }
    return len;
  }
}
