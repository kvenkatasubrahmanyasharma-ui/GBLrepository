import java.util.Scanner;
class traffic{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter traffic light colour : ");
        String lc = input.next();
        switch(lc){
            case "RED":
                System.out.print("Stop");
                break;
            case "YELLOW":
                System.out.print("Slow down");
                break;
            case "GREEN":
                System.out.print("You can go");
                break;
            default:
                System.out.print("Invaild colour");
        input.close();

        }
    }
}