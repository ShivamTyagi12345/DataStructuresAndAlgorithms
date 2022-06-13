package day4;

import java.util.*;;

public class Minsum {
    public int minimumTotal(List<List<Integer>> triangle) {
        int sum = 0;
        int row = 1;
        int column = 0;

        return travel(triangle, sum, row, column) + triangle.get(0).get(0);

    }

    private int travel(List<List<Integer>> triangle, int sum, int row, int column) {
        if (row == triangle.size())
            return 0;
        int min = Integer.MAX_VALUE;
        for (int i = column; i < column + 2; ++i) {
            min = Math.min(triangle.get(row).get(i), min);

        }
        sum = min + travel(triangle, sum, row + 1, column);
        return sum;
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(-1);

        triangle.add(list);
        list = new ArrayList<>();
        list.add(2);
        list.add(3);
        triangle.add(list);
        list = new ArrayList<>();
        list.add(1);
        list.add(-1);
        list.add(-3);
        triangle.add(list);
        Minsum minsum = new Minsum();
        System.out.println(minsum.minimumTotal(triangle));

    }

}
