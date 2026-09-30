import java.util.Scanner;
public class Datatypedemo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age: ");
        byte age = input.nextByte();
        System.out.print("Enter inter marks: ");
        short marks = input.nextShort();
        System.out.print("Enter year:");
        int hyear = input.nextInt();
        System.out.print("Enter world poplutation: ");
        long worpop = input.nextLong();
        System.out.print("Enter e value: ");
        float e = input.nextFloat();
        System.out.print("Enter pi value: ");
        double pi = input.nextDouble();
        input.nextLine();
        System.out.print("Enter your initial: ");
        char ini = input.next().charAt(0);
        System.out.print("Are you a student: ");
        boolean is_day = input.nextBoolean();
        input.nextLine();
        System.out.print("Name:");
        String name = input.nextLine();
        System.out.println("Your age is "+age);
        System.out.println("Your marks are "+marks); 
        System.out.println("The year is "+hyear+" of human era");
        System.out.println("The world has "+worpop+" people");
        System.out.println("e = "+e);
        System.out.println("pi = "+pi);
        System.out.println("Your initial is "+ini);
        System.out.println("Your name is "+name);
        System.out.println("Your full name is "+ini+"."+name);
        System.out.println("Is it day? "+is_day);
        input.close();
    }
}