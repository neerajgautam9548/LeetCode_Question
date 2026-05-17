1class Solution {
2    public int singleNumber(int[] nums) {
3        int a=0;
4        for(int i:nums){
5            a^=i;
6        }
7        return a;
8    }
9}