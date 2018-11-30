package Chapter9;
//sum the root to leaf paths in a binary tree
public class Ques9_5 {

	public static void main(String[] args) {
		Ques9_5 obj=new Ques9_5();
		TreeFunctions tree=new TreeFunctions();
		Node node=tree.createMSB();
		obj.computeSum(node,0);
	}

	private void computeSum(Node node, int partialSum) {
		if(node==null) {
			return;
		}
		if(node.left==null && node.right==null) {
			partialSum=partialSum*10+node.data;
			System.out.println(partialSum);
			return ;
		}
		 partialSum=partialSum*10+node.data;
		 computeSum(node.left,partialSum);
		 computeSum(node.right,partialSum);
	}

}
