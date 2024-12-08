public class constructoroverloading {
    public static void main(String args[]){
    Student s1 = new Student();
    s1.name = "subhakar";
    
        Student s2 = new Student("Subhakar");
        Student s3 = new Student(57);
        
        System.out.println(s2.name);
        System.out.println(s3.roll);
    }
}

class Student {
    String name;
    int roll;

    Student(){
        System.out.println("This is constructor");
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}