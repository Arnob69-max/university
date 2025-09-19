import java.util.*;

public class Home1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        if (word.length() > 0) {
            String result = word.substring(0,1).toUpperCase() + word.substring(1);
            System.out.println(result);
        }

        sc.close();
    }
}
