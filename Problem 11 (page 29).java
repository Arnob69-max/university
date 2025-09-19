import java.util.*;

public class Home1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        sc.close();

        int totalHours = 4 * X + Y;

        System.out.println(totalHours);
    }
}
