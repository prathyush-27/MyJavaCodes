//MD5 HASH FUNCTION
import java.security.*;
import java.util.*;

public class MD5hash {
    public static void main(String[] args) {
        System.out.println("Enter a value : ");
        Scanner sc = new Scanner(System.in);
        String textToHash = sc.nextLine();
        String md5Hash = calculateMD5Hash(textToHash);
        System.out.println("MD5 Hash: " + md5Hash);
    }

    public static String calculateMD5Hash(String text) {
        try {

            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(text.getBytes());
            byte[] md5HashBytes = md.digest();
            StringBuilder hexStringBuilder = new StringBuilder();
            for (byte b : md5HashBytes) {
                hexStringBuilder.append(String.format("%02x", b));
            }

            return hexStringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
