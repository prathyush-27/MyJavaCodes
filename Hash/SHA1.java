//SHA1HASH
import java.security.*;
import java.util.*;

public class SHA1 {

    public static String calculateSHA1Hash(String text) {
        try {

            MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
            sha1.update(text.getBytes());
            byte[] sha1HashBytes = sha1.digest();
            StringBuilder hexStringBuilder = new StringBuilder();
            for (byte b : sha1HashBytes) {
                hexStringBuilder.append(String.format("%02x", b));
            }

            return hexStringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }


    public static void main(String[] args) {
        System.out.println("Enter a value : ");
        Scanner sc = new Scanner(System.in);
        String textToHash = sc.nextLine();
        String sha1Hash = calculateSHA1Hash(textToHash);
        System.out.println("SHA-1 Hash: " + sha1Hash);
    }
}
