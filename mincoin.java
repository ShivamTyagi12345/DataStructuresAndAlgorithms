public class mincoin {
    public static void main(String[] args) {
        int[]coins={1,2,5};
        int amount=11;
        System.out.println(coinChange(coins, amount));
    }
    
        public static int coinChange(int[] coins, int amount) {
            int n = coins.length;
        
            if(n == 1){
            return amount%coins[0] != 0 ? -1:amount/coins[0];
                
            }
            
            int[][] dp = new int[n+1][amount+1];
            for(int i=0;i<n+1;i++){
                dp[i][0] = 0;
            }
            for(int j = 1;j<amount+1;j++){
                dp[0][j] = Integer.MAX_VALUE-1;
            }
            
            for(int i=1;i<n+1;i++){
                for(int j=1;j<amount+1;j++){
                    int a=coins[i-1],
                    b=dp[i-1][j],
                    c=dp[i][j-coins[i-1]]+1;
                    if(a>j){
                        dp[i][j] = b;
                    }else if(a<=j){
                        dp[i][j] = Math.min(b,c);
                    }
                }
            }
        return dp[n][amount] != Integer.MAX_VALUE-1?dp[n][amount]:-1;
            
        }
    }
    

