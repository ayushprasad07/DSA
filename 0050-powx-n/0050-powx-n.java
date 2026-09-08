class Solution {
    public double myPow(double x, int n) {
        double p ;
        if (n>0){
            p = pow(x,(long)n);
        }else{
            p = pow(1/x,(long)n*-1);
        }
        
        return p;
    }

    public double pow(double x, long n){
        if (n==1){
            return x;
        }if (n<1){
            return 1;
        }
        if (n%2==0){
            double half = pow(x,n/2);
            return half * half;
        }else{
            double half = pow(x,n/2);
            return x * half * half;
        }
    }
}