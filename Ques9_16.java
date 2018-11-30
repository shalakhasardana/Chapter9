package Chapter9;
//Compute Right Sibling
public class Ques9_16 {

	public static void main(String[] args) {
		TreeFunctions tree=new TreeFunctions();
		Node root=tree.createLCA();
		computeRightSibling(root);

	}

	private static void computeRightSibling(Node root) {
	while(root!=null && root.left!=null) {
		rightSiblingUtil(root);
		root=root.left;
	}
		
	}

	private static void rightSiblingUtil(Node root) {
		if(root.left!=null ) {
			root.left.nextright=root.right;
		}
		if(root.nextright!=null) {
			root.right.nextright=root.nextright.left;
			rightSiblingUtil(root.nextright);
		}
		
	}

}
