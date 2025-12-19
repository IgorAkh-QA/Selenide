package demoqa.utils;
import java.util.concurrent.ThreadLocalRandom;
import java.security.SecureRandom;

public class RandomUtils {
    public static void main(String[] args) {
        System.out.println(randomString(10));
        System.out.println(randomInt(3, 98));

        String[] names = {"a", "b", "c"};
        System.out.println(randomItem(names));

    }
    public static int randomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static String randomString(int len) {
        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(len);
            for(int i = 0; i < len; i++)
                sb.append(AB.charAt(rnd.nextInt(AB.length())));
            return sb.toString();
        }


    public static String randomEmail() {
        return randomString(10) + "@gmail.com";
    }


    public static String randomItem(String[] values) {
      int index = randomInt(0, values.length -1);
        return values[index];
    }
    }


