import java.util.Scanner;

public class Home1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        int count = 0;
        for (int i = 0; i < N; i++) {
            int age = sc.nextInt();
            if (age > X) {
                count++;
            }
        }

        sc.close();
        System.out.println(count);
    }
}
