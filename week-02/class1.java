import java.util.Scanner;
class Class{
	public static void main(String[] args){
		Scanner c = new Scanner(System.in);
		System.out.print("Enter length : ");
		int l = c.nextInt();
		System.out.print("Enter breadth : ");
		int b = c.nextInt();
		int a = l*b;
		System.out.printf("Area of rectangle is %d sq.units",a);
		c.close();
	}
}