package easy;

public class IsHappy {
  public static void main(String[] args) {
    System.out.println(mySolution(2));
  }

  static boolean mySolution(int n) {
    // Set<Integer> seen = new HashSet<>();
    // while (n != 1 && !seen.contains(n)) {
    //   seen.add(n);
    //   int sum = 0;
    //   while (n > 0) {
    //     int digit = n % 10;
    //     sum += digit * digit;
    //     n /= 10;
    //   }
    //   n = sum;
    // }
    // return n == 1;
    int slow = n;
    int fast = getNext(n);
    while (fast != 1 && slow != fast) {
      slow = getNext(slow);
      fast = getNext(getNext(fast));
    }
    return fast == 1;
  }

  private static int getNext(int n) {
    int sum = 0;
    while (n > 0) {
      int digit = n % 10;
      sum += digit * digit;
      n /= 10;
    }
    return sum;
  }
}
