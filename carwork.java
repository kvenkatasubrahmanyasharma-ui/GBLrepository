class studentMarks{
    String name;
    int rollNo;
    int[] marks = new int[6];
    studentMarks(String n,int r,int m1,int m2,int m3,int m4,int m5,int m6){
        name = n;
        rollNo = r;
        int[] m = {m1,m2,m3,m4,m5,m6};
        for(int i=0;i<6;i++){
            marks[i] = m[i];
        }
    }
    int totalmarks(){
        int s=0;
        for(int i=0;i<6;i++){
            s += marks[i];
        }
        return s;
    }
    double perc(){
        int t = totalmarks()/600;
        return t;
    }
    void dispaly(){
        System.out.printf("Name : %s\nRoll No : %d",name,rollNo);
        for(int i=0;i<6;i++){
            System.out.printf("Subject %d : %d\n",i+1,marks[i]);
        }
        System.out.printf("Total score : %d\nPercrntage : %f\n\n",totalmarks(),perc());
    }
}
class carwork{
    public static void main(String[] args){
        studentMarks s1 = new studentMarks("Rahul", 30218, 70, 54, 99, 87, 90, 88);
        studentMarks s2 = new studentMarks("Deva", 30187, 77, 78, 99, 87, 70, 55);
        s1.dispaly();
        s2.dispaly();
    }
}