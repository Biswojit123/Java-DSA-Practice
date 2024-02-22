//Reverse Array using Collections class
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArray1 {
    public static void ReverseArray(Integer arr[]) {
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.asList(arr));
    }
    public static void main(String []args) {
        try(Scanner sc= new Scanner(System.in)) {
            System.out.println("Enter the size of array :");
            int size = sc.nextInt();
            System.out.println("Enter the element of array :");
            Integer arr[] = new Integer[size];
            for(int i = 0 ; i < size ; i++) {
                arr[i] = sc.nextInt();
            }

            ReverseArray(arr);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
