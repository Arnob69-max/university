import java.util.*;

public class Home1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();

            if (word.length() > 10) {
                int middle = word.length() - 2;
                String shortWord = "" + word.charAt(0) + middle + word.charAt(word.length() - 1);
                System.out.println(shortWord);
            } else {
                System.out.println(word);
            }
        }
        sc.close();
    }
}
