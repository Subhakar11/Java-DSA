import java.util.*;
public class oopsproblem {

    public  static class Complex{
        private int real;
        private int img;
        Complex(int real,int img){
            this.real = real;
            this.img = img ;
        }
       public  void printcomplex(){
            if(this.img !=0){
                System.out.println(this.real +" + "+ this.img + "i");
            }
            else {
                System.out.println(this.real);
            }
        }
        public Complex add(Complex c){
       Complex result = new Complex(0,0);
       result.real =  this.real + c.real;
       result.img = this.img + c.img;
        return result;
        }
        public Complex sub(Complex c){
       Complex result = new Complex(0,0);
       result.real =  this.real - c.real;
       result.img = this.img - c.img;
        return result;
        }
        public Complex mul(Complex c){
       Complex result = new Complex(0,0);
       result.real =  this.real*c.real-this.img*c.img;
       result.img = this.real*c.img - c.real*this.img;
        return result;
        }
    }
    public static void main(String args[]){
      Complex c1 = new Complex(5,7);
      Complex c2= new Complex(8,5);

      c1.printcomplex();
      c2.printcomplex();
      Complex res  = c1.add(c2);
      Complex res1  = c1.sub(c2);
      Complex res2  = c1.mul(c2);
      res.printcomplex();
      res1.printcomplex();
      res2.printcomplex();
     
    }
    
}
