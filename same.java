// import java.util.ArrayList;
// import java.util.List;

// public class same {
//     public boolean canChange(String start, String target) {
//         if (!(start.replaceAll("_", "")).equals(target.replaceAll("_", ""))) {
//             return false;
//         }
//         List<Integer> list1 = new ArrayList<>();
//         List<Integer> list2 = new ArrayList<>();
        

//         for (int i = 0; i < start.length(); i++)
//             if (start.charAt(i) != '_')
//                 list1.add(i);
//         for (int i = 0; i < target.length(); i++)
//             if (target.charAt(i) != '_')
//                 list2.add(i);

//         for (int i = 0; i < list1.size(); i++) {
//             char c1 = start.charAt(list1.get(i));
//             char c2 = target.charAt(list2.get(i));
//             if (c1 != c2)
//                 return false;
//             if (c1 == 'L' && list1.get(i) < list2.get(i))
//                 return false;
//             else (c1 == 'R' && list1.get(i) > list2.get(i))
//                 return false;

//         }
//         return true;

//     }

// }
