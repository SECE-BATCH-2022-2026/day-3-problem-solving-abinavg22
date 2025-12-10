import java.util.*;
import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        System.out.println(UserMainCode.regularExpression(inp));
    }
}

class UserMainCode {
    public static boolean regularExpression(String inp) {
        Pattern p = Pattern.compile("[a-zA-Z0-9] R[0-9] [a-zA-Z0-9]");
        Matcher m = p.matcher(inp);
        return m.matches();
    }
}
