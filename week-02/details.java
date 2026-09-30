import java.util.Scanner;
class details{
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = c.nextLine();
        System.out.print("Enter age : ");
        byte age = c.nextByte();
        System.out.print("Enter your Intermidiate marks : ");
        int marks = c.nextInt();
        System.out.printf("Name : %s\nAge : %d\nInter Marks : %d",name,age,marks);
    }
}