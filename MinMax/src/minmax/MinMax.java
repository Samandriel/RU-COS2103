package minmax;

import java.util.Arrays;
import java.util.Scanner;

/* @author harris
 */
public class MinMax {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            int count = i + 1;
            System.out.print("Enter value" + count + ": ");
            array[i] = in.nextInt();
        }
        
        int min = array[0];
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        
        System.out.println(Arrays.toString(array));
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        // sort
//        boolean shifted = true;
//        int n = 0;
//        while (shifted) {
//            shifted = false;
//            n++;
//            for (int i = 0; i < array.length - n; i++) {
//                if (array[i] > array[i + 1]) {
//                    int temp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = temp;
//                    shifted = true;
//                }
//            }
//        }
    }

}
