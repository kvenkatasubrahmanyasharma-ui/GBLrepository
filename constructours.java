import java.util.Scanner;
class user{
    user(){
        System.out.println("Hello World");
    }
    user(int a, int b){
        System.out.println(a+b);
    }
}
class dec{
    void dis(){
        System.out.println("This class has a default constructor");
    }
}
class constructours{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        user u1 = new user();
        user u2 = new user(10,20);
        dec d = new dec();
        d.dis();
        user[] arr = {u1,u2};
        System.out.println(u1+" "+u2+" "+d);
        System.out.println();
        System.out.println(in);
        System.out.println();
    }
}