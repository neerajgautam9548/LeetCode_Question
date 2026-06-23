1import java.util.*;
2
3class Solution {
4    static final long MOD = 1000000007;
5
6    public int assignEdgeWeights(int[][] edges) {
7
8        int n = edges.length + 1;
9
10        List<Integer>[] graph = new ArrayList[n + 1];
11
12        for (int i = 1; i <= n; i++) {
13            graph[i] = new ArrayList<>();
14        }
15
16        for (int[] edge : edges) {
17            int u = edge[0];
18            int v = edge[1];
19
20            graph[u].add(v);
21            graph[v].add(u);
22        }
23
24        Queue<Integer> q = new LinkedList<>();
25        boolean[] visited = new boolean[n + 1];
26
27        q.offer(1);
28        visited[1] = true;
29
30        int depth = -1;
31
32        while (!q.isEmpty()) {
33            int size = q.size();
34            depth++;
35
36            for (int i = 0; i < size; i++) {
37                int curr = q.poll();
38
39                for (int nei : graph[curr]) {
40                    if (!visited[nei]) {
41                        visited[nei] = true;
42                        q.offer(nei);
43                    }
44                }
45            }
46        }
47
48        return (int) power(2, depth - 1);
49    }
50
51    private long power(long base, long exp) {
52        long ans = 1;
53
54        while (exp > 0) {
55            if ((exp & 1) == 1) {
56                ans = (ans * base) % MOD;
57            }
58
59            base = (base * base) % MOD;
60            exp >>= 1;
61        }
62
63        return ans;
64    }
65}