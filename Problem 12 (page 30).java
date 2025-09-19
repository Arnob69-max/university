import java.util.*;

public class Home1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B1 = sc.nextInt();
        int B2 = sc.nextInt();
        int B3 = sc.nextInt();
        sc.close();

        int empty = 0;
        if (B1 == 0) empty++;
        if (B2 == 0) empty++;
        if (B3 == 0) empty++;

        if (empty >= 2) {
            System.out.println("Water filling time");
        } else {
            System.out.println("Not now");
        }
    }
}
