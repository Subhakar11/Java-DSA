public class Abstractclass {
    public static void main(String args[]){
    Horse h = new Horse();
    h.eat();
    h.walk();
     System.out.println(h.color);   
    
    }
}

abstract class Animal{
    String color;
    Animal(){
        color = "brown";
    }
    void eat(){
        System.out.println("Animal eat");
    }
    abstract void walk();
}

 class Horse extends Animal{
    void changecolor(){
        color = "dark";
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}