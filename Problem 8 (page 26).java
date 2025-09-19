import java.util.*;

public class Home1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        sc.close();

        int subs = (int) Math.ceil(N / 6.0);
        int cost = subs * X;

        System.out.println(cost);
    }
}
