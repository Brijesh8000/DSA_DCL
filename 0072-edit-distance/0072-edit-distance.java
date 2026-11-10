class Solution {
    public int minDistance(String word1, String word2) {
        // Keep the shorter string as word2 so the DP array is small
        // if (word2.length() > word1.length()) {
        //     String t = word1;
        //     word1 = word2;
        //     word2 = t;
        // }

        int m = word1.length(), n = word2.length();
        int[] dp = new int[n + 1];
        for (int j = 0; j <= n; j++) dp[j] = j; // row 0: dp[0][j] = j

        for (int i = 1; i <= m; i++) {
            int prev = dp[0]; // holds dp[i-1][j-1]
            dp[0] = i;        // dp[i][0] = i
            for (int j = 1; j <= n; j++) {
                int temp = dp[j]; // dp[i-1][j], becomes "prev" for next j
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[j] = prev;
                } else {
                    dp[j] = 1 + Math.min(prev, Math.min(dp[j], dp[j - 1]));
                }
                prev = temp;
            }
        }

        return dp[n];
    }
}