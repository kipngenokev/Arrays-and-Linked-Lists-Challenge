import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Test {
    public static void main(String[] args){
        arrayTesting();
        linkedListTesting();
    }
    public static void arrayTesting() {
        int[] myRandomArray = new int[20];//created myRandomArray variable and declare its size to 20

        Random random = new Random();//to create an instance of the random class in order to generate 20 integers for the array
        for (int i = 0; i < 20; i++) {
            myRandomArray[i] = random.nextInt(2, 99);
            System.out.print(myRandomArray[i] + " ");//print out my randomly generated integers
        }
        System.out.println();

        Arrays.sort(myRandomArray);//use of this method in order to sort my integers
        System.out.println("sorted Array=" + Arrays.toString(myRandomArray));

        int minimumElement = myRandomArray[0];
        System.out.println("Minimum element=" + minimumElement);

        int[] low = new int[20];
        int[] high = new int[20];

        int lowerValue = 0; //initialize variable to store integer values lower than 50
        int higherValue = 0;//initialize variable to store integer values greater than 50

        for (int i = 0; i < myRandomArray.length; i++) {//looping through myRandomArray
            if (myRandomArray[i] < 50) {//checking for any values less than 50
                low[lowerValue] = myRandomArray[i];//assigning the values found to low array
                lowerValue++;
            } else if (myRandomArray[i] > 50) {//checking for values greater than 50
                high[higherValue] = myRandomArray[i];//assigning the values found to high array
                higherValue++;
            }
        }

        System.out.println("Low array before trimming="+Arrays.toString(low));
        System.out.println("High array before trimming="+Arrays.toString(high));

        low=Arrays.copyOfRange(low,0,lowerValue);//trimming out the zeros in the output
        high=Arrays.copyOfRange(high,0,higherValue);//trimming out the zeros

        System.out.println("Low array after trimming="+Arrays.toString(low));
        System.out.println("High array after trimming="+Arrays.toString(high));

        Arrays.sort(low);
        System.out.println("Sorted values for the low array:"+Arrays.toString(low));

        int[] updatedLow = Arrays.copyOfRange(low, 1, low.length);
        System.out.println("Updated low array after removing minimum value = " + Arrays.toString(updatedLow));


        System.out.println("=============");//just to separate the two method outputs

    }
        public static void linkedListTesting() {
            LinkedList<Integer> myRandomList = new LinkedList<>(); // Create a LinkedList to store 20 random integers

            Random random = new Random(); // Create an instance of Random to generate 20 integers
            for (int i = 0; i < 20; i++) {
                int randomNumber = random.nextInt(0, 100); // Generate a random number between 2 and 98
                myRandomList.add(randomNumber); // Add the random number to the LinkedList
                System.out.print(randomNumber + " "); // Print the random number
            }
            System.out.println();

            // Sort the LinkedList
            Collections.sort(myRandomList);
            System.out.println("Sorted List = " + myRandomList);

            // Find the minimum element, which will be the first element in the sorted list
            int minimumElement = myRandomList.getFirst();
            System.out.println("Minimum element = " + minimumElement);

            LinkedList<Integer> low = new LinkedList<>();
            LinkedList<Integer> high = new LinkedList<>();

            // Loop through the sorted list and split values into low and high lists
            for (int value : myRandomList) {
                if (value < 50) {
                    low.add(value); // Add values less than 50 to the low list
                } else if (value > 50) {
                    high.add(value); // Add values greater than 50 to the high list
                }
            }

            // Display the low and high lists before any modification
            System.out.println("Low list before removing minimum = " + low);
            System.out.println("High list = " + high);

            if (!low.isEmpty()) {
                low.removeFirst();
            }

            System.out.println("Updated low list after removing minimum value = " + low);
        }


}