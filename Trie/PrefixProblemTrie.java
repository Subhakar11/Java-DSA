public class PrefixProblemTrie {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static void findPrefix(Node node, String ans) {
        if (node == null) {
            return;
        }
        if (node.freq == 1) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < node.children.length; i++) {
            if (node.children[i] != null) {
                findPrefix(node.children[i], ans + (char) (i + 'a'));
            }
        }
    }
public static boolean startWith(String prefix){
    Node curr  = root;
    for(int i=0;i<prefix.length();i++){
        int idx = prefix.charAt(i)-'a';
        if(curr.children[idx] == null){
            return false;
        }
        curr = curr.children[idx];
    }
    return true;
}
    public static void main(String args[]) {
        // String arr[] = {"zebra", "dog", "duck", "dove"};
        // for (int i = 0; i < arr.length; i++) {
        //     insert(arr[i]);
        // }
        // root.freq = -1;
        // findPrefix(root, "");


        String word[] = {"apple", "app", "mango", "man","woman"};
        String prefix1 = "app";
        String prefix2 = "moon";
        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }
        System.out.println(startWith(prefix1));
    }
}
