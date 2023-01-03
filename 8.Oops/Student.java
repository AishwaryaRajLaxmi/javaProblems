// package 8.Oops;

class Subject
{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public Subject(String subID,String name,int maxMarks){
        this.subID
        =subID;
        this.name=name;
        this.maxMarks=maxMarks;
    }
  
    public String getSubID(){return subID;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtain(){return marksObtain;}

    public void setMarks(int mm){
        maxMarks=mm;
    }

    public void setMarksObtain(int m){
        marksObtain=m;
    }

    boolean isQualified(){
        return marksObtain>=maxMarks/10*4;
    }


    public String toString(){
        return "\nSubject ID:"+subID+"\nName :"+name+"\nMarks Obtained: "+marksObtain;
    }
}

public class Student {
    public static void main(String[] args){
Subject subs[]=new Subject[3];
subs[0]=new Subject("s101","DS",100);
subs[1]=new Subject("s102","Algo",100);
subs[2]=new Subject("s0103","Os",200);
subs[0].setMarks(100);;
subs[0].setMarksObtain(200);

System.out.println(subs[0].getSubID());
System.out.println(subs[0].getName());
System.out.println(subs[0].getMaxMarks());
System.out.println(subs[0].getMarksObtain());

for(Subject s:subs){
    System.out.println(s);

}
    }

    }
    

