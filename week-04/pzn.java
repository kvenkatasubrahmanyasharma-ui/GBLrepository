import java.util.Scanner;
class pzn{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value : ");
        int n = input.nextInt();
        if(n>0){
            System.out.println("+ve");
        }
        else if(n<0){
            System.out.println("-ve");
        }
        else{
            System.out.printf("We are not legally responsible for classifing %d",n);
        }
    }
}