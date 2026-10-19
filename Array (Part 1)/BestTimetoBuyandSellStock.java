class Solution {
         // APPROACH 1: BRUTE FORCE
    // =========================
    public int maxProfitBrute(int[] prices) {
        int bestprofit=Integer.MIN_VALUE;
        for(int i=prices.length-1;i>=0;i--){
            int maxp=Integer.MIN_VALUE;
            int diff=-1;
            for(int j=0;j<=i;j++){
                if(prices[i]-prices[j]<0){
                    diff=0;
                }else{
                    diff=prices[i]-prices[j];
                }
                if(diff>maxp){
                    maxp=diff;
                }
            }
            if(bestprofit<maxp){
                bestprofit=maxp;
            }
        }
        return bestprofit;
    }
    public int maxProfit(int[] prices) {
        int [] minleft= new int[prices.length];
        for(int i=0; i<prices.length;i++){
            if(i==0){
                minleft[i]=prices[i];
                continue;
            }
            if(prices[i]<minleft[i-1]){
                minleft[i]= prices[i];
            }
            else{
                minleft[i]= minleft[i-1];
            }
        }
        int []maxright= new int[prices.length];
        for(int i=prices.length-1;i>=0;i--){
            if(i==prices.length-1){
                maxright[i]=prices[i];
                continue;
            }
            if(maxright[i+1]<prices[i]){
                maxright[i]=prices[i];
            }
            else{
                maxright[i]=maxright[i+1];
            }
        }
        int maxp= Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            int diff=maxright[i]-minleft[i];
            if(maxp<diff){
                maxp=diff;
            }
        }
        return maxp;
    }
}