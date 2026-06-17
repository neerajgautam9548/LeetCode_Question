1class Solution {
2    public List<String> fizzBuzz(int n) {
3        List<String> list=new ArrayList<>();
4        for(int i=1; i<=n; i++){
5            if(i%3==0 && i%5==0){
6                list.add("FizzBuzz");
7            }
8            else if(i%3==0){
9                list.add("Fizz");
10            }
11            else if(i%5==0){
12                list.add("Buzz");
13            }
14            else{
15                list.add(i+"");
16            }
17        }
18        return list;
19    }
20}