package easy;

public class FirstIdxOfOcc {
  public static void main(String[] args) {
    System.out.println(mySolution("sadbutsad", "sad"));
  }

  static int mySolution(String haystack, String needle) {
    int n = haystack.length();
    int m = needle.length();

    for (int i = 0; i < n - m + 1; i++) {
      if (haystack.substring(i, m + i).equals(needle)) {
        return i;
      }
    }
    return -1;
  }
}
