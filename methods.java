import java.util.Scanner;
class methods{
    static void singHappyBirthday(){
        System.out.println("Happy Birthday to you");
        System.out.println("May you have a happy year");
        System.out.println("Happy Birtyday to you");
    }
    static void singByName(String name, int age){
        System.out.printf("Happy Birthday to %s\n",name);
        System.out.printf("You are %d years old\n",age);
        System.out.println("Happy Birthday to you");
    }
    static double findAge(){
        double age=0.0;
        Scanner i = new Scanner(System.in);
        System.out.print("Enter YOB : ");
        int by = i.nextInt();
        System.out.print("Enter Current Year : ");
        int cy = i.nextInt();
        age = cy-by;
        i.close();
        return age;
    }
    public static void main(String[] args){
        singHappyBirthday();
        singByName("Venkat", 17);
        System.out.println(findAge());
    }
}