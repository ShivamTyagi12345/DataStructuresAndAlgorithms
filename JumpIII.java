public class JumpIII {

    // True: We can Find an index where value is 0
    public static boolean canReach(int[] arr, int start) {
        if (start < 0 || start > arr.length - 1 || arr[start] == -1)
            return false;

        if (arr[start] == 0)
            return true;
        arr[start] = -1;
        return canReach(arr, start - arr[start]) || canReach(arr, start + arr[start]);
        // Do a bfs till we come across A 0
        // When you are at index i, you can jump to i + arr[i] or i - arr[i], check if
        // you can reach to any index with value 0.

    }

    public static void main(String[] args) {
        int start = 2;
        int[] arr = { 3, 0, 2, 1, 2 };
        System.out.println(canReach(arr, start));

    }

}
