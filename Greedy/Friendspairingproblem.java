public class Friendspairingproblem{
    public static int friendspairing(int n){
    if(n==1||n==2){
        return n;
    }
    // single
    int fnm1 = friendspairing(n-1);
    //pair
    int fnm2 = friendspairing(n-2);
    int pairway = (n-1)*fnm2;
     // total way
    int  totalway = fnm1 + pairway;
    return totalway;
}
    public static void main(String args[]){
        int n = 3;
        System.out.println(friendspairing(n));
    }
}