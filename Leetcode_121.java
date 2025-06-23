// Brute force approach
// O(N^2) -> TIME COMPLEXITY
// O(1) -> SPACE

public int maxProfit(int[] prices) {
    int maxProfit = 0;
    for (int i = 0; i < prices.length; i++) {
        for (int j = i + 1; j < prices.length; j++) {
            if (prices[j] > prices[i]) {
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            }
        }
    }
    return maxProfit;
}

// Optimal solution
// O(N) -> time 
// O(1) -> space

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            // Track the minimum price seen so far
            if (price < minPrice) {
                minPrice = price;
            } 
            // Calculate profit if sold today
            else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
    }
}

