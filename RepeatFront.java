import java.util.*;

class UserMainCode {

    public static String repeatFront(String s, int a) {

        String front;

        if (s.length() >= 3) {
            front = s.substring(0, 3);
        } else {
            front = s;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < a; i++) {
            result.append(front);
        }

        return result.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int a = sc.nextInt();

        String output = UserMainCode.repeatFront(s, a);
        System.out.println(output);
    }
}
