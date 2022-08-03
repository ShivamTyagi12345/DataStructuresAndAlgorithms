// import java.util.ArrayList;
// import java.util.List;

// class sub {
//     public static List<List<Integer>> subsets(int[] nums) {
//         List<List<Integer>> list = new ArrayList<>();
//         list.add(new ArrayList<>());
//         for (int num : nums) {
//             int n = list.size();
//             for (int i = 0; i < n; i++) {
//                 List internal = new ArrayList<>(list.get(i));
//                 internal.add(num);
//                 list.add(internal);
//             }
//         }
//         return list;
//     }
//     public static void main(String[] args) {
//         // int[] nums={1,3,2};
//         // System.out.println(subsets(nums));
//         List internal = new ArrayList<>();
//         internal.add(1);
//         internal.add(2);
       
//         List<Integer> list = new ArrayList<>(internal);
        
       
// System.out.println(list);
//     }
// }