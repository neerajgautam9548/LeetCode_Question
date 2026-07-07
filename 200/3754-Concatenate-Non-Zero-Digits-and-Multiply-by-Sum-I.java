class Solution {
    public long sumAndMultiply(int n) {
        
        long sum=0;
        int sum2=0;
        while(n>0){
            long b=n%10;
            sum2+=b;
            if(b!=0){

            sum=sum*10+b;
            }
            n/=10;
        }
        System.out.println(sum);
        sum=(int)sum;
        int sum1=0;

        while(sum>0){
            int b=(int)sum%10;
            sum1=sum1*10+b;
            sum/=10;
        }
        System.out.println(sum1);
        return (long)sum1*sum2;
    }
}