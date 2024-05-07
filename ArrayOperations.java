
import java.util.*;

class ArrayOperations {
    int[] userArray;
    int size;

    public ArrayOperations(int[] userArray) {
        this.userArray = userArray;
        this.size = userArray.length;
    }

    void displayArray() {
        System.out.print("Array: [");
        for (int i = 0; i < size; i++) {
            System.out.print(userArray[i]);
            if (i != size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    int findSum() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += userArray[i];
        }
        return sum;
    }

    float findAverage() {
        float sum = findSum();
        return sum / size;
    }

    int findMaximum() {
        int max = userArray[0];
        for (int i = 1; i < size; i++) {
            if (userArray[i] > max) {
                max = userArray[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] userArray = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            userArray[i] = scanner.nextInt();
        }

        ArrayOperations arrayOps = new ArrayOperations(userArray);
        arrayOps.displayArray();

        System.out.println("Choose an operation:");
        System.out.println("1. Find Sum");
        System.out.println("2. Find Average");
        System.out.println("3. Find Maximum");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Sum of the array: " + arrayOps.findSum());
                break;
            case 2:
                System.out.println("Average of the array: " + arrayOps.findAverage());
                break;
            case 3:
                System.out.println("Maximum element in the array: " + arrayOps.findMaximum());
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }

        scanner.close();
    }
}


// This code should now compile and execute correctly, allowing the user to choose between finding the sum, average, or maximum element of the input array.