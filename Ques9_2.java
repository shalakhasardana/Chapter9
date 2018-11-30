package Chapter9;
//Test if a binary tree is symmetric
public class Ques9_2 {

	public static void main(String[] args) {
		Ques9_2 obj=new Ques9_2();
		TreeFunctions tree=new TreeFunctions();
		//if(obj.isSymmetric(tree.createSymmetricTree())) {
		if(obj.isSymmetric(tree.createNotSymmetricTree())) {
			System.out.println("Tree is symmetric");
		}else {
			System.out.println("Tree is not symmetric");
		}

	}

	private Boolean isSymmetric(Node root) {
		if(root==null) {
			return true;
		}
		if(check(root.left,root.right)) {
			return true;
		}
		return false;
	}

	private boolean check(Node n1, Node n2) {
		if(n1==null && n2==null) {
			return true;
		}
		if(n1==null|| n2==null) {
			return false;
		}
		if(n1.data!=n2.data) {
			return false;
		}
		return check(n1.left,n2.right)&&check(n1.right,n2.left);
	}

}
