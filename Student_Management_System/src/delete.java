import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;
public class delete{
    public static void deletestudent(String name){
        try{
        File inputfile = new File("../data/student.txt");
        File tempfile = new File("../data/temp.txt");

        BufferedReader br = new BufferedReader(new FileReader(inputfile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(tempfile));

        String line;
        Boolean found = false;

        while((line = br.readLine()) != null){
            String[] data = line.split(",");

            if(!(data[0].equalsIgnoreCase(name))){
                bw.write(line);
                bw.newLine();

            }else{
                found = true;
            }
        }

        br.close();
        bw.close();

        inputfile.delete();
        tempfile.renameTo(inputfile);

        if(found){
            System.out.println("STUDENT DELETED..!!");
        }else{
            System.out.println("STUDENT NOT FOUND....");
        }
        }
        catch(Exception e){
            e.printStackTrace();

        }    
        
       

    }
    
}
