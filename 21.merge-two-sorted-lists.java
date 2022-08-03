// import Parents.ListNode;

// /*
//  * @lc app=leetcode id=21 lang=java
//  *
//  * [21] Merge Two Sorted Lists
//  */

// // @lc code=start
// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  * int val;
//  * ListNode next;
//  * ListNode() {}
//  * ListNode(int val) { this.val = val; }
//  * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode ans = new ListNode(-1);
//         ListNode temp = ans;
//         while (list1 != null || list2 != null) {
//             ListNode a = list1,
//                     b = list2;
//             if (a.val < b.val) {
//                 stemp.next = a;
//                 temp = temp.next;
//                 list1 = list1.next;

//             }
//             else if(a.val==b.val){
//                 temp.next=a;
//                 temp.next.next=b;
//             }
//         }

//     }
// }
// // @lc code=end
