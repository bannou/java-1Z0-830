void main() {

    byte a = (byte) 128;
    System.out.println(a); // -128

    byte maxByte = 127;
    maxByte ++;
    System.out.println(maxByte); // -128

    byte minByte = (byte) -129;
    minByte --;
    System.out.println(minByte); // 126 (mod capacity)

}