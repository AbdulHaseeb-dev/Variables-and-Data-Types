import java.util.Scanner;

public class PracticeQuestion {
    public static void main(String[] args) {

        // Question 1 : In a program,input 3 numbers : A,B and C.You have to output the average of these 3 numbers.(Hint : Average of N numbers is sum of those numbers divided by N)


        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a");
        // int a = sc.nextInt();
        // System.out.println("Enter b");
        // int b = sc.nextInt();
        // System.out.println("Enter c");
        // int c = sc.nextInt();

        // int d = (a + b + c)/3;

        // System.out.println("Average is : " + d);

        // sc.close();

        // Question 2 : In a program, input the side of a square.You have to output the area of the square.(Hint : area of a square is (side x side))
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length");
        int side = sc.nextInt();

        int Area_of_Square = side * side;

        System.out.println("Area of Square is : " + Area_of_Square);

        sc.close();



    }
}
