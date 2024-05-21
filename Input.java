import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int product = a * b;
        System.out.println(sum);
        System.out.println(product); 
        sc.close();


    }
}
