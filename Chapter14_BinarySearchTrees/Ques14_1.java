package Chapter14_BinarySearchTrees;

import java.util.ArrayDeque;
import java.util.Deque;

//Test if BinaryTree satisfies the BST property
public class Ques14_1 {
	/*		 3
	    2         5	
   1       5	                */	
	public static void main(String[] args) {
		TreeFunctions obj=new TreeFunctions();
	
		//case1: check if its BST
		Node bstTree=obj.createBSTTree();
	/*	//case2: check if its NOT BST
		Node bstTree=obj.createNonBSTTree();*/
		Ques14_1 test=new Ques14_1();
		int min=Integer.MIN_VALUE;
		int max=Integer.MAX_VALUE;
		/*//Using recursion : Time complexity o(n) and Space complexity-o(h)
		if(test.isBST(bstTree,min,max)) {
			System.out.println(" Tree is BST");
		}else {
			System.out.println("Tree is not BST");
		}*/
		//Using Iterative approach
		if(test.isBSTIterative(bstTree)) {
			System.out.println(" Tree is BST");
		}else {
			System.out.println("Tree is not BST");
		}

	}

	private boolean isBSTIterative(Node root) {
		Deque<Node> alist=new ArrayDeque<Node>();
		int prev=Integer.MIN_VALUE;
		while(!alist.isEmpty()|| root !=null ) {
			if(root!=null) {
				alist.addFirst(root);
				root=root.left;
			}else {
				Node curr=alist.pollFirst();
				if(prev>curr.data) {
					return false;
				}
				prev=curr.data;
				root=curr.right;
			}
		}
		return true;
	}

	private boolean isBST(Node bstTree, int min, int max) {
		if(bstTree==null) {
			return true;
		}
		if(min>bstTree.data ||bstTree.data>max ) {
			return false;
		}
		return isBST(bstTree.left,min,bstTree.data)&& isBST(bstTree.right,bstTree.data,max);
	}

}
