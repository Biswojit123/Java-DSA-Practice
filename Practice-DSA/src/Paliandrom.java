import java.io.*;

public class Paliandrom {
    public static boolean palindromChecking(int arr[]) {
        boolean blu = true;
        for(int i = 0 ; i < arr.length ; i ++) {
            if( arr[i] == arr[ arr.length - 1 -i ] )  {
                continue;
            } else {
                blu = false;
                return blu;
            }
        }
        return blu;
    }
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the size of array :");
            int size = Integer.parseInt(br.readLine());
            int arr[] = new int[size];

            System.out.println("Enter the element of array :");
            for(int i = 0 ; i < size ; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }

            //Now we check the element of array is palindrom are not
            boolean bul = palindromChecking(arr);

            if(bul == true) {
                System.out.print("Given array is palindrom!");
            }else {
                System.out.println("Given array is not palindrom!");
            }
        }catch(Exception e) {
            e.printStackTrace();
        }

    }
}