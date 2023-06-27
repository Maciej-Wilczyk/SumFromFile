
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumFromFile {
    public static void main(String[] args) {
        String fileName = "src/main/resources/test.txt";
        int sum = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                int number = Integer.parseInt(line.trim());
                sum += number;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Suma liczb z pliku " + fileName + " wynosi: " + sum);
    }
}
