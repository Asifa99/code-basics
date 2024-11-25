// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the size of the array: ");
//         int size = scanner.nextInt();
//         if (size <= 0) {
//             System.out.println("Error: Invalid array size.");
//             return;
//         }

//         int[] numbers = new int[size];
//         System.out.println("Enter the elements of the array:");
//         boolean allNegative = true;

//         for (int i = 0; i < size; i++) {
//             numbers[i] = scanner.nextInt();
//             if (numbers[i] >= 0) {
//                 allNegative = false;  // If any number is non-negative, set flag to false
//             }
//         }

//         if (allNegative) {
//             System.out.println("All numbers in the array are negative.");
//         } else {
    
//             int sum = 0;
//             for (int num : numbers) {
//                 if (num % 2 == 0) sum += num;
//             }

//             if (sum == 0) {
//                 System.out.println("Error: No even numbers in the array.");
//             } else {
//                 System.out.println("Sum of even numbers: " + sum);
//             }
//         }

//         scanner.close(); 
//     }
// }
