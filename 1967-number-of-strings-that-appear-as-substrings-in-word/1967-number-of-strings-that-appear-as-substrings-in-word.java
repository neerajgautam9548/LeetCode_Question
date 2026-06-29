class Solution {
    public int numOfStrings(String[] arr, String word) {
        HashSet<Character> set=new HashSet<>();
        for(char ch:word.toCharArray()) set.add(ch);
        int count=0;
        for(int i=0; i<arr.length; i++){
            boolean flag=true;
            String str=arr[i];
           // for(char ch:str.toCharArray()){
                if(!word.contains(str+"")){
                    flag=false;
                }
         //   }

            if(flag){
                count++;
            }
        }
        return count;
    }
}