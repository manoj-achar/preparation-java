package org.example.algorithm;

public class MaxProfit {

    static void main() {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 5, 4, 3, 2, 1};
        System.out.println("Max profilt : "+maxProfit(prices2));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int price : prices) {
            if(price < minPrice) {
                minPrice = price;
            }
            int currentProfit = price - minPrice;
            maxProfit = Math.max(maxProfit, currentProfit);
        }/*
        for(int i = 0; i< prices.length-1; i++) {
            int tmpProfit = 0;
            for(int j = i+1; j < prices.length; j++) {
                tmpProfit = Math.max(tmpProfit, prices[j] - prices[i]);
            }
            maxProfit = Math.max(maxProfit, tmpProfit);
        }*/
        return maxProfit;
    }
}
