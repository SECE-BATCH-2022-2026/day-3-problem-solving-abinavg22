import java.util.*;;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("Enter b: ");
        int b = sc.nextInt();

        System.out.println("Enter c: ");
        int c = sc.nextInt();

        int sum = 0;

        if (a == 13) {
        
            System.out.println("Sum = 0");
            return;
        } else {
            sum += a;
        }

        if (b == 13) {
            
            System.out.println("Sum = " + sum);
            return;
        } else {
            sum += b;
        }

        if (c != 13) {
            sum += c;
        }

        System.out.println("Sum = " + sum);
    }
}