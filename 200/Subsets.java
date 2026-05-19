1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        int n=nums.length;
4        int m=(1<<n);
5        List<List<Integer>> list=new ArrayList<>();
6        for(int i=0; i<m; i++){
7            List<Integer> list1=new ArrayList<>();
8            for(int j=0; j<n; j++){
9                if((i>>j)%2==1) list1.add(nums[j]);
10            }
11            list.add(list1);
12        }
13        return list;
14    }
15}