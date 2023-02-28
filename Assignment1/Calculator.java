import java.math.*;
public class Calculator {
    double[] result =new double[1]; // 1  is the size of the array which means there are 2 elements 0 and 1
    double[] result_array=new double[7]; // This array is for returning results of array operations
    public double[]  performAdditionoperation(double[] numbers)

    {
        result[0]=numbers[0]+numbers[1];


        return result;  // result is an array form beacuse the addition of array elements in this case the numbers can only be saved in an array
    }
    public double[] performSubtractionoperation(double[] numbers)
    {
        result[0]=numbers[0]-numbers[1];



        return result;
    }
    public double[] performMultiplicationoperation(double [] numbers )
    {
        result[0]=numbers[0]*numbers[1];



        return result;

    }
    public double[] performDivisionoperation(double [] numbers){

        result[0]=numbers[0]/numbers[1];





        return result;
    }
    public double[] performArrayoperation(double []numbers){
        int size=numbers.length;
        result_array[0]=0; // initialized to 0 for addition operations
        result_array[2]=1; // initialized to 1 for multiplication operations
        for (int i=0;i<size;i++)
        { result_array[0]=result_array[0]+numbers[i];
            result_array[2]=result_array[2]*numbers[i];

        };
        result_array[1]=numbers[0]; //initialized to 1st number of input  for subtraction operations
        result_array[3]=numbers[0]; //initialized to 1st number of input  for division operations
        for (int i=1;i<size;i++)
        {
            result_array[1]=result_array[1]-numbers[i];
            result_array[3]=result_array[3]/numbers[i];


        };
        result_array[4]=result_array[0]/size; //sum/size=mean
        double sqdiff=0;
        for (int i=0;i<size;i++)
        {

            sqdiff=sqdiff+((numbers[i]-result_array[4])*(numbers[i]-result_array[4]));// summation of square of differences from mean

        };
        result_array[5]=sqdiff/size; //squareddifference/size=variance
        result_array[6]=Math.sqrt(result_array[5]); //sqrt of variance is S.D.

        return result_array;

    }

}

