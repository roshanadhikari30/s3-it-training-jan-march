package if_condition;

public class Password {

    public static void main(String[] args) {
        PasswordCriteria passwordObj = new PasswordCriteria();
        String validP= "Abcd123456";
        String invalidP = "12345678b!";

        boolean p1 = passwordObj.CheckIfPasswordIsAtleast10Characters(validP);
        boolean p2 = passwordObj.CheckIfPasswordIsOnlyLettersAndDigit(validP);
        boolean p3 = passwordObj.IfAtleast2Digits(validP);
        boolean p4 = passwordObj.IfAtLeastUpperCase(validP);

        if(p1 == true){
            if(p2 == true){
                if(p3== true) {
                    if(p4 == true){
                        System.out.println("Password is Valid");
                    }else{
                        System.out.println("Password should have at least one uppercase");
                    }

                }else{
                    System.out.println("Password should have at least 2 digits.");
                }
            }else{
                System.out.println("Password should be only letters and characters");
            }
        }else{
            System.out.println("Password should be at least 10 characters");
        }
    }
}
