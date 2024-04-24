 package palindrome;

public class palindrome {
    public static void main(String[] args) {
        String s = "malayalam";

        int i = 0;
        int j = s.length() - 1;
        boolean flag = true;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }

        if (flag) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
