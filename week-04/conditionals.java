import java.util.Scanner;
    class conditionals{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter age : ");
            byte a = input.nextByte();
            if(a>=18)
                System.out.print("You can vote");
            input.close(); 
        }
    } 