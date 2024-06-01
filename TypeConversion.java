import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
      int a = 25;
      long b = a;
      System.out.println(b);  
      
      Scanner sc = new Scanner(System.in);
      float c = sc.nextInt();
      System.out.println(c);

      sc.close();
    }
}
