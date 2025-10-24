package easy;

public class PossibleStringCount {
  public static void main(String[] args) {
    System.out.println(mySolution("abcd"));
  }
  static int mySolution(String word){
    if (word == null || word.isEmpty()) return 0;
    int counter = 1;
    for (int i = 0; i < word.length() - 1; i++) {
      if (word.charAt(i) == word.charAt(i + 1)) {
        counter++;
      }
    }
    return counter;
  }
}
