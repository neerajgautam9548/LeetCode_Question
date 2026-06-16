1class Solution {
2        public int kthFactor(int n, int k) {
3        int cnt = 0;
4        List<Integer> l = new ArrayList<>();
5        for(int i = 1; i * i <= n; i++) {
6            if (n % i == 0) {
7                if (i * i != n) l.add(n / i); 
8                if (++cnt == k) return i; 
9            }
10        }
11        if (l.size() + cnt < k) return -1;
12        return l.get(l.size() - (k - cnt));
13    }
14}