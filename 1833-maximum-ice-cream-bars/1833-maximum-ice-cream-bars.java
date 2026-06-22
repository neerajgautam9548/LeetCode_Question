class Solution {
    public int maxIceCream(int[] arr, int coins) {
        int count=0;
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=coins){
                coins-=arr[i];
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}