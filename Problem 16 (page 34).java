import java.util.Scanner;

public class Home1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int R = sc.nextInt();
        int S = sc.nextInt();
        sc.close();

        if (P > Q + R + S || Q > P + R + S || R > P + Q + S || S > P + Q + R) {
            System.out.println("There is monopoly in the market");
        } else {
            System.out.println("There is no monopoly in the market");
        }
    }
}
