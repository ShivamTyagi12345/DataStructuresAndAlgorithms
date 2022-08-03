public class small {
    public static void main(String[] args) {
        String num = "10200";
        int k = 1;
        System.out.println(removeKdigits(num, k));
    }

    public static String removeKdigits(String string, int k) {
        int l = string.length();
        if (k == l)
            return "0";
        // delete the digit if the next digit is smaller

        String num="";
        for (int i = 1; i < l ; i++) {
            int pre = string.charAt(i-1) - '0';
            int post = string.charAt(i ) - '0';
            if(k==0)break;
            if (pre <= post && k > 0) {
                k--;
                num+=pre;
            }

        }
        int index=0;
        char[] arr=num.toCharArray();
        while (arr[index]=='0') {
            index++;
}


        return num.substring(index)+string.charAt(l-1);

    }
}
