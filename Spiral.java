import java.util.Arrays;

import Parents.ListNode;

public class Spiral {
    public static void main(String[] args) {
        ListNode head = new ListNode(7);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next = new ListNode(4);
        int[][] matrix=new int[3][2];
        matrix=spiralMatrix(3, 2, head);
        for (int[] is : matrix) {
            System.out.println(Arrays.toString(is)+"////");
            
        }

      

    }

    public static int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix = new int[m][n];
        for(int[] arr: matrix) 
            Arrays.fill(arr,-1);
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (head != null) {
           
            for (int i = left; i <= right; i++) {
if(head!=null){
                matrix[top][i] = head.val;
                head = head.next;
}

            }
            top++;
         

            for (int i = top; i <= bottom; i++) {
                if(head!=null){
                matrix[i][right] = head.val;
                head = head.next;
                }
            }
            right--;
            

            for (int i = right; i >= left; i--) {
                if(head!=null){
                matrix[bottom][i] = head.val;
                head = head.next;
                }
            }
            bottom--;
            

            for (int i = bottom; i >= top; i--) {
                if(head!=null){
                    matrix[i][left] = head.val;
                head = head.next;
                }
                

            }
            left++;

        }
        return matrix;

    }

}
