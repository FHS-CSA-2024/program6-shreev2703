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
        //
        radius=((int)(radius*1000+0.5));
        radius=(radius/1000);
        diameter=((int)(diameter*1000+0.5));
        diameter=(diameter/1000);
        circumference=((int)(diameter*1000+0.5));
        circumference=(circumference/1000);
        area=((int)(area*1000+0.5));
        area=(area/1000);
        // Print the results, formatted to three decimal places
        System.out.println("The Radius of the circle"+" "+radius);
        System.out.println("The Diameter of the circle"+" "+diameter);
        System.out.println("The Area of the circle"+" "+area);
        System.out.println("The Circumference of the circle"+" "+circumference);
    }
}
