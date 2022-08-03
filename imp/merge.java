package day4.imp;

/**
 * merge
 */
public class merge {

    public void merger(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m];
        int k = 0;

        while (k < m) {
            temp[k] = nums1[k];
            k++;
        }
        int i = 0, j = 0, index = 0;
        while (i < m && j < n) {
            if (temp[i] == nums2[j]) {
                nums1[index] = temp[i];
                nums1[index + 1] = temp[i];
                index += 2;
                i++;
                j++;
            } else if (temp[i] < nums2[j]) {
                nums1[index] = temp[i];
                i++;
                index++;

            } else {
                nums1[index] = nums2[j];
                j++;
                index++;
            }
        }

        while (i < m) {
            nums1[index] = temp[i];
            i++;
            index++;
        }

        while (j < n) {
            nums1[index] = nums2[j];
            j++;
            index++;
        }

    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        int m = 3, n = 3;
        merge m1 = new merge();
        m1.merger(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }

    }
}
