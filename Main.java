import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         System.out.println("AISD SCHOOL FINDER");
        // Input the number from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a School Code: ");
        int num = scanner.nextInt();
        scanner.close();

try {
            // Open the data file
            BufferedReader reader = new BufferedReader(new FileReader("data.dat"));

            // Search for the number in the file
            boolean found = false;
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(String.valueOf(num))) {
                    found = true;
                  int testing = Integer.valueOf(line.substring(0, 3));
                    // Print the line that contains the found number
                  if(testing == num){
                    System.out.println(line.substring(3, line.length()));
                    break;
                  }
                }
            }
            if (!found) {
                System.out.println("Number not found in the file. Note Elementary schools are not yet registered");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}