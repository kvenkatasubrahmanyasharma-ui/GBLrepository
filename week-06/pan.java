import java.util.Scanner;
class pan{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter value : ");
        int a = inp.nextInt();
        String s = (a>0)?"Positive":(a==0)?"Zero":"Negative";
        System.out.print(s);
        inp.close();
    } 
}