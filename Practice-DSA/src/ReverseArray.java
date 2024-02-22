//Using swap technique
import java.io.*;
import java.util.Arrays;

public class ReverseArray {
    public static int[] findReverse(int arr[] ) {

        for(int i = 0 ; i < arr.length / 2 ; i++) {
            int temp = arr[i] ;
            arr[i] = arr[arr.length-i-1] ;
            arr[arr.length-i-1] = temp ;
        }
        return arr;
    }
    public static void main(String []rags) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            //Enter the Size of array
            System.out.println("Enter the size of array:");
            int size = Integer.parseInt(br.readLine());

            int arr[] = new int[size] ;
            System.out.println("Enter the Element of array :");
            for(int i = 0 ; i < size ; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }

            arr = findReverse(arr);
            System.out.println("Reverse array is :");
            System.out.println(Arrays.toString(arr));
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
