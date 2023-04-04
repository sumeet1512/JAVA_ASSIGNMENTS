import java.util.*;

public class Main {
    public static void main(String[] args )throws NullPointerException{


        Scanner sc = new Scanner(System.in);
        int i=1;

        UserInput userinput =new UserInput();


        Object[] details = new Object[3]; // because details can have all strings , numbers various types hence object type is kept as object
        ArrayList <Student> students =new  ArrayList<Student>();
        do{
            System.out.println("Enter the operation you choose to perform :\n1.Create\n2.Display\n3.Add Student\n4.Search by PRN\n5.Update\n6.Delete ");
            int k=Integer.parseInt(sc.nextLine());
            switch(k){
                case 1:
                    students=userinput.createStudentList();
                    break;
                case 2:
                    userinput.display(students);

                    break;
                case 3:
                    Student e= userinput.createStudent();
                    students.add(e);
                    break;
                case 4:
                    userinput.searchStudent(students);
                    break;
                case 5:
                    userinput.updateStudent(students);
                    break;
                case 6:
                    System.out.println("Enter the Index no of student you want to delete ");
                    int index=Integer.parseInt(sc.nextLine());
                    students.remove(index);
                    userinput.display(students);
                    break;
            }
            System.out.println("Press 1 to continue ");
            k=Integer.parseInt(sc.nextLine());

        }while(i==1);


    }
}
