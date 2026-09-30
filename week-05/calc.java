import java.util.Scanner;
class calc{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int res= 0;
        int i=0 ;
        System.out.print("Enter 1st number : ");
        int a = input.nextInt();
        input.nextLine();
        System.out.print("Enter operation : ");
        char o = input.next().charAt(0);
        System.out.print("Enter 2nd number : ");
        int b = input.nextInt();
        switch(o){
            case '+':
                res = a+b;
                break;
            case '-':
                res = a-b;
                break;
            case '*':
                res = a*b;
                break;
            case '/':
                res = a/b;
                break;
            case '%':
                res = a%b;
                break;
            default:
                System.out.print("Invalid operation");
                ++i;
        }
        if(i==0){    
            System.out.printf("%d %c %d = %d",a,o,b,res);
        }
        input.close();
    }
}