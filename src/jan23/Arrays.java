package jan23;

public class Arrays {

    /*
    1. Array will let us hold multiple values
    2. Array can hold the values of same data type
    3. {2,3,4} -> good, {"a", 2}
    4. yo have to specify the length
    5. Default value is 0
    Syntax to crate an array
    int [] myArray;
     */

    public static void main(String[] args) {
        int[] myArray = new int[5];
        System.out.println("Length of the array is " + myArray.length);
        int lastIndex = myArray.length - 1;
        System.out.println("Value at index: " + lastIndex + " is " + myArray[lastIndex]);
        System.out.println("Value at index: 2 is " + myArray[2]);
        //adding the value
        //assign a value to an index 4
        myArray[4] = 20;
        System.out.println(myArray[4]);

        //readability
        for (int printArray : myArray) {
            System.out.println(printArray);
        }

        for (int x = 0; x < myArray.length; x++) {
            System.out.println(myArray[x]);
        }
    }
}
