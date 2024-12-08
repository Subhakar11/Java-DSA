import java.util.*;
public class Trie{
static class Node{
    Node children[] = new Node[26];
    boolean eow = false; // end of words

    Node(){
        for(int i = 0;i<26;i++){
            children[i] = null;
        }
    }
}
public static Node root = new Node();
public static void insert(String word){
    Node curr = root;
    for(int level =0;level<word.length();level++){ //O(L) L = largest word length
        int idx = word.charAt(level)-'a';
        if(curr.children[idx]==null){
            curr.children[idx] = new Node();
        }
        curr = curr.children[idx];
    }
     curr.eow = true;
}
public static boolean search(String key){
    Node curr = root;
    for(int level =0;level<key.length();level++){ //O(L) L = largest word length
        int idx = key.charAt(level)-'a';
        if(curr.children[idx]==null){
            return false;
        }
        curr = curr.children[idx];
    }
    return curr.eow == true;
}

public static int countNode(Node root){
    if(root == null){
        return 0;
    }
    int count =0;
    for(int i=0;i<26;i++){
        if(root.children[i] !=null){
            count += countNode(root.children[i]);
        }
    }
    return count +1;
}

public static String ans = "";
public static void longestWord(Node root,StringBuilder temp){
    if(root == null){
        return;
    }
    for(int i=0;i<26;i++){
        if(root.children[i] != null && root.children[i].eow == true){
            char ch = (char)(i+'a');
            temp.append(ch);
            if(temp.length()>ans.length()){
                ans = temp.toString();
            }
            longestWord(root.children[i], temp);
            temp.deleteCharAt(temp.length()-1); // bracktrack
        }
    }
}

public static void main(String args[]){
    // String words[] = {"the","a","there","their","any","thee"};
    // for(int i=0;i<words.length;i++){
    //     insert(words[i]);
    // }
    // System.out.println(search("thee"));
    // System.out.println(search("thor"));

    // String str = "ababa";  
    // ans  = 10
    // for(int i=0;i<str.length();i++){
    //     String suffix = str.substring(i);
    //     insert(suffix);
    // }
    // System.out.println(countNode(root));
 String words[] = {"a","banana","app","appl","ap","apply","apple"};
 for(int i=0;i<words.length;i++){
        insert(words[i]);
     }
     longestWord(root, new StringBuilder(""));
     System.out.println(ans);
}
}