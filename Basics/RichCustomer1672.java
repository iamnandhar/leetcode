package Basics;

public class RichCustomer1672 {
    public static void main(String[] args) {
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1}
        };
        // find max wealth
        int maxWealth = 0;
        for (int[] account : accounts) {
            int wealth = 0;
            for (int balance : account) {
                wealth += balance;
            }
            maxWealth = Math.max(maxWealth, wealth);
        }
        System.out.println(maxWealth);
    }
}
