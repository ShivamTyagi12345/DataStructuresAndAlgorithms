// import Parents.ListNode;

// class Solution {
    
//     public ListNode reverseEvenLengthGroups(ListNode head) {
        
//         //ans is going to be head of our resulting linkedlist
        

// //         adding 1st group nodes to ans and removing them from given list
// //         1st group only contains head of given linkedlist
//         ListNode ans=head;  
//         ListNode temp=head.next;
        
//         head.next=null;
//         head=temp;
//         int size=Size(head); //size of given likedlist
        
//         int k=2;  //size of current group 
        
        
// // this loop will create a linkedlist templist having all nodes of a group (of size k)
//         while(temp!=null && k<=size){
            
//             ListNode templist=null; 
//             int count=k;
            
// //             adding all nodes of group to templist and removing respective nodes from given linkedlist
//             while(count-->0){
                
//                 templist=addLast(templist,temp.val);  
//                 temp=remFirst(temp);
                
//             }
            
// //             now check if size of group is even then
//             if(k%2==0){
//                 templist=rev(templist);  //reverse templist
//             }
            
//             ans= add(ans,templist);  //merge ans and templist 
            
//             size-=k;
//             k++; 
//         }
        
//         size=Size(temp);
//         if(size%2==0){
//             temp=rev(temp);
//         }
//         ans=add(ans,temp);
//         return ans;
//     }
    
// //     Function to determine size of the LinkedList
//     public int Size(ListNode head){
//         ListNode temp=head;
//         int size=0;
//         while(temp!=null){
//             temp=temp.next;
//             size++;
//         }
//         return size;
//     }
    
// //     this Function will add a node(having data val) at the last of linkedlist
//     public ListNode addLast(ListNode head,int val){
//         ListNode nn= new ListNode(val);
//         if(head==null){
//             return nn;
//         }
        
//         ListNode temp=head;
        
//         while(temp.next!=null){
//             temp=temp.next;
//         }
        
//         temp.next=nn;
//         return head;
//     }
    
    
// //     this function will remove the first node of the linkedlist
//     public ListNode remFirst(ListNode head){
//         ListNode temp=head;
//         head=head.next;
//         temp.next=null;
//         return head;
//     }
    
    
// //     This function will merge two linkedlist
//     public ListNode add(ListNode list1,ListNode list2){
        
//         ListNode temp=list1;
//         while(temp.next!=null){
//             temp=temp.next;
//         }
//         temp.next=list2;
//         return list1;
//     }
    
// //     this Function will reverse the LinkedList
//     public ListNode rev(ListNode head){
        
//         ListNode prev=null;
//         ListNode curr= head;
//         while(curr!=null){
//             ListNode currnext=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=currnext;
//         }
//         head=prev;
//         return head;
        
//     }
    
// }