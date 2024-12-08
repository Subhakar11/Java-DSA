public class Multipleinheritance {
    public static void main(String args[]){
        Bear b = new Bear();
        b.eat();
    }
}

interface Herbivore{
    void eat();  
}
interface Cornivore{
    void eat( );
}

class Bear implements Herbivore , Cornivore{
   public void eat(){
        System.out.println("eats grass & meet");
    }
}
