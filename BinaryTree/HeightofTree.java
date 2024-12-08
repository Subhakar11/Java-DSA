import java.util.*;

public class HeightofTree{
    static class Node{
        int data;
        Node left, right;

        public Node (int data){
            this.data= data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) +1;
    }
    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount+rightCount+1;
    }

    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int leftsum = sum(root.left);
        int rightsum = sum(root.right);
        return leftsum+rightsum+root.data;
    }
    // diameter of the tree
    public static int diameter(Node root){ //o(n^2)
        if(root==null){
            return 0;
        }
        int ldia = diameter(root.left);
        int rdia = diameter(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        int selfdia = lh+rh+1;
        return Math.max(selfdia, Math.max(ldia,rdia));
    }

    // diameter of tree 2nd approach
    static class Info {
    int diam;
    int ht;
     public Info(int diam,int ht){
        this.diam = diam;
        this.ht = ht;
    }   
    }
    
    public static Info diameter1(Node root){ //O(n)
        if(root == null){
            return new Info(0,0);
        }
        Info leftInfo = diameter1(root.left);
        Info rightInfo = diameter1(root.right);

        int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht +rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;
        return new Info(diam,ht);
    }

    // subtree of another tree exist then true otherwise false
    public static boolean isIdentical(Node node ,Node subRoot){
        if(node==null&&subRoot ==null){
            return true;
        }
        else if(node ==null || subRoot ==null|| node.data!=subRoot.data){
            return false;
        }
        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right, subRoot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root,Node subRoot){
        if(root == null){
            return true;
        }
        if(root.data ==subRoot.data){
            if(isIdentical(root, subRoot)){
               return true;  
            }
           
        }
        return isSubtree(root.left ,subRoot)|| isSubtree(root.right , subRoot) ;
    }

    // view of the tree
    static class Infotree {
        Node node ;
        int hd;
    public Infotree(Node node ,int hd){
        this.node  = node;
        this.hd = hd;
    }
}    
    public static void topView(Node root){
        // level order
        Queue<Infotree> q = new LinkedList<>();
        HashMap<Integer , Node> map = new HashMap<>();
        int min =0, max = 0;
        q.add(new Infotree(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Infotree curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            } else
            {
              if(!map.containsKey(curr.hd)) { // first time my hd is occuring
                map.put(curr.hd, curr.node);
            }
            if(curr.node.left !=null){
                q.add(new Infotree(curr.node.left, curr.hd-1));
                min = Math.min(min , curr.hd-1);
            }
            if(curr.node.right!=null){
                max = Math.max(max, curr.hd+1);
            }  
            }
        
    } 
    for(int i=min; i<=max; i++){
    System.out.println(map.get(i).data+" ");
    }
    System.out.println();
    }
    public static void KLevel(Node root,int level , int k){
        if(root == null){
            return ;
        }
         if( level == k){
            System.out.println(root.data+" ");
            return;
         }
         KLevel(root.left, level+1, k);
         KLevel(root.right, level+1, k);
    }
// least common Ancester
// public static boolean getPath(Node root,int n, ArrayList<Integer> path){
//     if(root == null){
//         return false;
//     }
    
//     path.add(root);
//     if(root.data ==n){
//         return true;
//     }
//     boolean foundLeft = getPath(root.left, n, path);
//     boolean foundright = getPath(root.right, n, path);

//     if(foundLeft||foundright){
//         return true;
//     }
//     path.remove(path.size()-1);
//     return false;
// }
//     public static Node lca(Node root,int n1,int n2 ){
//         ArrayList<Integer> path1 = new ArrayList<>();
//         ArrayList<Integer> path2 = new ArrayList<>();
//         getPath (root ,n1,path1);
//         getPath (root ,n2,path2);

//         // least common ancester
//         int i=0;
//         for(; i<path1.size() && path2.size();i++){
//             if(path1.get(i)!=path2.get(i))
//             break;
//         }
//         // last equal node -> i-1th
//         Node lca  = path1.get(i-1);
//         return lca;
//     }
    // least common ancester approach 2
    public static Node lca2Node(Node root,int n1,int n2){
        if(root == null){
            return null;
        }
        if(root.data == n1 || root.data ==n2){
            return root;
        }
        Node leftLca = lca2Node(root.left ,n1,n2);
        Node righttLca = lca2Node(root.right ,n1,n2);
        // leftLCA = val rightLca = null
        if(righttLca ==null){
            return leftLca;
        }
        if(leftLca == null){
            return righttLca;
        }
        return root;
    }
     
    // minimun distance between two node
    public static int lcaDist(Node root , int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);
        if(leftDist ==-1 && rightDist ==-1){
            return -1;
        }else if(leftDist == -1){
            return rightDist+1;
        }else{
            return leftDist+1;
        }
        
    }
    public static int minDist(Node root, int n1,int n2){
        Node lca = lca2Node(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);
        return dist1+dist2;
    }
    // kth ancestor of node
    public static int KAncestor(Node root, int n, int k){
        if (root==null) {
            return -1;
        }
        if(root.data ==n){
            return 0;
        }
        int leftDist = KAncestor(root.left, n, k);
        int rightDist = KAncestor(root.right, n, k);
        if(leftDist ==-1 && rightDist ==-1){
            return -1;
        }
        int max  = Math.max(leftDist, rightDist);
        if(max+1 == k){
            System.out.println(root.data);
        }
        return max+1;
    }

    // transform to sum tree

public static int transform(Node root){
    if(root==null){
        return 0;
    }
    int leftChild = transform(root.left);
    int rightChild = transform(root.right);
    int data =root.data;
    int newLeft = root.left == null ? 0: root.left.data;
    int newRight = root.right == null ? 0: root.right.data;
    root.data = newLeft + leftChild + newRight+rightChild;
    return data;
}
public static void preorder(Node root){
    if(root==null){
        return;
    }
    System.out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);
}
    public static void main(String[] args) {
        Node root  =  new Node(1);
        root.left  = new Node(2);
        root.right  = new Node(3);
        root.left.left  = new Node(4);
        root.left.right  = new Node(5);
        root.right.left  = new Node(6);
        root.right.right  = new Node(7);

        // Node subRoot = new Node(2);
        // subRoot.left = new Node(4);
        //subRoot.right = new Node(5);
     
        // System.out.println(height(root));
        // System.out.println(count(root));
        // System.out.println(sum(root));
        // System.out.println(diameter(root));
        // System.out.println(diameter1(root).diam);
        // System.out.println(diameter1(root).ht);

        //System.out.println(isSubtree(root, subRoot));
        //topView(root);
        // int k = 2;
        // KLevel(root , 1,k);
        // int n1 = 4 , n2 = 5;
        // System.out.println(minDist(root, n1, n2));

        // int n1= 4, k=2;
        // KAncestor(root, n1, k);
        transform(root);
        preorder(root);
    }
}