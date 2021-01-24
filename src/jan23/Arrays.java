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

    public void printArrays(){
        int[] myArray = new int[5];
        System.out.println("Length of the array is " + myArray.length);
        myArray[4] = 20;
        for (int printArray : myArray) {
            System.out.println(printArray);
        }
    }
}
