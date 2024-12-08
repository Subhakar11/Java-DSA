public class constructor {
    public static void main(String args[]){
    //Student s = new Student();
        Student s = new Student("Subhakar");
        System.out.println(s.name);
    }
}

class Student {
    String name;
    int roll;

    // Student(){
    //     System.out.println("This is constructor");
    // }
    Student(String name){
        this.name = name;
    }
}