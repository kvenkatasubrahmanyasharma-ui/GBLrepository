import java.util.Scanner;
class blooddon{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = input.nextInt();
        System.out.print("Enter weight : ");
        int weight = input.nextInt();
        if(age >= 18 && weight > 50){
            System.out.print("Can donate blood");
        }
        else{
            System.out.print("Can't donate blood");
        }
        input.close();
    }
}