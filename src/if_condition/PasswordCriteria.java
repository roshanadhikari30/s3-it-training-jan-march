package if_condition;

public class PasswordCriteria {

    public boolean CheckIfPasswordIsAtleast10Characters(String password){
        if (password.length() >= 10) {
            return true;
        } else{
            return false;
        }
    }

    public boolean CheckIfPasswordIsOnlyLettersAndDigit(String password){
        for (int i = 0; i <password.length(); i++){
            if(!Character.isLetterOrDigit(password.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public boolean IfAtleast2Digits(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                count++;
            }
            if (count >= 2) {
                return true;
            }
        } return false;
    }

    public boolean IfAtLeastUpperCase(String password){
        for(int i = 0; i<password.length(); i++){
            if(Character.isUpperCase(password.charAt(i))){
                return true;
            }
        } return false;
    }

}
