package Chapter9;
//find a root to leaf  path with specified sum
public class Ques9_6 {

	public static void main(String[] args) {
		Ques9_6 obj=new Ques9_6();
		TreeFunctions tree=new TreeFunctions();
		Node node=tree.createTree();
		System.out.println("Is sum 591 exist= "+ obj.specifiedSum(node,591));
		

	}

	private Boolean specifiedSum(Node node, int remaningSum) {
		if(node==null) {
			return false;
		}
		else if(node.left==null && node.right==null) {
			if(node.data==remaningSum) {
				return true;
			}
		}
		
		return specifiedSum(node.left,remaningSum-node.data)||specifiedSum(node.right,remaningSum-node.data);
	}

}
