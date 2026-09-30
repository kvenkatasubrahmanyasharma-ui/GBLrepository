import java.util.Scanner;
class Age{
    public static void main(String[] args){
        Scanner idk = new Scanner(System.in);
        System.out.print("Enter age : ");
        byte age = idk.nextByte();
        if(0 <= age && and <= 12){
            System.out.println("Child");
        }
        else if(13 <= age && age <= 18){
            System.out.println("Teen");
        }
        else{
            System.out.println("Adult");
        }
        idk.close();
    }
}