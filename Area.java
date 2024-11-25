// import java.util.Scanner;

// abstract class Shape {
//     public abstract double area(); 
// }

// class Rectangle extends Shape {
//     private double width;
//     private double height;

//     public Rectangle(double width, double height) {
//         this.width = width;
//         this.height = height;
//     }

//     @Override
//     public double area() {
//         return width * height;
//     }

//     public void setWidth(double width) {
//         if (isValidDimension(width)) {
//             this.width = width;
//         } else {
//             System.out.println("Error: Width must be between 0 and 10,000.");
//         }
//     }

//     public void setHeight(double height) {
//         if (isValidDimension(height)) {
//             this.height = height;
//         } else {
//             System.out.println("Error: Height must be between 0 and 10,000.");
//         }
//     }

//     private boolean isValidDimension(double dimension) {
//         return dimension > 0 && dimension <= 10000;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         double width = promptForDimension(scanner, "width");
//         double height = promptForDimension(scanner, "height");

//         Rectangle rectangle = new Rectangle(width, height);
//         System.out.println("The area of the rectangle is: " + rectangle.area());

//         scanner.close();
//     }
//     private static double promptForDimension(Scanner scanner, String dimensionName) {
//         System.out.print("Enter the " + dimensionName + " of the rectangle (between 0 and 10,000): ");
//         while (!scanner.hasNextDouble()) {
//             System.out.println("Invalid input. Please enter a number.");
//             scanner.next(); 
//             System.out.print("Enter the " + dimensionName + " of the rectangle: ");
//         }
// }