import java.util.*;

public class Home1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt();
        int student = sc.nextInt();
        int pass = sc.nextInt();

        if (pass > (sec * student) / 2.0) {
            System.out.println("passing percentage more than 50");
        } else {
            System.out.println("passing percentage less than 50");
        }
    }
}
