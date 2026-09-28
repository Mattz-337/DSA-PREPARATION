package prob1.com.lab.util;

public class Validator {

    public static boolean isValidUpiId(String id) {

        int count = 0;

        for (int i = 0; i < id.length(); i++) {

            if (id.charAt(i) == '@') {
                count++;
            }
        }

        return count == 1;
    }
}