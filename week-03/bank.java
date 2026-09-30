import java.util.Scanner;
public class bank{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int prin = 300000;
        float rate = 0.02f;
        int time = 7;
        float simi = prin*rate*time;
        System.out.print("The simple interest is : $" + simi);
    }
}
/*prin = 10000
prin = None 
print = "Hello" */