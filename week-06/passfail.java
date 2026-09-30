import java.util.Scanner;
class passfail{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int m = in.nextInt();
        String s = (m>=40)?"Pass":"Fail";
        System.out.print(s);
        in.close();
    }
}