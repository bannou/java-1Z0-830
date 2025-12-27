import java.util.Arrays;

public class D01_ArrayIncrementDemo {
    public static void main(String[] args) {
        // Initialize an array
        int[] array = {1, 2, 3, 4, 5};
        int index = 2; // Start index

        System.out.println("Initial Array: " + Arrays.toString(array));
        System.out.println("Starting index: " + index);
        System.out.println("----------------------------------------");

        // More efficient: array[index++] += 10;
        System.out.println("Performing: array[index++] += 10;");
        array[index++] += 10; 
        System.out.println("After operation:");
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("New index value: " + index);
        System.out.println("----------------------------------------");

        // Reset array and index for the next demonstration
        array = new int[]{1, 2, 3, 4, 5}; // Reset array to initial values
        index = 2; // Reset index

        // Less efficient: array[index++] = array[index++] + 10;
        System.out.println("Performing: array[index++] = array[index++] + 10;");
        array[index++] = array[index++] + 10;
        System.out.println("After operation:");
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("New index value: " + index);
        System.out.println("----------------------------------------");
    }
}
