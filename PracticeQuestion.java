import java.util.Scanner;

public class PracticeQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter c");
        int c = sc.nextInt();

        int d = (a + b + c)/3;

        System.out.println(d);

        sc.close();
    }
}
