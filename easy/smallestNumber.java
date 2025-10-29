package easy;

// 3370. Smallest Number With All Set Bits

// You are given a positive number n.
// Return the smallest number x greater than or equal to n, such that the binary representation of x contains only set bits
 
// Example 1:
// Input: n = 5
// Output: 7
// Explanation:
// The binary representation of 7 is "111".

// Example 2:
// Input: n = 10
// Output: 15
// Explanation:
// The binary representation of 15 is "1111".

// Example 3:
// Input: n = 3
// Output: 3
// Explanation:
// The binary representation of 3 is "11".

public class smallestNumber {
  public static void main(String[] args) {
    System.out.println(mySolution(5));
  }

  static int mySolution(int n) {
    double res = 0;
    int i = 1;
    while (res < n) {
      res = Math.pow(2, i) - 1;
      i++;
    }
    return (int)res;
  }
}


// Thanks to this formula  ->  2^(i) - 1;
// That gives All set bits;