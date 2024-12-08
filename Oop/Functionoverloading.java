public class Functionoverloading {
    public static void main(String args[]){
    Calcultor cal = new Calcultor();
    System.out.println(cal.sum(2,3 ));
    System.out.println(cal.sum((float)2.2,(float)3.3 ));
    System.out.println(cal.sum(2,3,4 ));
    }
}
 class Calcultor{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
 }
