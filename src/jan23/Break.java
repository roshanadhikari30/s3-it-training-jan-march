package jan23;

public class Break {


    public static void main(String[] args) {

        //for - argument - starting, ending point, increment
            //statements
        int rollNumber;

        int studentMissingClassRollNumber = 6;
        for (rollNumber = 1; rollNumber <=10; rollNumber++){
            System.out.println(rollNumber);
            if (rollNumber == studentMissingClassRollNumber){
                break;
            }
        }

    }


}
