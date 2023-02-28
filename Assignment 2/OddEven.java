import java.io.*;
import java.util.Scanner;
public class OddEven {
    Scanner sc=new Scanner(System.in);
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));



    public void oddeven () throws IOException
    {

        int [] odd = new int[10];
        int [] even=new int[10];
        int evencount=0;
        int oddcount=0;
        System.out.println("Enter the number of elements you want to enter ");
        int n=sc.nextInt();
        String str= br.readLine();
        String[] array_numbers = str.trim().split("\\s+");


        for(int i=0;i<n;i++)
        {
            int m = Integer.parseInt(array_numbers[i]);
            if (m%2==0){
                even[evencount]=m;
                evencount++;
            } else{
                odd[oddcount]=m;
                oddcount++;
            }
        }
        System.out.println("The odd elements are: ");

        for (int j=0;j<oddcount;j++)
        {
            System.out.print(" "+odd[j]);

        }

        System.out.println("\nThe even elements are: ");
        for (int k=0;k<evencount;k++)
        {
            System.out.print(" "+even[k]);
        }


    }
    public static void main(String args[]){
        OddEven od=new OddEven();
        try{
            od.oddeven();
        } catch (IOException e){
            System.out.println("The array is empty");
        }
    }
}