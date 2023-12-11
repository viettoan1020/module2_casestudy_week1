
import java.util.Scanner;

public class CaseStudyy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user, password;
        int attempt = 0;

        // Bai 1: User login
        do {
            System.out.print("Enter user: ");
            user = scanner.nextLine();
            System.out.print("Enter password: ");
            password = scanner.nextLine();
            attempt++;
            if (user.equals("admin") && password.equals("123456")) {
                displayMenu(scanner);
                break;
            } else if (attempt < 3) {
                System.out.println("Incorrect user or password, try again.");
            } else {
                System.out.println("Program locked.");
            }
        } while (attempt < 3);

        scanner.close();
    }

    // Bai 2: Display menu and draw
    public static void displayMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Draw a rectangle");
            System.out.println("2. Draw a right-angled triangle");
            System.out.println("3. Draw an isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    drawRectangle(scanner);
                    break;
                case 2:
                    drawRightAngledTriangle(scanner);
                    break;
                case 3:
                    drawIsoscelesTriangle(scanner);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, 3 or 0.");
            }
        } while (choice != 0);
    }

    public static void drawRectangle(Scanner scanner) {
        System.out.print("Enter the width: ");
        int width = scanner.nextInt();
        System.out.print("Enter the height: ");
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawRightAngledTriangle(Scanner scanner) {
        System.out.print("Enter the length of the right-angled side: ");
        int side = scanner.nextInt();

        for (int i = 0; i < side; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawIsoscelesTriangle(Scanner scanner) {
        System.out.print("Enter the height: ");
        int height = scanner.nextInt();
        System.out.print("Enter the base length: ");
        int base = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < base / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
