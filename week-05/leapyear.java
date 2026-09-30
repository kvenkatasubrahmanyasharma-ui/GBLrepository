import java.util.Scanner;
class leapyear{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year : ");
        short y = input.nextShort();
        if((y%4==0 && y%100!=0)||(y%100==0 && y%400==0)){
            System.out.print("Leap year");
        }
        else{
            System.out.print("Not leap year");
        }
        input.close();
    }
}