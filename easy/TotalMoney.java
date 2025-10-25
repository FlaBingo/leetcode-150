package easy;

public class TotalMoney {
  public static void main(String[] args) {
    System.out.println(mySolution(100));
  }

  static int chatGPTsolution(int n) {
    int weeks = n / 7;
    int days = n % 7;

    // Sum of full weeks: 28 + 35 + 42 + ... (weeks times)
    int weekSum = 7 * (weeks * (weeks - 1)) / 2 + 28 * weeks;

    // Remaining days
    int daySum = (2 * (weeks + 1) + (days - 1)) * days / 2;

    return weekSum + daySum;
  }

  static int mySolution(int n) {
    int weeks = n/7;
    int days = n%7;

    int total = 0;
    for (int i = 0; i < weeks; i++) {
      total += 28 + (i*7);
    }
    int nextWeek = weeks + 1;
    for (int i = 0; i < days; i++) {
      total += nextWeek + i;
    }

    return total;
  }
}
