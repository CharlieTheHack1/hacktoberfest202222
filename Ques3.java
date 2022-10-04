import java.util.ArrayList;

public class Ques3 {
	 public static void main(String[] args) {
	        Tree tree = new Tree();
	        tree.createSampleTree();
	        tree.printRootToLeafPaths();
	    }
	}
	 
	class Tree {
	     
	    private TreeNode root;
	 
	    public TreeNode getRoot() {
	        return root;
	    }
	 
	    public void printRootToLeafPaths() {
	        if(root == null) {
	            return;
	        }
	        ArrayList<Integer> path = new ArrayList<Integer>();
	        printRootToLeafPaths(root, path);
	    }
	 
	    private void printRootToLeafPaths(TreeNode root, ArrayList<Integer> path) {
	        path.add(root.getData());
	         
	        if(root.getLeft() == null && root.getRight() == null) {
	            printList(path);
	            return;
	        }
	        printRootToLeafPaths(root.getLeft(),new ArrayList<Integer>(path));
	        printRootToLeafPaths(root.getRight(),new ArrayList<Integer>(path));
	    }
	 
	    private void printList(ArrayList<Integer> path) {
	        for(Integer i: path) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }
	 
	    public void setRoot(TreeNode root) {
	        this.root = root;
	    }
	     
	  
	    public void createSampleTree() {
	        root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), new TreeNode(7)));       
	    }
	}
	 
	class TreeNode {
	 
	    private int data;
	    private TreeNode left;
	    private TreeNode right;
	 
	    public TreeNode(int data, TreeNode left, TreeNode right) {
	        this.data = data;
	        this.left = left;
	        this.right = right;
	    }
	 
	    public TreeNode(int i) {
	        data = i;
	    }
	 
	    public int getData() {
	        return data;
	    }
	 
	    public void setData(int data) {
	        this.data = data;
	    }
	 
	    public TreeNode getLeft() {
	        return left;
	    }
	 
	    public void setLeft(TreeNode left) {
	        this.left = left;
	    }
	 
	    public TreeNode getRight() {
	        return right;
	    }
	 
	    public void setRight(TreeNode right) {
	        this.right = right;
	    }
	}