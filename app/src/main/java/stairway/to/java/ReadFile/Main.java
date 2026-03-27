package stairway.to.java.ReadFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        
        try (BufferedReader br = new BufferedReader(new FileReader("app/src/main/java/stairway/to/java/ReadFile/archive.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
