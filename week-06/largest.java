import java.util.Scanner;
class largest{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int[] num = new int[3];
        int a = input("Enter 1st number : " , inp);
        int b = input("Enter 2nd number : " , inp);
        int c = input("Enter 3rd number : " , inp);
        int d = (a>b && a>c)?a:(b>c)?b:c;
        System.out.print("Largest is "+d);
        inp.close();
    }
    static int input(String prompt, Scanner inp){
        System.out.print(prompt);
        int a = inp.nextInt();
        return a;
    }
}