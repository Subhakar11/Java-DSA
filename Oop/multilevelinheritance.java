public class multilevelinheritance {
    public static void main(String args[]){
        Dog boddy = new Dog();
        boddy.eat();
        boddy.legs = 4;
        System.out.println(boddy.legs);
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Mammal extends Animal{
    int legs;
}
class Dog extends Mammal{
    int breed;
}

