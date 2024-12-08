

public class BFSinhashmapgraphgivenedge {
        public static void main(String[] args) {
            int n = 5; // Number of vertices
            Map<Integer, List<Integer>> graph = new HashMap<>();
            // Assume the graph is represented as a Map<Integer, List<Integer>> as discussed before
    
            int source = 0; // Starting vertex for BFS
    
            // Queue for BFS
            Queue<Integer> queue = new LinkedList<>();
            boolean[] visited = new boolean[n];
    
            // Starting BFS from the source vertex
            queue.offer(source); // Add the source vertex to the queue
            visited[source] = true; // Mark the source vertex as visited
    
            while (!queue.isEmpty()) {
                int currentVertex = queue.poll(); // Remove the vertex from the front of the queue
                System.out.print(currentVertex + " "); // Process the current vertex
    
                // Visit all neighbors of the current vertex
                for (int neighbor : graph.getOrDefault(currentVertex, new ArrayList<>())) {
                    if (!visited[neighbor]) { // If the neighbor has not been visited yet
                        queue.offer(neighbor); // Add the neighbor to the queue
                        visited[neighbor] = true; // Mark the neighbor as visited
                    }
                }
            }
        }
    }
    


    public static Map<Integer, List<Integer>> createGraph(int[][] adjacencyList) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 0; i < adjacencyList.length; i++) {
            List<Integer> neighbors = new ArrayList<>();
            for (int j = 0; j < adjacencyList[i].length; j++) {
                neighbors.add(adjacencyList[i][j]);
            }
            graph.put(i, neighbors);
        }

        return graph;
    }

   // adjacencyList =[[1,2,3],[0,2],[0,1,3],[0,2]]



   HashMap<Integer,List<Integer>> adj;
    
    public int findShortestCycle(int n, int[][] edges) {
        
        adj = new HashMap<>();
        
        for(int i = 0;i<n;i++){
            adj.put(i,new ArrayList<>());
        }
        
        for(int i = 0;i<edges.length;i++){
            
            int u = edges[i][0];
            int v = edges[i][1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
            
        }

        //edges =  [[0,1],[1,2],[2,0],[3,4],[4,5],[5,6],[6,3]]









        class Solution {
            public int[] shortestPath(int[][] edges, int n,int m, int src) {
                
                 List<List<Integer>> adjList = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    adjList.add(new ArrayList<>());
                }
        
                for (int[] edge : edges) {
                    adjList.get(edge[0]).add(edge[1]);  // if graph id directed then only this code
                    adjList.get(edge[1]).add(edge[0]); // Since the graph is undirected
                }
        
                // Initialize distance array
                int[] dist = new int[n];
                Arrays.fill(dist, -1); 
                dist[src] = 0;
        
            
                Queue<Integer> queue = new LinkedList<>();
                queue.offer(src);
        
                while (!queue.isEmpty()) {
                    int node = queue.poll();
        
                    for (int neighbor : adjList.get(node)) {
                        if (dist[neighbor] == -1) { // If neighbor is not visited
                            dist[neighbor] = dist[node] + 1;
                            queue.offer(neighbor);
                        }
                    }
                }
        
                return dist;
            }
        }
        