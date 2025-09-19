import java.util.*;

public class Home1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        sc.close();

        if (X + 3 <= 10) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
