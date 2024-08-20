import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        // FINAL variable for pi
        final double PI = 3.14159;
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Get the radius from the user
        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();
        // Calculate the diameter, area, and circumference
        double diameter = 2 * radius;
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        // Print the results, formatted to three decimal places
        System.out.printf("The Radius of the circle = %.3f%n", radius);
        System.out.printf("The Diameter of the circle = %.3f%n", diameter);
        System.out.printf("The Area of the circle = %.3f%n", area);
        System.out.printf("The Circumference of the circle = %.3f%n", circumference);
    }
}
