public class Ques2 {
	public static class TreeNode
	{
		int data;
		TreeNode left;
		TreeNode right;
		TreeNode(int data)
		{
			this.data=data;
		}
	}
 
	public static boolean search(TreeNode root,TreeNode nodeSearched)
	{
		if(root==null)
			return false;
		if(root.data== nodeSearched.data)
		{
			return true;
		}
		boolean result=false;
		if(root.data > nodeSearched.data)
			result=search(root.left,nodeSearched);
		else if(root.data < nodeSearched.data)
			result= search(root.right,nodeSearched);
		return result;
	}
 
	public static TreeNode minimumElement(TreeNode root)
	{
		if(root.left==null)
			return root;
		else
		{
			return minimumElement(root.left);
		}
	}
 
	public static TreeNode maximumElement(TreeNode root)
	{
		if(root.right==null)
			return root;
		else
		{
			return maximumElement(root.right);
		}
	}
	public static TreeNode insert(TreeNode root,TreeNode nodeInserted)
	{
		if(root==null)
		{
			root=nodeInserted;
			return root;
		}
 
		if(root.data > nodeInserted.data)
		{
			if(root.left==null)
				root.left=nodeInserted;
			else
				insert(root.left,nodeInserted);
		}
		else if(root.data < nodeInserted.data)
			if(root.right==null)
				root.right=nodeInserted;
			else
				insert(root.right,nodeInserted);
		return root;
	} 
 
	public static void inOrder(TreeNode root)
	{
		if(root==null)
			return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	public static void main(String[] args)
	{
 
		TreeNode rootNode=createBinarySearchTree();
		System.out.println("Minimum element : "+minimumElement(rootNode).data);
		System.out.println("Maximum element : "+maximumElement(rootNode).data);
 
	}   
 
 
	public static TreeNode createBinarySearchTree()
	{
		TreeNode rootNode =new TreeNode(40);
		TreeNode node14=new TreeNode(14);
		TreeNode node17=new TreeNode(17);
		TreeNode node98=new TreeNode(98);
		TreeNode node74=new TreeNode(74);
		TreeNode node23=new TreeNode(23);
		TreeNode node65=new TreeNode(65);
		TreeNode node07=new TreeNode(07);
		TreeNode node4=new TreeNode(4);
 
		insert(null,rootNode);
		insert(rootNode,node14);
		insert(rootNode,node17);
		insert(rootNode,node98);
		insert(rootNode,node74);
		insert(rootNode,node23);
		insert(rootNode,node65);
		insert(rootNode,node07);
		insert(rootNode,node4);
 
		return rootNode;
	}

}