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
         
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Length");
        // int side = sc.nextInt();

        // int Area_of_Square = side * side;

        // System.out.println("Area of Square is : " + Area_of_Square);

        // sc.close();

        // Question 3 : Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
        // an eraser. You have to output the total cost of the items back to the user as their bill.
        // (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of a Pencil");
        float pencil = sc.nextFloat();
        System.out.println("Enter the cost of a Pen");
        float pen = sc.nextFloat();
        System.out.println("Enter the cost of an Eraser");
        float eraser = sc.nextFloat();

        float Total_Cost = pencil + pen + eraser;

        System.out.println("Total cost of stationary is :" + Total_Cost);

        float GST = Total_Cost * 0.18f;

        float  Total_Cost_After_Adding_Tax = Total_Cost + GST;
        
        System.out.println("Total cost of the stationary after 18% gst tax is : " + Total_Cost_After_Adding_Tax);

        sc.close();

    }
}
