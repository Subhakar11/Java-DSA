
public class Hybridinheritance {
        public static void main(String args[]){
            Gauraiya G = new Gauraiya();
             G.fly();
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
    class Shark extends Fish{
        void run(){
            System.out.println("Run fast in water");
        }
    }
    class Mammal extends Animal{
        int legs;
    }
    class Bird extends Animal {
        void sky(){
            System.out.println("fly in the sky");
        }
    }
    class Gauraiya extends Bird{
        void fly(){
            System.out.println("fly with fins");
        }
    }
    
    



