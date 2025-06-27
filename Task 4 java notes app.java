import java.io.*;
import java.util.Scanner;
public class Main {
    static final String FILE_NAME = "notes.txt";
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n=== Notes App ===");
            System.out.println("1. Add Note");
            System.out.println("2. View Notes");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline
            switch (choice) {
                case 1: addNote(); break;
                case 2: viewNotes(); break;
                case 3: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid choice.");
            }

        } while (choice != 3);
    }
    public static void addNote() {
        System.out.print("Enter your note: ");
        String note = sc.nextLine();
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) { // true = append mode
            writer.write(note + "\n");
            System.out.println("Note saved.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
    public static void viewNotes() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            System.out.println("\n--- All Notes ---");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("- " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No notes found. Start adding some!");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}