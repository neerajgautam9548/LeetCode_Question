1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        for(int i=0; i<31; i++){
4            if((n>>i)%2==1){
5                if(n==(1<<i)) return true;
6                return false;
7            }
8 
9        }
10        return false;
11    
12    }
13}