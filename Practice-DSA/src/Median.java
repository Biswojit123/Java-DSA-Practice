//Q:Find the median of two arrays(it,s may be sorted or un sorted).
//This is the worst case scenario.
//Time complexity is :O(n*log(n))
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Median {
    public static double medianFind(int arr1[] , int arr2[]) {
        int median;

        int arr[] = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, arr, 0, arr1.length);
        System.arraycopy(arr2, 0, arr, arr1.length, arr2.length);
        Arrays.sort(arr);
        int size = arr.length;

        if( size % 2 == 0) {
            median = (arr[size/2] + arr[size/2 - 1] ) / 2 ;
            return median;
        }else {
            median = arr[size/2];
            return median;
        }
    }
    public static void main(String []args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            
            //Here the take size of two array
            System.out.println("Enter the size of first array :");
            int size1 = Integer.parseInt(br.readLine());

            System.out.println("Enter the size of seconde array :");
            int size2 = Integer.parseInt(br.readLine());

            int arr1[] = new int[size1];
            int arr2[] = new int[size2];

            System.out.println("Enter the element of array1 :");
            for(int i = 0 ; i < size1 ; i++) {
                arr1[i] = Integer.parseInt(br.readLine());
            }

            System.out.println("Enter the element of array2 :");
            for(int i = 0 ; i < size2 ; i++) {
                arr2[i] = Integer.parseInt(br.readLine());
            }

            double median = medianFind(arr1,arr2);

            System.out.println("Median of given arrays is :"+median);


        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
