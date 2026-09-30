import java.util.Scanner;
class assignmentdemotwo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = input.nextInt();
        System.out.println(a);
        a += 10; 
        System.out.println(a);
        a -= 5;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 5;
        System.out.println(a);
        a %= 3;
        System.out.println(a);
        input.close();
    }
}