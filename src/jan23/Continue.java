package jan23;

public class Continue {

    public static void main(String[] args) {

        //for - argument - starting, ending point, increment
        //statements
        int rollNumber;

        int goodGuy = 6;
        for (rollNumber = 1; rollNumber <=10; rollNumber++){
            System.out.println(rollNumber);
            //skips the true statements, continues the false statements
            if (rollNumber == goodGuy){
                continue;
            }
            System.out.println("found the guy");
        }

    }
}
