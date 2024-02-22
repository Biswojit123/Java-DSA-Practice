import java.util.Scanner;

public class ReverseString {
    public static void main(String []args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a String for Reversing : ");
            String str = sc.nextLine();

            //Here we useing append method for reversing the given string.
            //Append method is the part of the StringBuilder class
            StringBuilder strbil = new StringBuilder();

            strbil.append(str);
            strbil.reverse();

            System.out.println(strbil);
        }
    }
}
