import java.util.*;
public class Main {
    public static void main(String[] args) throws NOMATCHEXCP{
        Scanner sc= new Scanner(System.in);
        try{
            System.out.println("Enter a string ");
            String  input=sc.nextLine();
            if (input.equals("India")){
                System.out.println("Input matches India");


            }
            else{
                throw new NOMATCHEXCP(input+" is not equal to India");
            }


        }
        catch(NOMATCHEXCP e) {
            System.out.println(e);
            e.printStackTrace();

        }

    }
}

