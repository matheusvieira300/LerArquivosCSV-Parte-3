import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {

        
        String  path = "c:\\temp\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {//try with resources, não é necessário dar um .close() pois será fechado sozinho

            String line = br.readLine();//para ler de linha em linha
            while (line != null) {//enquanto a linha não estiver nula
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());    
        }
    }
}
