package Chapter9;

import java.util.ArrayDeque;
import java.util.Deque;

//Implement Preorder traversal without using recursion
public class Ques9_8 {

	public static void main(String[] args) {
			Ques9_7 obj=new Ques9_7();
			TreeFunctions tree=new TreeFunctions();
			Node node=tree.createTree();
			Deque<Node> deque=new ArrayDeque();;
			bstPreOrderTravesal(node,deque);

	}

	private static void bstPreOrderTravesal(Node node, Deque<Node> deque) {
		if(node ==null) {
			return;
		}
		while(!deque.isEmpty()|| (node !=null)) {
			if(node!=null) {
				System.out.println(node.data);
					if(node.right!=null) {
						deque.addLast(node.right);						
					}
				node=node.left;
			}else {
			    node=deque.removeLast();
			}
		}
		
	}

}
