public class Hierarchialinheritance {
  
        public static void main(String args[]){
            Bird b = new Bird();
            b.fly();
            Mammal m = new Mammal();
            m.legs = 4;
            System.out.println(m.legs);
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
    class Fish extends Animal{
        void swim(){
            System.out.println("Swim in water");
        }
    }
    class Mammal extends Animal{
        int legs;
    }
    class Bird extends Animal{
        void fly(){
            System.out.println("fly with fins");
        }
    }
    
    

