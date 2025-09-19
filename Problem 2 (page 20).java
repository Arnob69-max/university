import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Store and print 5 numbers in an array
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Numbers in array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Find the largest number in an array
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest = " + max);

        // Find the smallest number in an array
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Smallest = " + min);

        // Calculate the average of an array
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double avg = (double) sum / arr.length;
        System.out.println("Average = " + avg);

        // Count even and odd numbers in an array
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even Count = " + even);
        System.out.println("Odd Count = " + odd);

        // Search for an element in an array
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println(key + " found in array.");
        else
            System.out.println(key + " not found in array.");

        // Sort an array (Ascending Order)
        Arrays.sort(arr);
        System.out.println("Sorted array (Ascending):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Check if a string is palindrome
        System.out.print("Enter a string: ");
        sc.nextLine(); // consume leftover newline
        String str = sc.nextLine();
        String rev = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        // Count vowels and consonants in a string
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);

        // Convert a string to uppercase and lowercase
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        sc.close();
    }
}
