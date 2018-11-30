package Chapter9;
//Implement an inorder traversal with 0(1) space
public class Ques9_11 {

	public static void main(String[] args) {
		TreeFunctions tree=new TreeFunctions();
		Node root=tree.inOrderSuccessor();
		inorderTraversal(root);
	}

	private static void inorderTraversal(Node root) {
	Boolean leafNode=false;
	while(root!=null) {
	if(!leafNode) {
	while(root.left!=null) {
		root=root.left;
	}
	}
	System.out.println(root.data);
	leafNode=true;
	if(root.right!=null) {
		leafNode=false;
		root=root.right;
	}else if(root.parent!=null) {
		if(root.parent!=null && root.parent.right==root) {
			while(root.parent!=null &&root.parent.right==root) {
				root=root.parent;
			}
		}
		if(root.parent==null) {
			return;
		}
		
		root=root.parent;
	}
	}
	}
}
