package Chapter9;
//Test If Binary Tree Height is balanced.
public class Ques9_1 {
    //Time Complexity-o(n)  Space complexity-o(h)
	
	public static void main(String[] args) {
		
		TreeFunctions obj=new TreeFunctions();
		Node temp=obj.createNotBalancedTree();
		if(isBalanced(temp)==-1) {
			System.out.println("Tree is not balanced");
		}else {
			System.out.println("Tree is balanced");
		}

	}

	private static int isBalanced(Node temp) {
		if(temp==null) {
			return 0;
		}
		
		int leftHeight=isBalanced(temp.left);
		if(leftHeight==-1) {
			return -1;
		}
		int rightHeight=isBalanced(temp.right);
		if(rightHeight==-1) {
			return -1;
		}
		
		int diff=Math.abs(Math.abs(leftHeight)-Math.abs(rightHeight));
		if(diff>1) {
			return -1;
		}
		return Math.max(leftHeight, rightHeight)+1;
	}

}
