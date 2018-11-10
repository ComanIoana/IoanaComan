/*
 * Program opens 3 instances of Notepad in different ways
 */
package multithreading;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AJC
 */
public class NotepadInstances {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        try {
            ProcessBuilder pb1, pb2, pb3;
            //Open notepad text editor
            pb1 = new ProcessBuilder("Notepad.exe");
            //Open an existing notepad file
            pb2 = new ProcessBuilder("Notepad.exe","C:\\Users\\ajcpa\\Desktop\\Instance2.txt");
            //Launch NotepadInstance application and open created file
            pb3 = new ProcessBuilder(
                "java",
                "-classpath",
                "E:IT\\Java\\IoanaComan\\Java9ComanIoana\\build\\classes",
                "multithreading.NotepadInstance",
                "3", "Notepad", "User", "Admin");
            Map<String, String> env = pb3.environment();
            env.put("INSTANCE_NO", "3");
            pb3.directory(new File("E:\\IT\\Java\\IoanaComan\\Java9ComanIoana\\build\\classes\\multithreading"));
            //Start processes
            pb1.start();
            pb2.start();
            pb3.start();
        }catch (IOException e){
            Logger.getLogger(NotepadInstances.class.getName()).log(Level.SEVERE, "An IO exception is here!", e);
        }
    }
    
}
