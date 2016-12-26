package decimaltobinary;

import java.util.Scanner;

/* @author harris
 */
public class DecimalToBinary {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        String binary = "";

        System.out.print("Enter a number: ");
        num = in.nextInt();

        if (num <= 1) {
            binary = String.valueOf(num);
        } else {
            while (num > 0) {
                int rem = (num % 2);
                num /= 2;
                String binaryDigit = Integer.toString(rem);
                binary = binaryDigit + binary;
            }
        }
        System.out.println("Binary: " + binary);
    }

}
