import java.util.Scanner;
class www{
    public static void main(String[] args){
        Scanner no = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n = no.nextInt();
        System.out.print("Enter 2nd number : ");
        int m = no.nextInt();
        System.out.print("Enter 3rd number : ");
        int o = no.nextInt();
        if(n>m && n>o){
            System.out.print(n+" is greatest");
        }
        else if(m>o){
            System.out.print(m+" is greatest");
        }
        else{
            System.out.print(o+" is greatest");
        }
    } 
}