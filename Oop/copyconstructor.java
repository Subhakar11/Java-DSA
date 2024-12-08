public class copyconstructor {
    public static void main(String args[]){
        Student s  = new Student();
        s.name = "Subhakar";
        s.roll = 57;
        s.marks[0] = 78;
        s.marks[1] = 88;
        s.marks[2] = 98;
        Student s1 = new Student(s);
        s.password = 123;
        for(int i=0;i<3;i++){
            System.out.println(s1.marks[i]);
        }
    }
    
}

class Student{
    String name;
    int roll;
    int password;
    int marks[];
        Student(){
            System.out.println("This is constructor");
        }
        // shallow copy
    // Student(Student s){
    //     this.name = s.name;
    //     this.roll = s.roll;
    //     this.password = s.password;
    //     marks = new int[3];
    //     this.marks = s.marks;
    // }

    // Deap copy
    Student(Student s){
        this.name = s.name;
        this.roll = s.roll;
        this.password = s.password;
        marks = new int[3];
        for(int i=0;i<marks.length;i++){
            this.marks[i] = s.marks[i];
        }
    }
}