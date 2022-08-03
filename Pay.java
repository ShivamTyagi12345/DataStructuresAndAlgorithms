package day4;

class Pay {
    public double calculateTax(int[][] br, int income) {
        if (income == 0)
            return 0;
        double answer = 0;
        int last = 0;
        for (int[] pair : br) {
            int taxable = Math.min(pair[0], income) - last;
            answer += taxable * (double) pair[1] / (double) 100;
            last = pair[0];
            if (last >= income)
                break;
        }
        return answer;
    }

    public static void main(String[] args) {
        Pay p = new Pay();
        int[][] br = { { 3, 50 }, { 7, 10 }, { 12, 15 } };
        System.out.println(p.calculateTax(br, 10));

    }
}
