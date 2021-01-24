package jan23;

public class Validation {

    public static void main(String[] args) {
        validatePassword("abc12345abcdef");
        validatePassword("hfbsdffdfdsdsdfd");
        validatePassword("fdfdfddf1dfdddfdf");
        validatePassword("fdfd1dffdd.//fdfd");
        validatePassword("fddfd12fddfdfd21");
        validatePassword("123345454554554545");
    }


    public static void validatePassword(String password) {

        if (checkLengthOfCharacters(password)) {
            if (checkForLettersAndDigitsOnly(password)) {
                if (containsAtLeastTwoDigits(password) && containsAtLestOneLetter(password)) {
                    System.out.println("Valid password");
                } else {
                    System.out.println("Invalid password");
                }
            } else {
                System.out.println("Invalid password");
            }
        } else {
            System.out.println("Invalid password");
        }
    }


    public static boolean checkForLettersAndDigitsOnly(String password) {
        boolean lettersAndDigitsOnly = true;
        for (int x = 0; x < password.length(); x++) {
            if (!Character.isLetterOrDigit(password.charAt(x))) lettersAndDigitsOnly = false;
        }
        return lettersAndDigitsOnly;

    }
//hjhhhjjh
    public static boolean containsAtLeastTwoDigits(String password) {
        int numberOfDigits = 0;
        for (int x = 0; x < password.length(); x++) {
            if (Character.isDigit(password.charAt(x))) numberOfDigits++;
        }
        return numberOfDigits >= 2;
    }

    public static boolean containsAtLestOneLetter(String password) {
        int numberOfCharacters = 0;
        for (int x = 0; x < password.length(); x++) {
            if (Character.isLetter(password.charAt(x))) numberOfCharacters++;
        }
        return numberOfCharacters >= 1;
    }

    public static boolean checkLengthOfCharacters(String password) {
        return password.length() >= 10;
    }
}
