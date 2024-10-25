import java.util.Scanner;

class Solution {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the array size : ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        
        System.out.print("Enter the arry values : ");
        for (int i=0; i<size; i++)
        {
            nums[i]=sc.nextInt();
        } 

        Syetem.out.print(maxProfit(nums));
    }
    
    public static int maxProfit(int[] prices) 
    {
        int buy_prices = prices[0];

        int profit = 0;

        for (int i=1; i<prices.length; i++)
        {
            if (buy_prices > prices[i])
            {
                buy_prices = prices[i];
            }
            else
            {
                int cur_profit = prices[i] - buy_prices;
                profit = Math.max(cur_profit, profit);
            }
        }
        return profit;
    }
}
