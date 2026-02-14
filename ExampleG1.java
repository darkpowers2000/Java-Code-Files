public class ExampleG1
{
    // generic method printArray
    public static <E> void printArray(E[] inputArray)
    {
        // Display array elements
        for (E element : inputArray) 
        {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        // Create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 2.11, 2.23, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'O' };

        // pass an Integer array
        System.out.println("Array integerArray contains:");
        printArray(intArray);

        // pass a Double array
        System.out.println("Array doubleArray contains:");
        printArray(doubleArray);

        // pass a Character array
        System.out.println("Array characterArray contains:");
        printArray(charArray);
    }
}
