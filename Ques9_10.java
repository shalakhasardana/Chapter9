package Chapter9;
//compute the successor
public class Ques9_10 {

	public static void main(String[] args) {
		TreeFunctions tree=new TreeFunctions();
		Node root=tree.inOrderSuccessor();
		Node node1=root.left;
		Node node2=root.left.right.left;
		Node node3=root.left.right.right;
		Node node4=root.right;
		Ques9_10 obj=new Ques9_10();
		System.out.println("inorder successor of 8 "+ obj.calInorderSucc(node1).data);
		System.out.println(" inorder successor of 10 is"+obj.calInorderSucc(node2).data);
		System.out.println(" inorder successor of 14 is"+obj.calInorderSucc(node3).data);
		System.out.println(" inorder successor of 22 is"+obj.calInorderSucc(node4));

	}

	private Node calInorderSucc( Node node) {
		if(node==null) {
			return null;
		}
		if(node.right!=null) {
			Node temp=node.right;
			while(temp.left!=null) {
				temp=temp.left;
			}
			return temp;
		}
		
		
		Node parent=node.parent;
		if(parent.left==node) {
			return parent;
		}
		while(parent !=null && parent.right==node) {
			node=parent;
			parent=node.parent;
		}
		return parent;
		
	}

}
