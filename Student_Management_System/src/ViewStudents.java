import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ViewStudents{
    public static void showStudents(){
        try{
            File file = new File("../data/student.txt");

            if(!file.exists()){
                System.out.println("NO DATA FOUND...");
                return;
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("\n------STUDENT LIST------");
            while((line = br.readLine()) != null){
                String[] data = line.split(",");
                System.out.println("NAME : " + data[0].trim() + 
                                    "\nEMAIL : " + data[1].trim() + 
                                    "\nCOURSE : " + data[2].trim() + 
                                    "\nPHONE : " + data[3].trim() + 
                                    "\n------------------------");
            
            }
            br.close();
        }catch(Exception e){
                e.printStackTrace();
            }
    }
}
