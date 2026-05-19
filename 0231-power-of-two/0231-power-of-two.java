class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=0; i<31; i++){
            if((n>>i)%2==1){
                if(n==(1<<i)) return true;
                return false;
            }
 
        }
        return false;
    
    }
}