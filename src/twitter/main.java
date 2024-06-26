package twitter;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChoose an option:");
            System.out.println("For rectangle press 1");
            System.out.println("for triangle press 2");
            System.out.println("for exit press 3   ");
            choice = scanner.nextInt();

            if (choice == 1 || choice == 2) {
                int height = 0;
                int width = 0;

                System.out.print("Enter the height: ");
                height = (int) scanner.nextInt();
                System.out.print("Enter the width: ");
                width = (int) scanner.nextInt();

                if (choice == 1) {
                    Rectangle rectangle = new Rectangle(height, width);
                    rectangle.calculationOfPerimeterOrArea();
                } else {
                    Triangle triangle = new Triangle(height, width);
                    System.out.println("Options for triangle: ");
                    System.out.println("For calculate perimeter press 1 ");
                    System.out.println("For print triangle press 2   ");
                    int tChoice = scanner.nextInt();
                    if (tChoice == 1) {
                        triangle.calculationOfPerimeter();
                    } else if (tChoice == 2) {
                        triangle.printTriangle();
                        
                    } else {
                        System.out.println("Invalid choice!!");
                    }
                }
            }
        } while (choice == 1 || choice == 2);

        scanner.close();
    }
	}
