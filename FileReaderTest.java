import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileReaderTest {

  public static void main(String[] args)throws Exception {
    String filePath = "/Users/Vishnu/Desktop/JavaFileWriter/test.txt";
    
    try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
      System.out.println("your file exists");
      String file;
      while ((file = reader.readLine()) != null) {
        System.out.println(file);
      }
    }catch(FileNotFoundException e){
      System.out.println("Sorry, The file location was not Found!");
    }catch(IOException e){
      System.out.println("Unable to read file!");
    }
}
}