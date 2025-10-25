package easy;

public class FinalValueAfterOperations {
  public static void main(String[] args) {
    String[] operations = {"--X","X++","X++"};
    System.out.println(mySolution(operations));
  }

  static int mySolution(String[] operations) {
    int x = 0;
    for (String operation : operations) {
      switch (operation) {
        case "X++", "++X" -> x++;
        case "X--", "--X" -> x--;
      }
    }
    return x;
  }
}
