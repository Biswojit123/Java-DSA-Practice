//Q:Find the median of two arrays(it,s may be sorted or un sorted).
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Median {
    public static double medianFind(int arr1[] , int arr2[]) {
        int lenArr1 = arr1.length;
        int lenArr2 = arr2.length;
        int lenArr3 = lenArr1 + lenArr2 ;
        double median = 0.0;

        int arr3[] = new int[lenArr3] ;
        System.arraycopy(arr1, 0, arr3, 0, lenArr1);
        System.arraycopy(arr2, 0, arr3, lenArr1, lenArr2);

        Arrays.sort(arr3);

        if(lenArr3 % 2 == 0) {
            int value1 = lenArr3 / 2 ;
            int value2 = (lenArr3 / 2) + 1 ;
            return median = (arr3[value1] + arr3[value2]) / 2 ;
        }else {
            return median = (lenArr3 + 1) / 2 ;
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
