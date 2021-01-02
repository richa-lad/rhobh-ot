import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class csvReader {
    // class to read lines from a csv file and return lines as variables
    public static void main(String[] args) throws IOException {
        List<List<String>> records = new ArrayList<>();
        BufferedReader csvFile = new BufferedReader(new FileReader("creds.csv"));
        String row;
        while ((row=csvFile.readLine()) != null){
            String[] values = row.split(",");
            records.add(Arrays.asList(values));

        }
    }
}