1class Solution {
2    public int getMoneyAmount(int n) {
3        int[][] dp = new int[n + 1][n + 1];
4
5        for (int i = n; i >= 0; i--) {
6            // dp[i][i] = 0
7
8            for (int j = i + 1; j <= n; j++) {
9                dp[i][j] = Integer.MAX_VALUE;
10
11                for (int k = i; k <= j; k++) {
12                    dp[i][j] = Math.min(dp[i][j],
13                        k + Math.max(
14                            (k - 1 >= i ? dp[i][k - 1] : 0),
15                            (k + 1 <= j ? dp[k + 1][j] : 0)
16                        )
17                    );
18                }
19            }
20        }
21
22        return dp[1][n];
23    }
24}