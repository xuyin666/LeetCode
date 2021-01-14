package DynamicProgrammation;

// 121. Best Time to Buy and Sell Stock
// You are given an array prices for which prices[i] is the price of a given stock on the ith day.
// You are only permitted to complete at most one transaction.
// In other words, you can buy one and sell one share of the stock. You cannot sell a stock before you buy one.
// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

import java.util.Arrays;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int[] arr = new int[prices.length];
        arr[0] = 0;
        for(int i=1; i<arr.length; i++){
            arr[i] = prices[i]-prices[i-1];
        }
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]>0)
                arr[i] = arr[i-1] + arr[i];
            continue;
        }
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

}
