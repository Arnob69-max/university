import java.util.*;

public class Home1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        if (n > x) {
            int c = n - x;
            int pack = (int) Math.ceil((double) c / 4.0);
            System.out.printf(pack + " packet should buy");
        }
    }
}
