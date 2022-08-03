package day4;

class Debug {
    public boolean strongPasswordCheckerII(String password) {
        boolean hasDigit = false;
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasSpecial = false;
        boolean has8 = false;
        boolean hasSame = true;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (c == '!' || c == '@' || c == '#' || c == '$' || c == '%' || c == '^' || c == '&' || c == '*'
                    || c == '(' || c == ')' || c == '-' || c == '+') {
                hasSpecial = true;
            }
            if (password.length() >= 8) {
                has8 = true;
            } 
            if (i > 0 && password.charAt(i) == password.charAt(i - 1)) {
                hasSame = false;
            }
        }
        return hasDigit && hasLower && hasUpper && hasSpecial && has8 && hasSame;

    }

    public static void main(String[] args) {
        Debug d = new Debug();
        String password = "11A!A!Aa";
        System.out.println(d.strongPasswordCheckerII(password));
    }
}
