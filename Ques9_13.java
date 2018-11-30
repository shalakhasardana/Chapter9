package Chapter9;
import java.util.ArrayList;
import java.util.Arrays;
//You are given pre-order traversal with a slight modification. It includes null pointers when a particular node has nil left/right child. Reconstruct the binary tree with this information.
import java.util.List;

public class Ques9_13 {

	private static Integer subtreeIdx;
	
	public static Node reconstructPreorder(List<Integer> preorder) {
		subtreeIdx=0;
		Node tree= reconstructPreorderSubtree(preorder);
		return tree;
	}
	
	private static Node reconstructPreorderSubtree(List<Integer> preorder) {
		Integer subtreeKey=preorder.get(subtreeIdx);
		++subtreeIdx;
		if(subtreeKey==null) {
			return null;
		}
		Node n=new Node(subtreeKey);
		n.left=reconstructPreorderSubtree(preorder);
		n.right=reconstructPreorderSubtree(preorder);
		return n;
	}

	public static void main(String[] args) {
		List<Integer> alist= new ArrayList(Arrays.asList(50,null,70,80,90,null,null,10,null,null,null));
		reconstructPreorder(alist);

	}

}
