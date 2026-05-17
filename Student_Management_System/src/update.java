import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class update {
    public static void updatestudent(String name){
        try{
            File inputfile = new File("../data/student.txt");
            File tempfile = new File("../data/temp.txt");

            BufferedReader br = new BufferedReader(new FileReader(inputfile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempfile));

            Scanner sc = new Scanner(System.in);
            String line;
            Boolean found = false;

            while((line = br.readLine()) != null){
                String [] data = line.split(",");

                if(data[0].equalsIgnoreCase(name)){

                    System.out.println("Enter new mailid : ");
                    String email = sc.nextLine();

                    System.out.println("Enter new branch : ");
                    String branch = sc.nextLine();

                    System.out.println("Enter new mobile number : ");
                    String phone = sc.nextLine();

                    bw.write(name + "," + email + "," + branch + "," + phone);
                    bw.newLine();

                    found = true;

                }
                else{
                    bw.write(line);
                    bw.newLine();
                }
            }
            br.close();
            bw.close();

            inputfile.delete();
            tempfile.renameTo(inputfile);

            if(found){
                System.out.println("STUDENT UPDATED...!!");
            }else{
                System.out.println("STUDENT NOT FOUND....");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
