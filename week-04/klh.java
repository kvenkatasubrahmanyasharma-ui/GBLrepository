import java.util.Scanner;
class klh{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter attendence percentage : ");
        double per = input.nextDouble();
        if(per>=85){
            System.out.print("Eligible to come to colloge");
        }
        else{
            System.out.print("Suspened for a week");
        }
        input.close();
    }
}