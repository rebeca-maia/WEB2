package general;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import model.Company;

public class Util {

    private Util() {
    }

    public static int getUserLoggedId(Company user) {
        if (user != null) {
            return user.getIdCompanay();
        }

        return 0;
    }

    public static String getUserLoggedName(Company user) {
        if (user != null && user.getNomeFantasia() != null) {
            return user.getNomeFantasia();
        }

        return "";
    }

    public static String MD5(String text) throws NoSuchAlgorithmException {

        MessageDigest m = MessageDigest.getInstance("MD5");
        m.update(text.getBytes(), 0, text.length());

        return new BigInteger(1, m.digest()).toString(16);
    }
}
