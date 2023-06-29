import java.util.*;

public class ConvertBstToBalancedBst {
  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
    }
  }

  public static void preorder(Node root) {
    if (root == null) {
      return;
    }

    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
  }

  public static Node createBST(int arr[], int st, int end) {

    // base case
    if (st > end) { // invalid condition
      return null;
    }

    // mid index
    int mid = (st + end) / 2;
    Node root = new Node(arr[mid]);
    root.left = createBST(arr, st, mid - 1);
    root.right = createBST(arr, mid + 1, end);
    return root;
  }

  // convert bst to balanced bst
  public static void getInorder(Node root, ArrayList<Integer> inorder) {
    if (root == null) {
      return;
    }

    getInorder(root.left, inorder);
    inorder.add(root.data);
    getInorder(root.right, inorder);
  }

  public static Node createBST(ArrayList<Integer> inorder, int st, int end) {
    // base case
    if (st > end) {
      return null;
    }

    int mid = (st + end) / 2;
    Node root = new Node(inorder.get(mid));
    root.left = createBST(inorder, st, mid - 1);
    root.right = createBST(inorder, mid + 1, end);
    return root;

  }

  public static Node balancedBST(Node root) {
    // inorder seq
    ArrayList<Integer> inorder = new ArrayList<>();
    getInorder(root, inorder);

    // sorted inorder -> balanced BST
    root = createBST(inorder, 0, inorder.size() - 1);
    return root;
  }

  public static void main(String[] args) {
    Node root = new Node(8);
    root.left = new Node(6);
    root.left.left = new Node(5);
    root.left.left.left = new Node(3);

    root.right = new Node(10);
    root.right.right = new Node(11);
    root.right.right.right = new Node(12);

    root = balancedBST(root);
    preorder(root);
  }
}
