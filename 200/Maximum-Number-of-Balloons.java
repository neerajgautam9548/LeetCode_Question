1class Solution {
2    public int maxNumberOfBalloons(String text) {
3        Map<Character,Integer> map=new HashMap<>();
4        for(char ch:text.toCharArray()){
5            map.put(ch,map.getOrDefault(ch,0)+1);
6        }
7        int b=map.getOrDefault('b',0);
8        int a=map.getOrDefault('a',0);
9        int l=map.getOrDefault('l',0)/2;
10        int o=map.getOrDefault('o',0)/2;
11        int n=map.getOrDefault('n',0);
12        
13        return Math.min(Math.min(Math.min(b,a),Math.min(l,o)),n);
14
15       
16        
17    }   
18}
19