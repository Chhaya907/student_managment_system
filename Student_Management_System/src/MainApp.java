import java.util.*;
public class MainApp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("--------------STUDENT MANAGEMENT SYSTEM-------------");
            System.out.println("1. add student");
            System.out.println("2. view student");
            System.out.println("3. find student");
            System.out.println("4. delete student");
            System.out.println("5. update student");
            System.out.println("6. exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1 :
                    System.out.print("enter name of student : ");
                    String name = sc.nextLine();
                    
                    System.out.print( "enter email of student : ");
                    String email = sc.nextLine();

                    System.out.print("enter course of student : ");
                    String course = sc.nextLine();

                    System.out.print("enter phone number of student : ");
                    String phone = sc.nextLine();

                    Student s = new Student(name , email , course , phone);
                    FileHandler.addStudent(s);
                    break;

                case 2 :
                    ViewStudents.showStudents();
                    break;

                case 3 :
                    System.out.println("enter name to search: ");
                    String search = sc.nextLine();
                    findstudent.searchbyname(search);
                    break;

                case 4 :
                    System.out.println("enter name to delete: ");
                    String del = sc.nextLine();
                    delete.deletestudent(del);
                    break; 
                    
                case 5 :
                    System.out.println("enter name to update: ");
                    String up = sc.nextLine();
                    update.updatestudent(up);
                    break;     
                    
                case 6:
                    System.out.println("exiting....");
                    System.exit(0);
                    
                default:
                    System.out.println("invalid choice...");    
                    


            }

        }
    }

    
}
