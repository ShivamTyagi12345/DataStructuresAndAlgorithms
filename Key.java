// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

// class Pair{
//     public String val;
//     public int time;
    
//     Pair(String val, int time){
//         this.val = val;
//         this.time = time;
//     }
// }

// class TimeMap {
//     Map<String, List<Pair>> m = new HashMap<>();
//     public TimeMap() {
//     }
    
//     public void set(String key, String value, int timestamp) {
//         if(!m.containsKey(key)) m.put(key, new ArrayList<>());
//         m.get(key).add(new Pair(value, timestamp));
//     }
    
//     public String get(String key, int timestamp) {
//         if(!m.containsKey(key)) return "";
        
//         List<Pair> cur = m.get(key);
//         int l = -1, r = cur.size();
//         while(r > l + 1){
//             int m = (l + r) / 2;
//             if(cur.get(m).time <= timestamp){
//                 l = m;
//             }
//             else{
//                 r = m;
//             }
//         } 
        
//         return l == -1 ? "" : cur.get(l).val;
//     }
// }