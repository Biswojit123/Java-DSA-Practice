import java.util.Scanner;

public class SquareOfNumber {
    //Called function
    public static int findPower(int base, int power) {
        int result = 0;int finalResult = 0;
        //Base condition
        if(power == 1) {
            return base;
        }else {
            //Every time will divided untill satisfide the base condition
            result = findPower(base, power/2);
            finalResult = result * result;

            if(power % 2 == 0) {
                return finalResult;
            }
            else {
                //If it odd then it add the base
                return base * finalResult;
            }
        }
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        //Here we take the two input 
        System.out.println("Enter the number:");
        int base = sc.nextInt();

        System.out.println("Enter the power:");
        int power = sc.nextInt();
        //here we call function
        int result = findPower(base,power);

        System.out.println("Power is::"+result);
    }

}
