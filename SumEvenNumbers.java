public class SumEvenNumbers {

    // Method to calculate the sum of even numbers
    public int sumEvenNumbers(int[] numbers) {
        int sum = 0;
        // Loop through each number in the array
        for (int num : numbers) {
            // Check if the number is even
            if (num % 2 == 0) {
                sum += num; // Add the even number to the sum
            }
        }
        return sum; // Return the sum of even numbers
    }

    // Main method to run the program
    public static void main(String[] args) {
        SumEvenNumbers obj = new SumEvenNumbers();
        int[] nums = {1, 2, 3, 4, 5, 6};
        int result = obj.sumEvenNumbers(nums);
        System.out.println(result);  // Output will be 12 (2 + 4 + 6)
    }
}
