import java.util.Scanner;
class vowel{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an alphabet character : ");
        char let = input.next().charAt(0);
        switch(let){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.printf("%c is a vowel",let);
                break;
            default:
                System.out.printf("%c is a consonant",let);
        input.close();
        }
    }
}