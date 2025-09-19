
public class LargestBST {

    static class Node {

        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static class Info {

        int min;
        int max;
        int size;

        public Info(int min, int max, int size) {
            this.min = min;
            this.max = max;
            this.size = size;
        }
    }

    Info largestBSTUtil(Node root) { // 0(n)
        if (root == null) {
            return new Info(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }

        Info leftInfo = largestBSTUtil(root.left);
        Info rightInfo = largestBSTUtil(root.right);

        if (leftInfo.max < root.data && rightInfo.min > root.data) {
            return new Info(Math.min(leftInfo.min, root.data), Math.max(rightInfo.max, root.data), leftInfo.size + rightInfo.size + 1);
        }

        return new Info(Integer.MIN_VALUE, Integer.MAX_VALUE, Math.max(leftInfo.size, rightInfo.size));
    }

    int largestBST(Node root) {
        return largestBSTUtil(root).size;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(1);
        root.left.right = new Node(8);
        root.right.right = new Node(7);

        LargestBST largestBST = new LargestBST();
        System.out.println("Size of the largest BST is " + largestBST.largestBST(root));
    }
}
