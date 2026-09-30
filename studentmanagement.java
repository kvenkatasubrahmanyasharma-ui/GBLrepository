import Myprojects.myMethods;
class studentmanagement{
    public static void main(String[] args){
        myMethods m = new myMethods();
        m.clearScreen();
        int[] acNo = {30218,30187,30190,30225,30242};
        int[] piNo = {2009,1987,1984,1993,2000};
        int[] baAm = {28000,7000,50000,3333,666};
        while(true){
            int a = m.inputi("Enter Bank Account number : ");
            int ac = m.findIndex(acNo, a);
            int b = m.inputi("What do you want to do?\n1]Withdraw\n2]Deposit\n3]Check Balance\nEnter Here : ");
            int p = m.inputi("Enter PIN Number : ");
            m.clearScreen();
            if(p==piNo[ac]){
                if(b==1){
                    int w = m.inputi("Enter amount : ");
                    if(w > baAm[ac]){
                        System.out.println("Insufficient Balance");
                    }
                    else{
                        baAm[ac] -= w;
                        System.out.println("Rs."+w+"/- Withdrawn");
                    }
                }
                else if(b==2){
                    int d = m.inputi("Enter amount");
                    baAm[ac] += d;
                    System.out.println("Rs."+d+"/- Deposited");
                }
                else if(b==3){
                    System.out.println("Your account Balance is Rs."+baAm[ac]+"/-");
                }
                else if(b==0){
                    break;
                }
                else{
                    System.out.println("Invalid choice");
                }     
            }
            else{
                System.out.println("Wrong PIN");
            }   
            m.inputs("");
            m.clearScreen();   
        }
    }
}