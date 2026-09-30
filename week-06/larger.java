import java.util.Scanner;
class larger{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter 1st value : ");
        int a = inp.nextInt();
        System.out.print("Enter 2nd value : ");
        int b = inp.nextInt();
        if(a==b)
            System.out.print("Both are equal");
        else if(a>b)
            System.out.print(a+" is larger");
        else
            System.out.print(b+" is larger");
        inp.close();
    }
}