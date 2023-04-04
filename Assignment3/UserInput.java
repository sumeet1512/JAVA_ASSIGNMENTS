import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;

public class UserInput {
    Scanner scan = new Scanner(System.in);
    String name;
    String dob;
    int prn;
    Object[] array = new Object[3];

    public Object[] inputStudent(){
        System.out.println("Enter Name of the Student");
        name=scan.nextLine();

        System.out.println("Enter  PRN of the Student ");
        prn=Integer.parseInt(scan.nextLine());

        System.out.println("Enter DOB of the student ");
        dob=scan.nextLine();

        array[0]=name;
        array[1]=prn;
        array[2]=dob;
        return array;
    }
    public Student createStudent()
    {
        Object[] details= this.inputStudent();
        Student e =new Student();
        e.setName((String)details[0]);
        e.setPrn((Integer)details[1]);
        e.setDob((String) details[2]);
        return e ;


    }
    public ArrayList <Student> createStudentList(){
        Object[] details = new Object[3];
        System.out.println("Enter Number of Records to Enter ");
        int n=Integer.parseInt(scan.nextLine());

        ArrayList<Student> students= new ArrayList <Student>(); // creating an array of object type student

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter details for student index "+i+"\n");
            details=this.inputStudent();
            students.add(new Student());
            students.get(i).setName((String)details[0]);
            students.get(i).setPrn((Integer)details[1]);
            students.get(i).setDob((String) details[2]);


        }

        return students;



    }


    public void display(ArrayList<Student> stu)
    {
        System.out.println("The list of students is \n ");
        for (Student s:stu){
            System.out.println(stu.indexOf(s)+" The Name of the student is "+s.getName()+"\n The PRN of the student is "+s.getPrn()+"\n The DOB of the student is  "+s.getDob());

        }


    }
    public Student searchStudent(ArrayList<Student> stu){
        System.out.println("Enter the PRN if the student you want to search   ");
        int PRN=Integer.parseInt(scan.nextLine());
        for (Student s:stu){
            int prns=s.getPrn();
            if (PRN==prns){
                System.out.println("The index of the student is "+stu.indexOf(s));
                System.out.println("The Name of the student is "+s.getName()+"\n The PRN of the student is "+s.getPrn()+"\n The DOB of the student is  "+s.getDob());
                return s;


            }





        }
        return null;

    }
    public  void updateStudent(ArrayList<Student> stu){
        System.out.println("Enter the index no of the student you want to update \n");
        int j=Integer.parseInt(scan.nextLine());
        System.out.println("Enter the new Name of the student ");
        stu.get(j).setName(scan.nextLine());
        System.out.println("Enter new PRN of the student ");
        stu.get(j).setPrn(Integer.parseInt(scan.nextLine()));
        System.out.println("Enter new DOB of the student ");
        stu.get(j).setDob(scan.nextLine());
        System.out.println(j+" The new  Name of the student is "+stu.get(j).getName()+"\n The new PRN of the student is "+stu.get(j).getPrn()+"\n The new DOB of the student is  "+stu.get(j).getDob());


    }


}
