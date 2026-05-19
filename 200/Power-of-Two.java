1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        if(n==0) return false;
4        if(n==1) return true;
5        if(n%2==1) return false;
6        return isPowerOfTwo(n/2);
7    
8    }
9}