1class Solution {
2    public int numOfStrings(String[] arr, String word) {
3        HashSet<Character> set=new HashSet<>();
4        for(char ch:word.toCharArray()) set.add(ch);
5        int count=0;
6        for(int i=0; i<arr.length; i++){
7            boolean flag=true;
8            String str=arr[i];
9           // for(char ch:str.toCharArray()){
10                if(!word.contains(str+"")){
11                    flag=false;
12                }
13         //   }
14
15            if(flag){
16                count++;
17            }
18        }
19        return count;
20    }
21}