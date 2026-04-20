package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        String filename = "test.txt";
        byte[] inputBytes = {0};

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
            long start = System.currentTimeMillis();

            StringBuilder outputStringBuilder = new StringBuilder();
            for (byte b : inputBytes) {
                outputStringBuilder.append((char)b);
            }

            String outputString = outputStringBuilder.toString();
            System.out.println(System.currentTimeMillis() - start);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}