package Chapter9;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

//Implement an Inorder traversal without recusion.
public class Ques9_7 {

	public static void main(String[] args) {
		Ques9_7 obj=new Ques9_7();
		TreeFunctions tree=new TreeFunctions();
		Node node=tree.createTree();
		Deque<Node> deque=null;
		List<Node> alist=null;
		List<Node> result=obj.bstInorder(node,deque,alist);
		for(int i=0;i<result.size();i++) {
			System.out.println(result.get(i).data);
		}

	}

	private List<Node> bstInorder(Node node, Deque<Node> deque, List<Node> alist) {
		 deque=new ArrayDeque<Node>();
		 alist=new ArrayList<Node>();
		 while(!deque.isEmpty()|| node!=null) {
			 if(node!=null) {
				 deque.addLast(node);
				 node=node.left;
			 }else {
				 Node temp=deque.removeLast();
				 alist.add(temp);
				 node=temp.right;
			 }
		 }
		return alist;
	}

}
