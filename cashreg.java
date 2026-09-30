import java.util.Scanner;
class cashreg{
    static int findIndex(int[] arr, int t){
        if(arr==null) return -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==t)
                return i;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] bcoden = {10101,11001,11111,10011,10010};
        int[] prices = {50,45,70,100,10};
        String[] names = {"DM Fruit&Nut","Protein Bar","Kitkat","Silk","Parle"};
        int totp = 0;
        int bn = 0;
        while(bn!=-1){
            bn = in.nextInt();
            int qun = in.nextInt();
            int loc = findIndex(bcoden,bn);
            if(loc!=-1){
                System.out.print(" "+prices[loc]*qun);
                System.out.println(" "+names[loc]);
                totp += prices[loc]*qun;
            }
        }
        if(totp>=500)
            totp-=50;
        System.out.println("Total Payable : "+totp);
        in.close();
    }
}