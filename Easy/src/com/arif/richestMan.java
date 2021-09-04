package com.arif;

public class richestMan {

    public static void main(String[] args) {
	int[][] accounts = {
            {1, 5},
            {7, 3},
            {3, 5}
    };
        System.out.println(maximumWealth(accounts));

        }
    static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            if (wealth > maxWealth) {
                maxWealth = wealth;
            }

        }
        return maxWealth;
    }
}
