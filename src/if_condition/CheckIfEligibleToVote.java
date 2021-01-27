package if_condition;

public class CheckIfEligibleToVote {
    public static void main(String[] args) {

        int age = 45;
        boolean citizen = true;

        if(citizen == true){
            if (age >= 18){
                System.out.println("You are eligible to vote");
            }
        }else{
            System.out.println("You are not eligible to vote");
        }


    }
}
