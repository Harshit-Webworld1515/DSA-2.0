class Solution {
    public double myPow(double x, int n) {
        if(n>0){
            double a=1;
            for(int i=0;i<n;i++){
                a=a*x;
            }
            return a;
        }else{
            int number=Math.abs(n);
            double a=1;
            for(int i=0;i<number;i++){
                a=a*x;
            }
            double result=1/a;
            return result;
        }
    }
}