1class Solution {
2    public int hammingWeight(int n) {
3        int count=0;
4        for(int i=0; i<31; i++){
5            if((n>>i)%2==1) count++;
6        }
7        return count;
8    }
9}