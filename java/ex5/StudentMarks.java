import java.io.*;

public class StudentMarks {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));

        try {
            System.out.print("Enter student name: ");
            String name = br.readLine();

            int total = 0;

            for (int i = 1; i <= 3; i++) {
                System.out.print("Enter mark " + i + ": ");
                int mark = Integer.parseInt(br.readLine());

                if (mark < 0 || mark > 100) {
                    throw new IllegalArgumentException(
                        "Marks must be between 0 and 100");
                }

                total += mark;
            }

            double average = total / 3.0;

            System.out.println("\nStudent Name: " + name);
            System.out.println("Total Marks: " + total);
            System.out.println("Average: " + average);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Result Processing Completed");
        }
    }
}