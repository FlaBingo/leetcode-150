package easy;

public class hasSameDigit {
  public static void main(String[] args) {
    String s1 = "3902";
    String s2 = "34789";
    System.out.println(mySolution(s2));
  }

  static boolean mySolution(String s) {
    StringBuilder sb = new StringBuilder(100);
    while (s.length() > 2) {
      sb.setLength(0);;
      for (int i = 0; i < s.length() - 1; i++) {
        int logic = ((s.charAt(i) - '0') + (s.charAt(i + 1) - '0')) % 10;
        sb.append(logic);
        // System.out.println(logic + " " + sb);
      }
      s = sb.toString();
    }
    return s.charAt(0) == s.charAt(1);
  }
}
