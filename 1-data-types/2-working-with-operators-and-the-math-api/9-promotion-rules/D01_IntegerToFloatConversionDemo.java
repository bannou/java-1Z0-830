public class D01_IntegerToFloatConversionDemo {
    public static void main(String[] args) {
        int i = 123456789;
        float f = i;
        
        System.out.println("Original integer value: " + i);
        System.out.println("After conversion to float: " + f);
        System.out.println("Difference from original: " + (f - i));
        
        // Binary representation
        String intBinary = String.format("%32s", Integer.toBinaryString(i)).replace(' ', '0');
        String floatBinary = String.format("%32s", Integer.toBinaryString(Float.floatToRawIntBits(f))).replace(' ', '0');
        
        System.out.println("\nBinary representation:");
        System.out.println("Integer (32 bits): " + intBinary);
        System.out.println("Float   (32 bits): " + floatBinary);
        System.out.println("| Sign | Exponent  | Mantissa                  |");
        System.out.println("  " + floatBinary.substring(0,1) + "      " + 
                          floatBinary.substring(1,9) + "    " + 
                          floatBinary.substring(9));
        
        // Convert back to int to see the actual value stored
        int backToInt = (int)f;
        System.out.println("\nFloat converted back to int: " + backToInt);
        System.out.println("Total precision loss: " + (i - backToInt));
    }
}
