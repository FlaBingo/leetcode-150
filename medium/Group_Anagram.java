package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Leetcode 49
// Given an array of strings 'strs'. group the 'anagrams' together, You can return the answer in any order.
// An 'Anagram' is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
// Ex. 1 :
// Input: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
// Output: [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]
// Ex. 2 :
// Input: strs = [""]
// Output: [[""]]

public class Group_Anagram {
  public static void main(String[] args) {
    String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    // System.out.println(brute_force(strs));
    System.out.println(groupAnagram(strs));
  }

  // 27th of July 2025 --- I've no idea wtf is happening exactly tbh.
  static List<List<String>> groupAnagram(String[] strs) {
    if (strs.length == 0) {
      return new ArrayList<>();
    }
    Map<String, List<String>> ansMap = new HashMap<>();
    int[] count = new int[26];
    for (String str : strs) {
      Arrays.fill(count, 0);
      for (char c : str.toCharArray()) {
        count[c - 'a']++;
      }
      StringBuilder sb = new StringBuilder("");

      for (int i = 0; i < 26; i++) {
        sb.append(""); // no idea what's happening
        sb.append(count[i]);
      }
      String key = sb.toString();
      if (!ansMap.containsKey(key)) {
        ansMap.put(key, new ArrayList<>());
      }
      ansMap.get(key).add(str);
    }

    return new ArrayList<>(ansMap.values());
  }
  

  static List<List<String>> brute_force(String[] strs) {
    return new ArrayList<>();
  }
}
