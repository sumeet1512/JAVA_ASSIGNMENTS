import java.util.Scanner;
import java.io.*;
public class Main {

    static double[] numbers;
    static double[] result;

    public static void main(String[] args) {
        Userinput input = new Userinput();
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Operator for Operaton: ");
        System.out.println("+ for Addition");
        System.out.println("- for Subtraction");
        System.out.println("* for multiplication ");
        System.out.println("/ for division ");
        System.out.println("@ for array operations");

        char operator = scan.next().charAt(0); //to read the input by the user reads character at position 0

        switch (operator) {
            case '+':

                numbers = input.inputTwonumbers();
                result = calculator.performAdditionoperation(numbers);
                System.out.println("Sum is: " + result[0]);
                break;

            case '-':
                numbers = input.inputTwonumbers();
                result = calculator.performSubtractionoperation(numbers);
                System.out.println("Subraction is: " + result[0]);


                break;
            case '*':
                numbers = input.inputTwonumbers();
                result = calculator.performMultiplicationoperation(numbers);
                System.out.println("Product of two numbers  is: " + result[0]);
                break;

            case '/':
                numbers = input.inputTwonumbers();
                result = calculator.performDivisionoperation(numbers);
                System.out.println("Division of the two numbers is: " + result[0]);
                break;

            case'@':
                try{
                    numbers=input.inputMultiplenumbers();
                    result=calculator.performArrayoperation(numbers);
                }catch(IOException e){        // buffer reader used which throws io exception
                    System.out.println("Array is empty");
                }
                System.out.println("Addition of array elements is: "+result[0]);
                System.out.println("Subtraction of array elements is "+result[1]);
                System.out.println("Multiplication of array elements is "+result[2]);
                System.out.println("Division of array elements is "+result[3]);
                System.out.println("Mean of array elements is  "+result[4]);
                System.out.println("Variance of array elements is "+result[5]);
                System.out.println("Standard Deviation of array elements is "+result[6]);




        }

    }
}
