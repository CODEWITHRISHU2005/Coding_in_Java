
public class BinarySearchTree {

    /*
     * Binary Search Tree (BST) is a binary tree where each node has a key, and the keys in the left subtree are less than the node's key,
     * while the keys in the right subtree are greater than the node's key. This property allows for efficient searching, insertion, and deletion operations.
     * Inorder traversal of a BST results in a sorted sequence of keys.
     */
    public static class Node {

        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

    public Node insert(Node root, int key) { // 0(logn) <=0(H) <= 0(n) logn for balanced tree and n for skewed tree
        // If the tree is empty, create a new node and return it
        if (root == null) {
            return new Node(key);
        }

        // If the key is already present in the tree, do not insert it again
        if (root.key == key) {
            System.out.println("Data already exists in the BST: " + key);
            return root;
        }

        // If the key is less than or equal to the root's key, insert it in the left subtree
        if (key < root.key) {
            root.left = insert(root.left, key);
            // If the key is greater than the root's key, insert it in the right subtree
        } else if (key > root.key) {
            root.right = insert(root.right, key);
        }

        return root; // Return the unchanged root pointer
    }

    public boolean searchBST(Node root, int key) { // 0(logn) <=0(H) <= 0(n) logn for balanced tree and n for skewed tree
        // Base case: If the root is null, the key is not found
        if (root == null) {
            return false;
        }

        // If the key is found, return true
        if (root.key == key) {
            return true;
        }

        return root.key < key ? searchBST(root.right, key) : searchBST(root.left, key);
    }

    public Node delete(Node root, int key) {
        // Base case: If the root is null, the key is not found
        if (root == null) {
            return root;
        }

        if (root.key > key) {
            root.left = delete(root.left, key);
        } else if (root.key < key) {
            root.right = delete(root.right, key);
        } else { // root.key == key

            // Case 1:- Node with no child (leaf node)
            // Delete the node by returning null
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2:- Node with only one child or no child
            // If the node has only one child, return that child to bypass the deleted node
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3:- Node with two children: Get the inorder successor (smallest in the right subtree)
            // Replace the key of the node to be deleted with the inorder successor's key
            // and delete the inorder successor
            Node IS = inorderSuccessor(root.right);
            root.key = IS.key; // Copy the inorder successor's content to this node
            root.right = delete(root.right, IS.key); // Delete the inorder successor
        }

        return root; // Return the unchanged root pointer
    }

    private Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left; // Find the leftmost node
        }

        return root; // Return the leftmost node, which is the inorder successor
    }

    public void inorderTraversal(Node root) { // 0(n)
        if (root == null) {
            return;
        }

        inorderTraversal(root.left); // Visit left subtree
        System.out.print(root.key + " "); // Visit root    
        inorderTraversal(root.right); // Visit right subtree
    }

    public void printInRange(Node root, int low, int high) { // 0(n)
        if (root == null) {
            return;
        }

        // If the current node's key is within the range, print it  
        if (root.key >= low && root.key <= high) {
            printInRange(root.left, low, high);
            System.out.print(root.key + " ");
            printInRange(root.right, low, high);
        } // If the current node's key is greater than the upper bound (high), search only in the left subtree
        else if (root.key > high) {
            printInRange(root.left, low, high);
        } // If the current node's key is less than the lower bound (low), search only in the right subtree
        else if (root.key < low) {
            printInRange(root.right, low, high);
        }
    }

    public void printTwoLeaf(Node root, java.util.List<Integer> path) { // 0(n)
        if (root == null) {
            return;
        }

        // Add the current node's key to the path
        path.add(root.key);

        // If it's a leaf node, print the path
        if (root.left == null && root.right == null) {
            System.out.print("Leaf path: ");
            path.forEach(e -> System.out.print(e + "->"));
            System.out.println("null");
        } else {
            printTwoLeaf(root.left, path);
            printTwoLeaf(root.right, path);
        }
        path.remove(path.size() - 1); // Backtrack step to explore other paths
    }

    public static void main(String[] args) {
        int key[] = {8, 5, 3, 1, 4, 6, 10, 11, 14, 15};
        Node root = null;

        // Create a Binary Search Tree and insert the key
        BinarySearchTree bst = new BinarySearchTree();
        for (int i = 0; i < key.length; i++) {
            root = bst.insert(root, key[i]);
        }

        // Print the inorder traversal of the BST
        System.out.println("Inorder Traversal of the BST:");
        bst.inorderTraversal(root);
        System.out.println();

        // Search for a key in the BST
        int searchKey = 10;
        boolean found = bst.searchBST(root, searchKey);
        if (found) {
            System.out.println("Key " + searchKey + " found in the BST.");
        } else {
            System.out.println("Key " + searchKey + " not found in the BST.");
        }

        // Delete a key from the BST
        int deleteKey = 10;
        root = bst.delete(root, deleteKey);
        System.out.println("Inorder Traversal after deleting key " + deleteKey + ":");
        bst.inorderTraversal(root);
        System.out.println();

        // Print keys in a given range
        int low = 5, high = 15;
        System.out.println("Keys in the range [" + low + ", " + high + "]:");
        bst.printInRange(root, low, high);
        System.out.println();

        bst.printTwoLeaf(root, new java.util.ArrayList<>());
    }
}
