import java.util.*;

public class Home1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        int lower = Math.max(A, C);
        int upper = B;

        if (lower <= upper) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
