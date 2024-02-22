//Using the byte array we can reverse a string using getByte mathode

import java.util.Scanner;

public class ReverseString1 {
    public static void main(String []args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the String :");
            String str = sc.nextLine();

            byte []bym = str.getBytes();
            byte []bym1 = new byte[bym.length];

            for(int i = 0 ; i < bym.length ; i++) {
                bym1[i] = bym[bym.length-i-1] ;
            }

            System.out.println(new String(bym1));//Once time use
        }
    }
}
