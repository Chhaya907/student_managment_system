import java.io.File;
import java.io.FileWriter;
public class FileHandler {
    public static void addStudent(Student s){
        try{
            File file = new File("../data/student.txt");

            file.getParentFile().mkdirs();
            file.createNewFile();

            FileWriter fw = new FileWriter(file , true);
            fw.write(s.name + "," + s.email + "," + s.course + "," + s.phone + "\n");
            fw.close();

            System.out.println("STUDENT SAVED...!!");
        }catch(Exception e){
            e.printStackTrace();
        }


    }
    
}
