import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> employees = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("employees.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                employees.add(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        System.out.println("Number of unique employees: " + employees.size());

        System.out.println("\nEmployees list:");
        for (String employee : employees) {
            System.out.println(employee);
        }

        String sampleEmployee = "John Smith";
        System.out.println("\nChecking if employee exists (" + sampleEmployee + "):");
        System.out.println(employees.contains(sampleEmployee));
    }
}