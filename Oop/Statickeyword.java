public class Statickeyword {
    public static void main(String args[]){
        Student s = new Student();
        s.schoolName = "RECM";
        System.out.println(s.schoolName);
          Student s1 = new Student();
          Student s2 = new Student();
      
        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);
    }
}

class Student {
    String name;
    int roll;
static String schoolName;
    void setname(String name){
        this.name  = name;
    }
    String getname(){
        return this.name;
    }
}