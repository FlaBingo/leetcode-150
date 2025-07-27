package easy;

import java.util.Arrays;

// Leetcode 242
// Given two strings 's' and 't', return 'true' if 't' is an anagram of 's', and 'false' otherwise.
// Ex. s:cat and t:tac // true, which means 't' contains all the letters that 's' contains
// s:ram and t:rat  // false
public class Valid_Anagram {
  public static void main(String[] args) {
    String s = "cart";
    String t = "ract";
    // System.out.println(brute_force(s, t));
    System.out.println(isAnagram(s, t));
  }

  static boolean isAnagram(String s, String t) {
    // If the lenths are diff, they can't be anagrams
    if (s.length() != t.length()) {
      return false;
    }
    // Create an array to count character frequencies
    int[] charCounts = new int[26]; // assuming only lowercase English letters

    // Increment count for each character in 's' and decrement for each in 't'
    for (int i = 0; i < s.length(); i++) {
      charCounts[s.charAt(i) - 'a']++;
      charCounts[t.charAt(i) - 'a']--;
    }

    // Check if all counts are zero
    for (int i : charCounts) {
      if (i != 0) {
        return false;
      }
    }
    return true; // All counts are zero, so 't' is an anagram of 's'
  }

  static boolean brute_force(String s, String t) {
    if (s.trim() == t.trim()) {
      return true;
    }
    if (s.trim() == "" || t.trim() == "" || s.length() != t.length()) {
      return false;
    }
    char[] Schars = s.toCharArray();
    char[] Tchars = t.toCharArray();

    Arrays.sort(Schars);
    Arrays.sort(Tchars);
    return Arrays.equals(Schars, Tchars);
  }
}
