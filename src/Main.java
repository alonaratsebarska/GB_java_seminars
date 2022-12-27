public class Main {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));


        System.out.println();
    }

    static String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
        int j = b.length() - 1;
        int carry = 0;
        String res = "";
        for (int i = a .length() - 1; i >= 0; i--)  {
            if (a.charAt(i) == '1') {
                carry += 1;
            }
            if (j >= 0 && b.charAt(j) == '1') {
                carry += 1;
            }
            res = (carry % 2) + res;
            carry = carry / 2;
            j = j - 1;
        }

        if (carry == 1) {
            res = 1 + res;
        }

        return res;
    }
}