package Chapter9;

import java.util.ArrayList;
import java.util.List;

public class Ques9_14 {

	public static void main(String[] args) {
		TreeFunctions tree=new TreeFunctions();
		Node root=tree.createLCAUsingParentPointer();
		List<Node> list=new ArrayList<Node>();
		computeLeaveNode(root,list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).data);
		}

	}

	private static void computeLeaveNode(Node root, List<Node> list) {
		if(root==null) {
			return;
		}
		if(root.left==null && root.right==null) {
			list.add(root);
		}
		computeLeaveNode(root.left,list);
		computeLeaveNode(root.right,list);
		
	}

}
