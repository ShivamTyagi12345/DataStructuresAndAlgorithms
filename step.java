// import java.util.HashMap;
// import java.util.PriorityQueue;

// class Pair {
//     String f;
//     int r;

//     Pair(String f, int r) {
//         this.f = f;
//         this.r = r;
//     }
// }

// class FoodRatings {
//     HashMap<String, PriorityQueue<Pair>> countryToPair = new HashMap<>();
//     HashMap<String, String> foodtoCountry = new HashMap<>();

//     public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {

//         for (int i = 0; i < ratings.length; i++) {

//             String key = cuisines[i];
//             Pair val = new Pair(foods[i], ratings[i]);
//             countryToPair.getOrDefault(key, new PriorityQueue<>((a, b) -> (b.r - a.r))).add(val);

//             foodtoCountry.put(foods[i], cuisines[i]);
//         }

//     }

//     public void changeRating(String food, int newRating) {
//         String key = foodtoCountry.get(food);

//         for (Pair pair : countryToPair.get(key)) {
//             if (pair.f == food)
//                 pair.r = newRating;

//         }

//     }

//     public String highestRated(String cuisine) {
//         return countryToPair.get(cuisine).poll().f;

//     }
// }