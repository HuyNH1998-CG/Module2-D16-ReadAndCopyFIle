import java.io.*;
import java.util.Scanner;

public class ReadAndCopy {
    public void readAndCopyText(){
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Input file Path");
            String filePath = input.nextLine();
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            System.out.println("Input new file name");
            String copy = input.nextLine();
            File file1 = new File(copy);
            if(file1.exists()){
                throw new Exception();
            }
            FileWriter wr = new FileWriter(copy,true);
            BufferedWriter bufferedWriter = new BufferedWriter(wr);
            String line;
            System.out.println("Copying");
            while((line = br.readLine()) != null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            System.out.println("Done and Done");
            bufferedWriter.close();
            br.close();
        } catch (Exception e){
            System.err.println("Error");
        }
    }
}
