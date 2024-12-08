public class Withoutconsecutiveonesrecursion {
    public static int withoutconsecutiveones(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        withoutconsecutiveones(n-1, 0, str+'0');
        if(lastplace==0){
            withoutconsecutiveones(n-1, 1, str+'1');
        }
    }
    public static void main(String args[]){
        withoutconsecutiveones(3, 0, "");
    }
}
