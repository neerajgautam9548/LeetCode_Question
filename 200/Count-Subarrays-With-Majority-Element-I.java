1class Solution {
2    public int countMajoritySubarrays(int[] nums, int target) {
3        int n = nums.length;
4        long ans = 0;
5
6        for (int i = 0; i < n; i++) {
7            int cnt = 0;
8
9            for (int j = i; j < n; j++) {
10                if (nums[j] == target) cnt++;
11
12                int len = j - i + 1;
13
14                if (2 * cnt > len)
15                    ans++;
16            }
17        }
18
19        return (int)ans;
20    }
21}