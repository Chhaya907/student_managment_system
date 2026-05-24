import java.io.BufferedReader;
import java.io.FileReader;
public class findstudent{
    public static void searchbyname(String searchname){
        try{
            BufferedReader br = new BufferedReader(new FileReader("../data/student.txt"));
            String line;
            boolean found = false;

            while((line = br.readLine()) != null){
                String [] data = line.split(",");
            if(data[0].equalsIgnoreCase((searchname))){
                System.out.println("Found :  " + line);
                found = true;
            }
                
            }
            if(!found){
                System.out.println("NOT FOUND...!!");
            }
            br.close();

        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
