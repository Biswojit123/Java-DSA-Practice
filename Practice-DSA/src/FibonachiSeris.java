import java.util.Scanner;

public class FibonachiSeris {

    //function call 
    public static int findTheFibonacci(int num) {
        int result = 0;
        if(num == 0 || num == 1) {
            return num;
        }else {
            result = findTheFibonacci(num-1) + findTheFibonacci(num-2);
        }
        return result;
    } 
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        //take the input
        System.out.println("Enter the nth number !:");
        int num = sc.nextInt();

        //Here function call
        int result = findTheFibonacci(num);

        System.out.println("Fiboncci number of nth position is :"+result);
    }
}
