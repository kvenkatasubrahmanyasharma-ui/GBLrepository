import java.util.Scanner;
class seminarprog{
    public static void main(String[] args){
       Scanner python = new Scanner(System.in);
       String id = python.next();
       String recepient = python.next();
       char size = python.next().charAt(0);
       double weight = python.nextDouble();
       int base = (size=='L') ? 30 : (size=='M')? 20:10;
       int surcharge = (int) Math.ceil(weight)*2;
       int fee = base + surcharge;
       System.out.printf("Parcel : %s(%s)\n",id,recepient);
       System.out.printf("Size: %c Weight: %.1fkg\n",size,weight);
       System.out.printf("Fee: Rs.%d\n",fee);
       python.close();
    }
}