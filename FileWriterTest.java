import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
public class FileWriterTest {
  public static void main(String[] args)throws Exception {
    String filePath = "/Users/Vishnu/Desktop/JavaFileWriter/test.txt";
    String fileContent =  """
                            Roses are red,
                            Violets are blue,
                            Snap a picture,
                            BOOTY BOOTY BHOOO!
                          """;
        


    try(FileWriter writer = new FileWriter(filePath)) { 
      writer.write(fileContent);
      System.out.println("The file has been created.");
    } 
    catch (FileNotFoundException e){
      System.out.println("Sorry, the file location was not found!");
    }
    catch (IOException e) {
      System.out.println("Couldn't Write file!");
    }
 

  }
}
