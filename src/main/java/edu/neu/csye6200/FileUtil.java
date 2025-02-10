package edu.neu.csye6200;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    // This method will read the file using a fixed relative path
    public static List<String> readFile(String filename) {
        List<String> lines = new ArrayList<>();
        
        String filePath = "src/main/resources/" + filename;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + filename);
            System.err.println("File path: " + filePath); // Display the path to debug
            e.printStackTrace();
        }
        return lines;
    }

    // This method writes to a file using a relative path
    public static void writeFile(String filename, List<String> lines) {
        String filePath = "src/main/resources/" + filename;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing file: " + filename);
            System.err.println("File path: " + filePath); // Display the path to debug
            e.printStackTrace();
        }
    }

    // Optional: You can implement a more dynamic solution that uses the current working directory
    public static List<String> readFileDynamic(String filename) {
        List<String> lines = new ArrayList<>();
        String baseDir = System.getProperty("user.dir"); // Get the current working directory
        String filePath = baseDir + "/" + filename;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + filename);
            System.err.println("File path: " + filePath); // Display the path to debug
            e.printStackTrace();
        }
        return lines;
    }

    public static void writeFileDynamic(String filename, List<String> lines) {
        String baseDir = System.getProperty("user.dir"); // Get the current working directory
        String filePath = baseDir + "/" + filename;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing file: " + filename);
            System.err.println("File path: " + filePath); // Display the path to debug
            e.printStackTrace();
        }
    }
}
