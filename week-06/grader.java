import java.util.Scanner;
class grader{
    public static void main(String[] args){
        Scanner in = new Scanner(System.out);
        System.out.print("Enter your marks : ");
        int m = in.nextInt();
        char grade = (m>=90)?'A':(m>=75)?'B':(m>=60)?'C':(m>=45)?'D':'F';
        System.out.print("Grade : "+grade);
        in.close();
    }
}