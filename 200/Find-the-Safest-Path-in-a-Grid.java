1import java.util.*;
2
3class Solution {
4
5    int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
6
7    public int maximumSafenessFactor(List<List<Integer>> grid) {
8
9        int n = grid.size();
10
11        // Step 1: Distance of every cell from nearest thief
12        int[][] dist = new int[n][n];
13        for (int[] row : dist)
14            Arrays.fill(row, -1);
15
16        Queue<int[]> q = new LinkedList<>();
17
18        for (int i = 0; i < n; i++) {
19            for (int j = 0; j < n; j++) {
20                if (grid.get(i).get(j) == 1) {
21                    dist[i][j] = 0;
22                    q.offer(new int[]{i, j});
23                }
24            }
25        }
26
27        while (!q.isEmpty()) {
28            int[] cur = q.poll();
29
30            for (int[] d : dir) {
31                int x = cur[0] + d[0];
32                int y = cur[1] + d[1];
33
34                if (x >= 0 && y >= 0 && x < n && y < n && dist[x][y] == -1) {
35                    dist[x][y] = dist[cur[0]][cur[1]] + 1;
36                    q.offer(new int[]{x, y});
37                }
38            }
39        }
40
41        int low = 0;
42        int high = 2 * n;
43
44        while (low <= high) {
45            int mid = low + (high - low) / 2;
46
47            if (canReach(dist, mid)) {
48                low = mid + 1;
49            } else {
50                high = mid - 1;
51            }
52        }
53
54        return high;
55    }
56
57    private boolean canReach(int[][] dist, int safe) {
58
59        int n = dist.length;
60
61        if (dist[0][0] < safe)
62            return false;
63
64        boolean[][] vis = new boolean[n][n];
65        Queue<int[]> q = new LinkedList<>();
66
67        q.offer(new int[]{0, 0});
68        vis[0][0] = true;
69
70        while (!q.isEmpty()) {
71
72            int[] cur = q.poll();
73
74            if (cur[0] == n - 1 && cur[1] == n - 1)
75                return true;
76
77            for (int[] d : dir) {
78
79                int x = cur[0] + d[0];
80                int y = cur[1] + d[1];
81
82                if (x >= 0 && y >= 0 && x < n && y < n &&
83                        !vis[x][y] &&
84                        dist[x][y] >= safe) {
85
86                    vis[x][y] = true;
87                    q.offer(new int[]{x, y});
88                }
89            }
90        }
91
92        return false;
93    }
94}