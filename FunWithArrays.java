/**
 * A class containing several methods that manipulate arrays of integers.
 *
 * @author CD for CS230X (adapated from TM) + Kailyn Lau
 * @version F24 v1.1
 */

public class FunWithArrays {
    private int[] myArray;

    /** 
     * Constructor with an array of ints as input
     */
    public FunWithArrays(int[] array){
        myArray = array;
    }

    /** 
     * Prints the elements of the integer array.
     */
    public static void printArray(int[] array){
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    /**
     * This method calculates and returns the sum of all elements in the array.
     * 
     * @return an int representing the sum of all elements in the array
     */
    public int calculateSum(){
        int sum = 0;
        for (int num : myArray) {
            sum += num;
        }
        return sum;
    }

    /**
     * This method calculates and returns the average of all elements in the array.
     * 
     * @return a double calculating the average (and 0.0 if array is empty because of division by 0)
     */
    public double calculateAverage(){
        if (myArray.length == 0) {
            return 0;
        }
        int sum = calculateSum();
        return (double)sum/myArray.length;
    }

    /**
     * This method calculates and returns the max of all elements in the array.
     * Currently returns 0 if array is empty. Would have to change return type to Integer object if value null is preferable.
     * 
     * @return an int representing the max of all elements in the array (and 0 if array is empty)
     */
    public int findMax(){
        try {
            int max = myArray[0];
        } catch (IndexOutOfBoundsException e) {
            return 0;
        }

        int max = myArray[0];
        for (int num : myArray) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    /**
     * This method calculates both the minimum and the maximum value in the input integer array. 
     * It returns a small 2-element integer array which has the minimum value stored at index 0 and the maximum value at index 1.  
     * 
     * @return 2-element int[] of [min, max]
     */
    public int[] findMinMax(){
        int[] minMaxArray = new int[2];

        if (myArray.length == 0) {
            return minMaxArray;
        }

        int min = myArray[0];
        for (int num : myArray) { // finding min
            if (num < min) {
                min = num;
            }
        }
        minMaxArray[0] = min;

        minMaxArray[1] = findMax();

        return minMaxArray;
    }

    /**
     * This method returns a new array with values in reversed order from the array.
     * 
     * @return a new array of myArray in reversed order
     */
    public int[] reverseArray(){
        int[] reverseArray = new int[myArray.length];

        int count = 0;
        for(int i = myArray.length; i > 0; i--) { // iterating backwards
            reverseArray[count] = myArray[i - 1];
            count++;
        }

        return reverseArray;
    }

    /**
     * This method removes the element that appears on a certain position of the array. 
     * The method returns a new array, shorter in length by 1, with the element removed.  
     * If the input position is invalid, the array is returned without a change.
     * 
     * @param index the index to be removed
     * @return      int[] with the given index removed (unless index is invalid, in which case return the same array)
     */
    public int[] removeAtPosition(int index){
        try {
            int remove = myArray[index];
        } catch (IndexOutOfBoundsException e){
            return myArray;
        }
        
        int[] modifiedArray = new int[myArray.length - 1];
        for (int i = 0; i < index; i++) { // before index
            modifiedArray[i] = myArray[i];
        }
        
        for (int i = index + 1; i < myArray.length; i++) { // after index
            modifiedArray[i - 1] = myArray[i];
        }

        return modifiedArray;
    }

    public static void main(String[] args) {
        int[] nums = {7, 2, 15, 4, 9, 12};
        FunWithArrays arrayWithValues = new FunWithArrays(nums);

        System.out.println("Original int[] with values:");
        FunWithArrays.printArray(nums);
        System.out.println("\nExpected sum: 49 | Computed sum: " + arrayWithValues.calculateSum());
        System.out.println("Expected average: 8.1666... | Computed sum: " + arrayWithValues.calculateAverage());
        System.out.println("Expected max: 15 | Computed max: " + arrayWithValues.findMax());
        System.out.print("Expected min and max: 2 15 | Computed max: ");
        printArray(arrayWithValues.findMinMax());
        System.out.print("\n Expected reversed array: 12 4 9 15 2 7 | Computed array: ");
        printArray(arrayWithValues.reverseArray());
        System.out.print("\nExpected array with removed index 3: 7 2 15 9 12 | Computed array: ");
        printArray(arrayWithValues.removeAtPosition(3));
        System.out.print("\nExpected array with removed (invalid) index 8: 7 2 15 4 9 12 | Computed array: ");
        printArray(arrayWithValues.removeAtPosition(8));

        int[] noElementIntArray = new int[0];
        FunWithArrays arrayEmpty = new FunWithArrays(noElementIntArray);

        System.out.println("\n");
        System.out.println("Original empty int[]:");
        FunWithArrays.printArray(noElementIntArray);
        System.out.println("\nExpected sum: 0 | Computed sum: " + arrayEmpty.calculateSum());
        System.out.println("Expected average: 0.0(because of division by 0) | Computed average: " + arrayEmpty.calculateAverage());
        System.out.println("Expected max: 0 | Computed max: " + arrayEmpty.findMax());
        System.out.print("Expected min and max: 0 0| Computed min and max: ");
        printArray(arrayEmpty.findMinMax());
        System.out.print("\n Expected reversed array: | Computed array: ");
        printArray(arrayEmpty.reverseArray());
        System.out.print("\nExpected array with removed (invalid) index 3: | Computed array: ");
        printArray(arrayEmpty.removeAtPosition(3));
        System.out.println("\nExpected array with removed (invalid) index 8: | Computed array: ");
        printArray(arrayEmpty.removeAtPosition(8));
    } 
}