1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode dummy = new ListNode();
14        ListNode cur=dummy;
15        int carry=0;
16        while(l1!=null || l2 != null || carry !=0){
17            int sum=carry;
18            if(l1!=null){
19                sum+=l1.val;
20                l1=l1.next;
21
22            }
23            if(l2!=null){
24                sum+=l2.val;
25                l2=l2.next;
26            }
27            carry=sum/10;
28            cur.next=new ListNode(sum%10);
29            cur=cur.next;
30        }
31        return dummy.next;
32    }
33}