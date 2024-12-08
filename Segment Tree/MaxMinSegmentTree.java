public class MaxMinSegmentTree {
    static int tree[];
    public static void init(int n){
        tree  = new int [4*n];
    }
    public static void buildST(int arr[],int i, int start,int end){
        if(start == end){
            tree[i] = arr[start];
            return;
        }
        int mid = (start+end)/2;
        buildST(arr, 2*i+1, start, mid);
        buildST(arr, 2*i+2, mid+1, end);
        tree[i] = Math.max(tree[2*i+1] ,tree[2*i+2]);
        
    } 
public static int getMax(int arr[],int qi,int qj){
    int n= arr.length;
    return getMaxUtil(0,0,n-1, qi, qj);
}
public static int getMaxUtil(int i,int si,int sj,int qi,int qj){
    if(si>qj|| sj<qi) { // no overlap
        return Integer.MIN_VALUE;
    } else if(si>=qi && sj<= qj){ // complete overlap
        return tree[i];
    }else {
        int mid =(si+sj)/2;
        int leftAns = getMaxUtil(2*i+1, si, mid, qi, qj);
        int rightAns = getMaxUtil(2*i+2, mid+1, sj, qi, qj);
        return Math.max(leftAns, rightAns);
    }
}

public static void update(int arr[],int idx,int newVal){
    arr[idx]= arr.length;
    int n = arr.length;
    updateUtil(0,0,n-1, idx, newVal);
}
public static void updateUtil(int i,int si,int sj,int idx,int newVal){
    if(idx<si|| idx>sj){
        return;
    }
    tree[i] = Math.max(tree[i], newVal);

    if(si!=sj){
        int mid = (si+sj)/2;
    updateUtil(2*i+1, si, mid, idx, newVal);
    updateUtil(2*i+2, mid+1,sj, idx, newVal);
    }
    
}

// we want to min then whole code will be same small change every  max=min 
public static int getmin(int arr[],int qi,int qj){
    int n= arr.length;
    return getminUtil(0,0,n-1, qi, qj);
}
public static int getminUtil(int i,int si,int sj,int qi,int qj){
    if(si>qj|| sj<qi) { // no overlap
        return Integer.MAX_VALUE;
    } else if(si>=qi && sj<= qj){ // complete overlap
        return tree[i];
    }else {
        int mid =(si+sj)/2;
        int leftAns = getminUtil(2*i+1, si, mid, qi, qj);
        int rightAns = getminUtil(2*i+2, mid+1, sj, qi, qj);
        return Math.min(leftAns, rightAns);
    }
}

public static void updatemin(int arr[],int idx,int newVal){
    arr[idx]= arr.length;
    int n = arr.length;
    updateminUtil(0,0,n-1, idx, newVal);
}
public static void updateminUtil(int i,int si,int sj,int idx,int newVal){
    if(idx<si|| idx>sj){
        return;
    }
    if(si==sj){
        tree[i] = newVal;
    }
    
    if(si!=sj){
        tree[i] = Math.min(tree[i], newVal);

        int mid = (si+sj)/2;
    updateminUtil(2*i+1, si, mid, idx, newVal);
    updateminUtil(2*i+2, mid+1,sj, idx, newVal);
    }
    
}
    public static void main(String[] args) {
        
    
    int arr[] = {6,8,-1,2,17,1,3,2,4};
    int n= arr.length;
    init(n);
   buildST(arr, 0, 0, n-1);
    for(int i=0;i<tree.length;i++){
        System.out.print(tree[i]+" ");
    } 
//     System.out.println();
//     int max = getMax(arr, 2, 5);
//     System.out.println(max);

//     update(arr, 2, 20);
// System.out.println();
//     int max1 = getMax(arr, 2, 5);
//     System.out.println(max1);
//     } 

    System.out.println();
    int min = getmin(arr, 2, 5);
    System.out.println(min);

    updatemin(arr, 2, 20);
System.out.println();
    int min1 = getmin(arr, 2, 5);
    System.out.println(min1);
    } 
}
