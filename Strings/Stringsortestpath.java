public class Stringsortestpath{
    public static void main(String args[]){
        String path= "WNEENESENNN";
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            if(dir== 'N'){
                y++;
            }
            else if(dir== 'S'){
                y--;
            }
            else if(dir== 'E'){
                x++;
            }
            else{
                x--;
            }
        }
        int X2 =x*x;
        int Y2 =y*y;
        System.out.println( Math.sqrt(X2+Y2)); 
    }
}