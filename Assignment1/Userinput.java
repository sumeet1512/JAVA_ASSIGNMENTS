import java.util.Scanner;
import java.io.*;

public class Userinput
{
    Scanner scan = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double[] numbers = new double[2];


    public double[] inputTwonumbers()
    {
        System.out.println("Enter First Number:");
        numbers[0] = scan.nextDouble();

        System.out.println("Enter Second Number:");
        numbers[1] = scan.nextDouble();

        return numbers;

    }

    public double[] inputMultiplenumbers() throws IOException
    { // this uses buffer reader which throws io exception
        System.out.println("Enter Size of Array");
        int size = scan.nextInt();

        double array[] = new double[size];
        String str = br.readLine();
        String[] array_numbers = str.trim().split("\\s+");
        for(int i=0;i<size;i++)
        {
            array[i] = Double.parseDouble(array_numbers[i]);
        }
        return array;
    }
}

