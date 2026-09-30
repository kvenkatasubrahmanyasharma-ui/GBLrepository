import java.util.Scanner;
public class Mathsdemotwo{
    public static void main(String[] args){
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        a = input.nextInt();
        System.out.print("Enter 2nd number: ");
        b = input.nextInt();
        // Addititon
        System.out.println("Sum of a and b is : "+(a+b));
        // Sutraction
        System.out.println("Difference of a and b is : "+(a-b));
        // Multiplation
        System.out.println("Product of a and b is :"+(a*b));
        // Division
        System.out.println("Quotient of a and b is : "+(a/b));
    }
}