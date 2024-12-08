public class Friendspairingrecursion{
    public static int friendspairing(int n){
        if(n==0||n==1){
            return 1;
        }
        return friendspairing(n-1)+(n-1)*friendspairing(n-2);
    }
    public static void main(String args[]){
System.out.println(friendspairing(3));
    }
}