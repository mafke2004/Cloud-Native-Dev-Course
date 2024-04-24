import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFile {
    public static String[] readFile(String filePath) {
        List<String> dataList = new ArrayList<>();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("/Users/C71340I/IdeaProjects/Java 4/src/measurements.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                dataList.add(line); // Add the line to the list
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        // Convert the list to an array
        String[] dataArray = new String[dataList.size()];
        dataArray = dataList.toArray(dataArray);
        return dataArray; // Return the array containing the file data
    }
}