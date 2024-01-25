import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the rate for structure mastery: ");
            int structure = scanner.nextInt();
            System.out.print("Enter the rate for language mastery: ");
            int language = scanner.nextInt();

            int tr = structure + language;

            if (tr >= 50 && language >= 100) {
                System.out.println("Code Mythic");
            } else if (tr >= 50 && language >= 50) {
                System.out.println("Code Legend");
            } else if (tr >= 50 && language >= 25) {
                System.out.println("Code Master");
            } 
        }
    }
}