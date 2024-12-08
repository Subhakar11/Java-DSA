import java.util.*;
class Minjumptoreachhome {
    public static int minimumJumps(int[] forbidden, int forwardJump, int backwardJump, int target) {
        Set<Integer> forbiddenSet = new HashSet<>();
        for (int position : forbidden) {
            forbiddenSet.add(position);
        }
      
     
        Deque<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {0, 1});
      
      
        final int MAX_POSITION = 6000;
      
            boolean[][] visited = new boolean[MAX_POSITION][2];
        visited[0][1] = true; 
         for (int steps = 0; !queue.isEmpty(); ++steps) {
             for (int size = queue.size(); size > 0; --size) {
                int[] currentPosition = queue.poll();
                int position = currentPosition[0];
                int canJumpBackward = currentPosition[1];
              
   if (position == target) {
                    return steps;
                }
              
                List<int[]> nextPositions = new ArrayList<>();
                nextPositions.add(new int[] {position + forwardJump, 1}); 
              
                if (canJumpBackward == 1) {
                    nextPositions.add(new int[] {position - backwardJump, 0});  }
              
                for (int[] nextPos : nextPositions) {
                    int newPosition = nextPos[0];
                    int newCanJumpBackward = nextPos[1];
                  
                    if (newPosition >= 0 &&
                        newPosition < MAX_POSITION &&
                        !forbiddenSet.contains(newPosition) &&
                        !visited[newPosition][newCanJumpBackward]) {
                      
                   
                        queue.offer(new int[] {newPosition, newCanJumpBackward});
                        visited[newPosition][newCanJumpBackward] = true;
                    }
                }
            }
        }
      
        return -1;
    }
    public static void main(String[] args) {
        int forbidden[] = {1,6,2,14,5,17,4};
        int a = 16;
        int b=9;
        int x= 7;
        System.out.println(minimumJumps(forbidden,a,b,x));
    }
}