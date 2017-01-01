import java.util.Scanner;
/**
 * Created by Harry Johnson on 1/2/2017.
 */
public class fibonacci {

    public static void fib(double tally, double input, double input1, double input2){
        double product = input1+input2;
        if (tally != input){
            tally++;
            fib(tally, input, input2, product);
            tally--;
        }
        if (tally==input) {
            System.out.println(product);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a number n to see the n'th number in the Fibonacci sequence");
        Scanner keyboard = new Scanner(System.in);
        int input = keyboard.nextInt();
        fib(2,input,0,1);
    }
}
