public class Functionoverriding {
    public static void main(String args[]){
        Deer d = new Deer();
        d.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("eat anything");
    }
}
class Deer  extends Animal{
    void eat(){
        System.out.println("eat Grass");
    }
}