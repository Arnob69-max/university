import java.util.*;

public class Home {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner sc = new Scanner(System.in);

        // 2. Take user's name and greet them
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);

        // 3. Check if a number is even or odd
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        // 4. Find maximum of 3 numbers
        System.out.println("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Largest number is: " + max);

        // 5. Simple calculator
        int m = sc.nextInt();
        char op = sc.next().charAt(0);
        int n = sc.nextInt();

        switch (op) {
            case '+':
                System.out.println("sum = " + (m + n));
                break;
            case '-':
                System.out.println("sub = " + (m - n));
                break;
            case '*':
                System.out.println("multiple = " + (m * n));
                break;
            case '/':
                System.out.println("divide = " + (m / n));
                break;
        }

        // 6. Print numbers from 1 to N
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 7. Print multiplication table of a number
        System.out.print("Table for number: ");
        int T = sc.nextInt();
        for (int j = 1; j <= 10; j++) {
            System.out.println(T + " x " + j + " = " + (T * j));
        }

        // 8 & 9. Factorial and Sum from 1 to num
        System.out.print("Factorial and sum up to number: ");
        int num = sc.nextInt();
        int fact = 1, sum = 0;
        for (int i = 1; i <= num; i++) {
            fact *= i;
            sum += i;
        }
        System.out.println("Factorial = " + fact);
        System.out.println("Sum = " + sum);

        sc.close();
    }
}
