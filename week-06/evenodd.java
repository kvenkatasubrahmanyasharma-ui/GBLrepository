import java.util.Scanner;
class evenodd{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter value : ");
        int a = inp.nextInt();
        String p = (a%2==0)?"Even":"Odd";
        System.out.print(p);
        inp.close();
    }
}