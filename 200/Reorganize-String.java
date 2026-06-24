1import java.util.*;
2
3class Solution {
4    public String reorganizeString(String s) {
5        
6        // Step 1: Frequency count
7        int[] freq = new int[26];
8        int n = s.length();
9        
10        for(char c : s.toCharArray()){
11            freq[c - 'a']++;
12            
13            // If impossible
14            if(freq[c - 'a'] > (n + 1) / 2){
15                return "";
16            }
17        }
18
19        // Step 2: Max Heap (frequency, character)
20        PriorityQueue<int[]> pq = new PriorityQueue<>(
21            (a, b) -> b[0] - a[0]   // max heap by frequency
22        );
23
24        for(int i = 0; i < 26; i++){
25            if(freq[i] > 0){
26                pq.add(new int[]{freq[i], i}); // store index instead of char
27            }
28        }
29
30        StringBuilder res = new StringBuilder();
31
32        // Step 3: Build result
33        while(!pq.isEmpty()){
34            
35            int[] temp1 = pq.poll();
36
37            // Conflict case
38            if(res.length() > 0 && res.charAt(res.length() - 1) == (char)(temp1[1] + 'a')){
39                
40                int[] temp2 = pq.poll();
41
42                res.append((char)(temp2[1] + 'a'));
43
44                if(temp2[0] - 1 > 0){
45                    pq.add(new int[]{temp2[0] - 1, temp2[1]});
46                }
47
48                pq.add(temp1);
49            }
50            else{
51                res.append((char)(temp1[1] + 'a'));
52
53                if(temp1[0] - 1 > 0){
54                    pq.add(new int[]{temp1[0] - 1, temp1[1]});
55                }
56            }
57        }
58
59        return res.toString();
60    }
61}