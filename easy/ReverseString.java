package easy;

public class ReverseString {
  public static void main(String[] args) {
    char[] s = { 'h', 'e', 'l', 'l', 'o', 'h' };
    mySolution(s);
    System.out.println(s);
  }

  static void mySolution(char[] s) {
    // char rest;
    // for (int i = 0; i < s.length / 2; i++) {
    //   rest = s[i];
    //   s[i] = s[s.length - 1 - i];
    //   s[s.length - i - 1] = rest;
    // }
    // reversing by for loop beats 20% because [s.length-1-i] is an expensive oparetion

    int left = 0, right = s.length - 1;
    while (left < right) {
      char temp = s[left];
      s[left] = s[right];
      s[right] = temp;
      left++;
      right--;
    }
  }
}
