
package easy;

import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {
  public static void main(String[] args) {
    System.out.println(mySolution("egg", "add"));
  }

  static boolean mySolution(String s, String t) {

    // Map<Character, Character> map = new HashMap<>();
    // for (int i = 0; i < s.length(); i++) {
    // char a = s.charAt(i);
    // char b = t.charAt(i);
    // if (map.containsKey(a)) {
    // if (map.get(a) != b)
    // return false;
    // } else {
    // map.put(a, b);
    // }
    // if (map.containsKey(b)) {
    // if (map.get(b) != a)
    // return false;
    // } else {
    // map.put(b, a);
    // }
    // }
    // return true;

    // this didn't work because...
    // Map<Character, Character> map = new HashMap<>();
    // for (int i = 0; i < s.length(); i++) {
    // char a = s.charAt(i);
    // char b = t.charAt(i);

    // if (map.containsKey(a)) {
    // if (map.get(a) != b)
    // return false;
    // }
    // if (map.containsKey(b)) {
    // if (map.get(b) != a)
    // return false;
    // }
    // map.put(a, b); //________________they were overwriting;
    // map.put(b, a);
    // }
    // return true;

    Map<Character, Character> mapST = new HashMap<>();
    Map<Character, Character> mapTS = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char a = s.charAt(i);
      char b = t.charAt(i);
      if (mapST.containsKey(a)) {
        if (mapST.get(a) != b)
          return false;
      } else {
        mapST.put(a, b);
      }
      if (mapTS.containsKey(b)) {
        if (mapTS.get(b) != a)
          return false;
      } else {
        mapTS.put(b, a);
      }
    }
    return true;
  }
}