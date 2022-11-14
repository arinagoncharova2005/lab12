import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.AccessDeniedException;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("/Users/arinagoncharova/IdeaProjects/lab12/src/input");
             FileOutputStream out = new FileOutputStream("/Users/arinagoncharova/IdeaProjects/lab12/src/output")){
            byte [] buffer = new byte[in.available()];
            in.read(buffer, 0, buffer.length);
            out.write(buffer, 0, buffer.length);
        }catch(AccessDeniedException e){
            System.out.println(e.getMessage());
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
            //dfgdgdgdg
        }
    }
}