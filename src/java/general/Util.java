package general;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Util {

    private Util() {
    }

    public static String MD5(String text) throws NoSuchAlgorithmException {

        MessageDigest m = MessageDigest.getInstance("MD5");
        m.update(text.getBytes(), 0, text.length());

        return new BigInteger(1, m.digest()).toString(16);
    }
}
