import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainClass {
    public static void main(String[] args)  {
        String fileName = "text.txt";
        FileReader fr = null;
        BufferedReader  br = null;
       try{
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
           int lines = 0;
           String nextLine = null;
           while((nextLine = br.readLine())!= null){
               System.out.println(nextLine);
               lines ++;
           }
           System.out.println("File have "+lines+" lines.");
       }catch (IOException ex){
           ex.printStackTrace();
       }finally {
           try{
               if(br != null){
                   br.close();
               }
           }catch (IOException ex){
               ex.printStackTrace();
           }
       }
    }
}
