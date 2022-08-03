import Parents.ListNode;
public class twinsum {
    public static int pairSum(ListNode head) {
        int maxsum=0,l=0;
       
        ListNode fast=head,slow=head;
        while(fast!=null){
            l++;
           
            fast=fast.next;
            
        }
        
         int arr[]=new int[l];
        for(int i=0;i<l&&slow!=null;i++){
            arr[i]=slow.val;
            slow=slow.next;
        }
        
        for(int j=0;j<l/2;j++){
            int sum=arr[j]+arr[l-1-j];
            maxsum=Math.max(maxsum,sum);
            
        }
        
        return maxsum;
        
    }
    public static void main(String[] args) {
            ListNode head= new ListNode(5);
            head.next=new ListNode(4);
            head.next.next=new ListNode(2);
            head.next.next.next=new ListNode(1);
            System.out.println( pairSum(head));
    }
    
}
