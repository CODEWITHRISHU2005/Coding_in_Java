
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTrees {

    static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {

        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preorderTraversal(Node root) { //0(n)
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }

        public static void inorderTraversal(Node root) { // 0(n)
            if (root == null) {
                return;
            }

            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }

        public static void postOrderTraversal(Node root) { // 0(n)
            if (root == null) {
                return;
            }

            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelOrderTraversal(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        public static int countOfNodes(Node root) { // 0(n)
            if (root == null) {
                return 0;
            }

            int left = countOfNodes(root.left);
            int right = countOfNodes(root.right);

            return left + right + 1;
        }

        public static int sumOfAllNodes(Node root) { // 0(n)
            if (root == null) {
                return 0;
            }

            int leftSum = sumOfAllNodes(root.left);
            int rightSum = sumOfAllNodes(root.right);

            return leftSum + rightSum + root.data;
        }

        public static int heightOfTree(Node root) { // 0(n)
            if (root == null) {
                return 0;
            }

            int leftHeight = heightOfTree(root.left);
            int rightHeight = heightOfTree(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }

        public static int diameterOfTree(Node root) { // 0(n^2)
            if (root == null) {
                return 0;
            }

            int leftDiameter = diameterOfTree(root.left); // diameter of left subtree
            int rightDiameter = diameterOfTree(root.right); // diameter of right subtree
            int diameter = heightOfTree(root.left) + heightOfTree(root.right) + 1; // diameter pass through root

            return Math.max(diameter, Math.max(leftDiameter, rightDiameter));
        }

        static class Pair<U, V> {

            public final U first;
            public final V second;

            public Pair(U first, V second) {
                this.first = first;
                this.second = second;
            }
        }

        public static Pair<Integer, Integer> diameterOptimized(Node root) { // 0(n)
            if (root == null) {
                return new Pair<>(0, 0);
            }

            Pair<Integer, Integer> leftPair = diameterOptimized(root.left); // Pair of height and diameter of left subtree
            Pair<Integer, Integer> rightPair = diameterOptimized(root.right); // Pair of height and diameter of right subtree

            int myDiameter = leftPair.first + rightPair.first + 1;
            int myHeight = Math.max(leftPair.first, rightPair.first) + 1;

            int finalDiameter = Math.max(myDiameter, Math.max(leftPair.second, rightPair.second));

            return new Pair<>(finalDiameter, myHeight);
        }

        public void kthLevelTraversal(Node root, int k) { // 0(n)
            // Traverses the tree and prints all nodes at the kth level
            if (root == null) {
                return;
            }

            if (k == 0) {
                System.out.print(root.data + " ");
                return;
            }

            kthLevelTraversal(root.left, k - 1);
            kthLevelTraversal(root.right, k - 1);
        }

        public void topView(Node root) {
            Queue<Pair<Node, Integer>> queue = new LinkedList<>(); // Pair of Node and its HD from root
            HashMap<Integer, Integer> map = new HashMap<>(); // To store HD & node.data
            queue.add(new Pair<>(root, 0));

            while (!queue.isEmpty()) {
                Node currentNode = queue.peek().first;
                int currHD = queue.peek().second;
                queue.remove();

                if (!map.containsKey(currHD)) {
                    map.put(currHD, currentNode.data);
                }

                if (currentNode.left != null) {
                    queue.add(new Pair<>(currentNode.left, currHD - 1));
                }

                if (currentNode.right != null) {
                    queue.add(new Pair<>(currentNode.right, currHD + 1));
                }
            }

            for (int i = map.keySet()
                    .stream()
                    .min(Integer::compareTo)
                    .orElse(0);
                    i <= map.keySet()
                            .stream()
                            .max(Integer::compareTo)
                            .orElse(0); i++) {
                System.out.print(map.get(i) + " ");
            }
        }

        public int sumTree(Node root) {
            if(root == null) {
                return 0;
            }

            int leftSum = sumTree(root.left);
            int rightSum = sumTree(root.right);
            int totalSum = leftSum + rightSum + root.data;
            root.data = totalSum;

            return totalSum;
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        Node root = BinaryTree.buildTree(nodes);
        System.out.println(root.data);

        System.out.println("Preorder Traversal: ");
        BinaryTree.preorderTraversal(root);
        System.out.println();

        System.out.println("Inorder Traversal: ");
        BinaryTree.inorderTraversal(root);
        System.out.println();

        System.out.println("Postorder Traversal: ");
        BinaryTree.postOrderTraversal(root);
        System.out.println();

        System.out.println("Level Order Traversal: ");
        BinaryTree.levelOrderTraversal(root);

        System.out.println("Number of nodes: " + BinaryTree.countOfNodes(root));
        System.out.println("Sum of all nodes: " + BinaryTree.sumOfAllNodes(root));
        System.out.println("Height of tree: " + BinaryTree.heightOfTree(root));
        System.out.println("Diameter of tree: " + BinaryTree.diameterOfTree(root));
        System.out.println("Diameter of tree (Optimized): " + BinaryTree.diameterOptimized(root).first);
        System.out.println("Kth Level Traversal: ");
        BinaryTree tree = new BinaryTree();
        tree.kthLevelTraversal(root, 2);            
        System.out.println();


        System.out.println("Top View of the tree: ");
        tree.topView(root);
        System.out.println();

        System.out.println("Sum Tree: " + tree.sumTree(root));
        System.out.println("Level Order Traversal after Sum Tree: ");
        BinaryTree.levelOrderTraversal(root);
    }
}
