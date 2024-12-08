import java.util.*;

public class BST {
    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // left subtree
            root.left = insert(root.left, val);
        } else {
            // right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // find node
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int val) {
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else { // voila
                 // case 1 - leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2 one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // case 3 both children
            Node Is = findInorderSuccessor(root.right);
            root.data = Is.data;
            root.right = delete(root.right, Is.data);

        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // print node of given range
    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.left, k1, k2);
        } else {
            printInRange(root.right, k1, k2);
        }
    }

    // print root to leaf node
    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("null");
    }

    public static void printRoottoLeaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);

        }
        printRoottoLeaf(root.left, path);
        printRoottoLeaf(root.right, path);
        path.remove(path.size() - 1);
    }

    // validate binary search tree
    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        } else if (max != null && root.data >= max.data) {
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    // mirror of bimary search tree
public static Node  mirror(Node root){
    if(root == null){
        return null;
    }
    Node  leftmirror = mirror(root.left);
    Node rightmirror = mirror(root.right);

    root.left = rightmirror;
    root.right = leftmirror;
    return root;

}
    
// sorted array to  create balanced binary search tree

public static Node createBST(int arr[],int st,int end){
    if(st>end){
        return null;
    }
    int mid = (st+end)/2;
    Node root = new Node(arr[mid]);
    root.left = createBST(arr, st, mid-1);
    root.right = createBST(arr, mid+1, end);
    return root;
}

    public static void main(String[] args) {
        // int values[] = { 5, 1, 3, 4, 2, 7 };
        // Node root = null;
        // for (int i = 0; i < values.length; i++) {
        //     root = insert(root, values[i]);
        // }
        // inorder(root);
        // System.out.println();
        // if(search(root, 1)){
        // System.out.println("found");
        // } else{
        // System.out.println("Not found");
        // }
        // root = delete(root, 1);
        // System.out.println(root.data);
        // inorder(root);
        // printInRange(root, 1, 4);
        // printRoottoLeaf(root, new ArrayList<>());

    //     if (isValidBST(root, null, null)) {
    //         System.out.println("valid");
    //     } else {
    //         System.out.println("Not valid");
    //     }

    //    root =  mirror(root);
    //     inorder(root);

    int arr[] = {3,5,6,8,10,11,12};
    Node root= createBST(arr, 0, arr.length-1);
    inorder(root);
    }
}
