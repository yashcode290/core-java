import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // nextBoolean()
        System.out.print("Enter Boolean value (true/false): ");
        boolean boolValue = scn.nextBoolean();

        // nextByte()
        System.out.print("Enter Byte value: ");
        byte byteValue = scn.nextByte();

        // nextDouble()
        System.out.print("Enter Double value: ");
        double doubleValue = scn.nextDouble();

        // nextFloat()
        System.out.print("Enter Float value: ");
        float floatValue = scn.nextFloat();

        // nextInt()
        System.out.print("Enter Int value: ");
        int intValue = scn.nextInt();

        // nextLong()
        System.out.print("Enter Long value: ");
        long longValue = scn.nextLong();

        // nextShort()
        System.out.print("Enter Short value: ");
        short shortValue = scn.nextShort();

        // next()
        System.out.print("Enter a single word: ");
        String word = scn.next();

        // nextLine()
        scn.nextLine(); // clears buffer
        System.out.print("Enter a full sentence: ");
        String line = scn.nextLine();

        // Output
        System.out.println("\n--- Output ---");
        System.out.println("Boolean: " + boolValue);
        System.out.println("Byte: " + byteValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Int: " + intValue);
        System.out.println("Long: " + longValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Single Word: " + word);
        System.out.println("Full Sentence: " + line);

        scn.close();
    }
}