package if_condition;

public class NumberDivisibleBy3 {
    public static void main(String[] args) {
        int num = 15;

        if(num % 3 == 0){
            System.out.println(num + "is divisible by 3");
        }else{
            System.out.println(num + "is not divisible by 3");
        }
    }
}
