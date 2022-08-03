// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;;

// public class Bus {
//     public static void main(String[] args) {
//         int[] buses = { 3 }, passengers = { 2, 3 };
//         int capacity = 2;
//         System.out.println(latestTimeCatchTheBus(buses, passengers, capacity));
//     }

//     public static int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {

//         Arrays.sort(passengers);
//         Arrays.sort(buses);
//         List<Integer>[] list=new ArrayList[buses.length];

//         for (int bus : buses) {
//             list[bus]=new ArrayList<>(capacity);
            
//         }


        

//         int position = 0;
//         for (int i = 0; i < buses.length ; i++) {
//             int count = 0;
//             while (passengers[position] <= buses[i] && count <= capacity) {
//                 list[i].add(passengers[position]);
//                 position += 1;
//                 count += 1;
//             }

//         }

//         return list[buses.length-1].get(0)-1;
       

//     }

// }
