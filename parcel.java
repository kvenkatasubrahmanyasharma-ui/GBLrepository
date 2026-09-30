import Myprojects.myMethods;
class parcel{
    public static void main(String[] args){
        myMethods mM = new myMethods();
        try {
            double weight = mM.inputd("Enter parcel weight [kg] : ");
            System.out.printf("Weight accepted %f kg\n", weight);
        } 
        catch (NumberFormatException e) {
            System.out.println("Invalid weight Please enter a number");
        }
        finally{
            System.out.println("Weight checking completed");
        }       
    }
}