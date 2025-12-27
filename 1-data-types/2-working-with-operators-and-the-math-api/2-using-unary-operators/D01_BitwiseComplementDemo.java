public class D01_BitwiseComplementDemo {
    public static void main(String[] args) {
        int positiveNumber = 8;
        int negativeNumber = -8;

        // Applying bitwise complement (~) on a positive number
        int complementPositive = ~positiveNumber;                                   // -9
        System.out.println("Bitwise complement of " + positiveNumber + " (~" + positiveNumber + ") is " + complementPositive);
        System.out.println("According to the formula: -(n + 1) = -(" + positiveNumber + " + 1) = " + (-(positiveNumber + 1)));

        System.out.println(); // Adding space for readability

        // Applying bitwise complement (~) on a negative number
        int complementNegative = ~negativeNumber;                                   // 7
        System.out.println("Bitwise complement of " + negativeNumber + " (~" + negativeNumber + ") is " + complementNegative);
        System.out.println("According to the formula: |n| - 1 = " + Math.abs(negativeNumber) + " - 1 = " + (Math.abs(negativeNumber) - 1));
    }
}
