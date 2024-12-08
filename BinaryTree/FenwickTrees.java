public class FenwickTrees{
     static class FenwickTree {
        private int[] tree;
    
        public FenwickTree(int size) {
            tree = new int[size + 1];
        }
    
        // Update the value at index i by delta
        public void update(int i, int delta) {
            while (i < tree.length) {
                tree[i] += delta;
                i += i & -i; // Move to next node (next node with different last set bit)
            }
        }
    
        // Get the sum of elements from index 1 to i
        public int query(int i) {
            int sum = 0;
            while (i > 0) {
                sum += tree[i];
                i -= i & -i; // Move to parent node (node with different last set bit)
            }
            return sum;
        }
    
        // Get the sum of elements from index start to end
        public int rangeQuery(int start, int end) {
            return query(end) - query(start - 1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, -1, 6, 5, 4, -3, 2, 1, 8};
        FenwickTree fenwickTree = new FenwickTree(arr.length);

        // Construct the Fenwick Tree
        for (int i = 1; i <= arr.length; i++) {
            fenwickTree.update(i, arr[i - 1]);
        }

        // Perform prefix sum query
        int sum = fenwickTree.rangeQuery(1, 5);
        System.out.println("Prefix sum from index 1 to 5: " + sum);

        // Update an element
        int indexToUpdate = 3;
        int newValue = 10;
        int oldValue = arr[indexToUpdate - 1];
        arr[indexToUpdate - 1] = newValue;
        fenwickTree.update(indexToUpdate, newValue - oldValue);

        // Perform prefix sum query after update
        sum = fenwickTree.rangeQuery(1, 5);
        System.out.println("Prefix sum from index 1 to 5 after update: " + sum);
    }
}