import java.util.*;

public class Home1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kg = sc.nextInt();
        int totalpage = kg * 1000;
        int totalnotebook = totalpage / 100;

        System.out.println(totalnotebook + " notebook");
    }
}
