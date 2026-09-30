import java.util.Scanner;
public class DataTypesDemo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        byte age;
        short marks;
        int hyear;
        long ph_no;
        char grade;
        String city;
        boolean pass;
        System.out.print("Age : ");
        age = input.nextByte();
        System.out.print("Marks : ");
        marks = input.nextShort();
        System.out.print("Year : ");
        hyear = input.nextInt();
        System.out.print("Phone number : ");
        ph_no = input.nextLong();
        System.out.print("Grade : ");
        grade = input.next().charAt(0);
        System.out.print("Where do you live? ");
        city = input.nextLine();
        System.out.print("Are you a student? ");
        pass = input.hasNextBoolean();
        System.out.println("Your age is: " + age);
        System.out.println("Your marks are: " + marks);
        System.out.println("Your graduation year is: " + hyear);
        System.out.println("Your phone number is: " + ph_no);
        System.out.println("Your grade is: " + grade);
        System.out.println("You live in: " + city);
        System.out.println("You have passed: " + pass);
        input.close();
    }
}