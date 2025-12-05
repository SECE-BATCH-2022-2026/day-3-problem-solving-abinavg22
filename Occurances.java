import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String1: ");
        String string1 = sc.nextLine();

        System.out.print("Enter String2: ");
        String string2 = sc.nextLine();

        String s1 = string1.toLowerCase();
        String s2 = string2.toLowerCase();

        int count = 0;

        for (int i = 0; i <= s1.length() - s2.length(); i++) {
            if (s1.substring(i, i + s2.length()).equals(s2)) {
                count++;
            }
        }

        System.out.println("Occurrences: " + count);
    }
}