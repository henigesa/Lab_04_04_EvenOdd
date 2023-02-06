//import scanner
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//A program that says whether number is even or odd
        //declare variables
        int inputNumber ;
        //prompt user to enter the number
        System.out.println("Please enter an integer:");
        //take the user input
        inputNumber = input.nextInt() ;
        //do math
        int evenSteven = inputNumber % 2 ;
        //if then
        if (evenSteven == 0) {
            System.out.println("Your integer is even steven!");
        }
        else {
            System.out.println("Your integer is odd Todd!");
        }
    }
}