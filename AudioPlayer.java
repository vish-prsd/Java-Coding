import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class AudioPlayer {
  public static void main(String[] args)throws Exception {

    String filePath = "src/TestAudio.wav";
    File file = new File(filePath);

    try(Scanner scanner = new Scanner(System.in);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)
    ){

      System.out.println("Playing the Audio");
      Clip clip = AudioSystem.getClip();
      clip.open(audioStream);

      String response = "";

      while(!response.equals("Q")){
         System.out.println("""
              Enter You Choice:
              P: Play
              S: Stop
              R: Reset
              Q: Quit
             """);

          response = scanner.next().toUpperCase();
          
          switch (response) {
            case "P" -> clip.start();
            case "S" -> clip.stop();
            case "R" -> clip.setMicrosecondPosition(0);
            case "Q" -> clip.close();
            default -> System.out.println("Invalid Choice");
          }
      }


    }catch(FileNotFoundException e){
      System.out.println("File not found");
    }
    catch(UnsupportedAudioFileException e){
      System.out.println("The file type not supported");
    }


    
  }
}
