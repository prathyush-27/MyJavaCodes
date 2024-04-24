//SHA256HASHExample
import java.security.*;
import java.util.Scanner;

public class SHA2
{
    public static String calculateSHA256Hash(String text) {
        try {
            MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
            sha256.update(text.getBytes());
            byte[] sha256HashBytes = sha256.digest();
            StringBuilder hexStringBuilder = new StringBuilder();
            for (byte b : sha256HashBytes) {
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
        String sha256Hash = calculateSHA256Hash(textToHash);
        System.out.println("SHA-256 Hash: " + sha256Hash);
    }


}
