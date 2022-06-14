import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class MainClass {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "text.txt";
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        boolean isFileExists = file.exists();

        if(!isFileExists){
            try {
                isFileExists = file.createNewFile();


            }catch (IOException ex){
                System.out.println("File not created");
            }
        }

        if(isFileExists){
            System.out.printf("File "+fileName+" exists");
        }

        int lines = 0;
        while(scanner.hasNextLine()){
            String name = scanner.nextLine();
            System.out.println(name);
            lines ++;

        }

        System.out.println("Rows in file: "+lines);

        scanner.close();

    }
}
