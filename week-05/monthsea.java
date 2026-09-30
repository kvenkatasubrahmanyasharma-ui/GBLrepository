import java.util.Scanner;
class monthsea{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month number : ");
        byte mon = input.nextByte();
        if(mon>12){
            System.out.print("Invalid month number");
        }
        else{
            if(mon<3 || mon>= 11){
                System.out.print("Winter");
            }
            else if(mon >=3 && mon < 5){
                System.out.print("Spring");
            }
            else if(mon>=5 && mon < 6){
                System.out.print("Summer");
            }
            else if(mon >= 6 && mon < 9){
                System.out.print("Monsoon");
            }
            else if(mon >= 9 && mon < 11){
                System.out.print("Autumn");
            }
        }
        input.close();
    }
}