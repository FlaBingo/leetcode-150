package easy;

public class MaxProfit {
  public static void main(String[] args) {
    System.out.println(mySolution(new int[] { 2, 4, 1 }));
  }

  static int mySolution(int[] prices) {
    if (prices == null || prices.length < 2)
      return 0;

    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int p : prices) {
      if (p < minPrice)
        minPrice = p; // best buy so far
      else if (p - minPrice > maxProfit) // if selling today improves profit
        maxProfit = p - minPrice;
    }
    return maxProfit;

    // floped

    // int smallest = prices[0];
    // int x = 0;
    // for (int i = 1; i < prices.length; i++) {
    // if (smallest > prices[i]) {
    // smallest = prices[i];
    // x = i;
    // }
    // }
    // if (x == prices.length - 1) {
    // return 0;
    // }
    // int largest = prices[x + 1];
    // for (int i = x + 1; i < prices.length; i++) {
    // if (largest < prices[i]) {
    // largest = prices[i];
    // }
    // }
    // return (largest - smallest);
  }
}
