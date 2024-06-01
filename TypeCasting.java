import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        int b = (int) a;
        System.out.println(b);
        sc.close();

        char ch = 'a';
        int num = ch;
        char ch2 = 'b';
        int num2 = ch2;
        System.out.println(num);
        System.out.println(num2);
        System.out.println(num - num2);

    }
}
