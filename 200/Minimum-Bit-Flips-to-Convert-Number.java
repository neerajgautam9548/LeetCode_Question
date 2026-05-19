1class Solution {
2    public int minBitFlips(int start, int goal) {
3        int count=0;
4        for(int i=0; i<31; i++){
5            if((start>>i)%2 != (goal>>i)%2){
6              //  System.out.println((start>>i) +" "+(goal>>i));
7             count++;
8            }
9        }
10        return count;
11    }
12}