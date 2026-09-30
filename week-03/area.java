import java.util.Scanner;
public class area{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length : ");
        byte len = input.nextByte();
        System.out.print("Enter breadth : ");
        byte ber = input.nextByte();
        int area = len*ber;
        System.out.print("The area of the rectangle is : " +area); 
    }
}