package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

// 347. Top K Frequent Elements
// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

// Example 1:
// Input: nums = [1,1,1,2,2,3], k = 2
// Output: [1,2]

// Example 2:
// Input: nums = [1], k = 1
// Output: [1]


public class Top_K_Frequent_Elements {
  public static void main(String[] args) {
    int[] nums = {1, 1, 1, 2, 2, 3};
    int k = 2;
    System.out.println(Arrays.toString(topKFrequent(nums, k)));
  }

  static int[] topKFrequent(int[] nums, int k) {
    if (k == nums.length) {
      return nums;
    }
    Map<Integer, Integer> count = new HashMap<>();
    for (int n : nums) {
      count.put(n, count.getOrDefault(n, 0) + 1);
    }
    Queue<Integer> heap = new PriorityQueue<>((a,b) -> count.get(a)-count.get(b));
    for (int n : count.keySet()) {
      heap.add(n);
      if (heap.size() > k) {
        heap.poll();
      }
    }
    int[] ans = new int[k];
    for (int i = 0; i < k; i++) {
      ans[i] = heap.poll();
    }
    return ans;
  }
}



// A queue and a priority queue are both data structures used to store and manage a collection of elements. The key difference between them lies in the order in which elements are retrieved. Let's break them down intuitively using a real-world analogy.

// The Queue: The Checkout Line
// Imagine you're at a grocery store, and you get in line to check out. This is a perfect example of a queue.

// How it works: The first person to get in line is the first person to be served. New people who arrive go to the back of the line.

// Key Principle: First-In, First-Out (FIFO). The element that has been in the queue the longest is the first one to be removed.

// Core Operations:

// add() or offer(): Adds an element to the back of the queue.

// remove() or poll(): Removes and returns the element from the front of the queue.

// element() or peek(): Returns the element at the front of the queue without removing it.

// In Java, the Queue is an interface, and it's typically implemented using a LinkedList.

// The Priority Queue: The Emergency Room
// Now, imagine an emergency room at a hospital. A person who arrived first might not be the first one to be seen by a doctor. A person with a severe injury (e.g., a heart attack) will be attended to before someone with a minor cut, even if the person with the minor cut arrived earlier. This is the essence of a priority queue.

// How it works: The order of service is determined by the priority of the elements, not the time they were added. The highest-priority element is always the next one to be processed.

// Key Principle: Elements are ordered based on their priority.

// Core Operations: The methods are similar to a regular queue (add, offer, remove, poll, peek), but the behavior is different:

// add() or offer(): Adds an element to the queue in a way that maintains the priority order. The new element is placed in its correct spot based on its priority.

// remove() or poll(): Removes and returns the element with the highest priority.

// In Java, the PriorityQueue class implements the Queue interface. By default, it uses a natural ordering (e.g., for numbers, the smallest number has the highest priority). You can also define your own custom priority by providing a Comparator.