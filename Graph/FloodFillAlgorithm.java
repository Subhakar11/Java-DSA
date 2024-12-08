import java.util.*;
public class FloodFillAlgorithm{
    public void helper(int [][] image, int sr,int sc, int color, boolean vis[][],int orgCol){
        if(sr<0 || sc<0 || sr>= image.length|| sc>=image[0].length|| vis[sr][sc]|| image[sr][sc]!=orgCol){
            return;
        }
        image[sr][sc] = color;
        // left
        healper(image,sr,sc-1,vis,orgCol);
        // right
        healper(image,sr,sc+1,vis,orgCol);
        // up
        healper(image,sr-1,sc,vis,orgCol);
        // down
        healper(image,sr+1,sc,vis,orgCol);
    }

    public int [][] floodfill(int [][] image, int sr,int sc, int color){
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }
    public static void main(String[] args) {
        
    }
}