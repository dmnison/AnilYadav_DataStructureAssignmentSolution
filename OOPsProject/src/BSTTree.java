import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;
 
// A class to store a BST node
class BSTTree
{
    int data;
    BSTTree left = null, right = null;
 
    BSTTree(int data) {
        this.data = data;
    }
}
 
class Main
{
    // Function to perform inorder traversal on the tree
    public static void inorder(BSTTree root)
    {
        if (root == null) {
            return;
        }
 
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
 
    // Function to traverse the binary tree and store its keys in a set
    public static void extractKeys(BSTTree root, Set<Integer> set)
    {
        // base case
        if (root == null) {
            return;
        }
 
        extractKeys(root.left, set);
        set.add(root.data);
        extractKeys(root.right, set);
    }
 
    // Function to put keys back into a set in their correct order in the BST
    // by doing inorder traversal
    public static void convertToBST(BSTTree root, Iterator<Integer> it)
    {
        if (root == null) {
            return;
        }
 
        convertToBST(root.left, it);
        root.data = it.next();
        convertToBST(root.right, it);
    }
 
    // Function to convert a binary tree to BST by maintaining its original structure
    public static void convertToBST(BSTTree root)
    {
        // traverse the binary tree and store its keys in a set
        Set<Integer> set = new TreeSet<>();
        extractKeys(root, set);
 
        // put back keys present in the set to their correct order in the BST
        Iterator<Integer> it = set.iterator();
        convertToBST(root, it);
    }
 
    public static void main(String[] args)
    {
        
 
    	BSTTree root = new BSTTree(50);
        root.left = new BSTTree(30);
        root.right = new BSTTree(60);
        root.left.left = new BSTTree(10);
        root.right.left = new BSTTree(55);
        
        convertToBST(root);
        inorder(root);
    }
}
