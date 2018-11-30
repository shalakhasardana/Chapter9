package Chapter14_BinarySearchTrees;

import java.util.ArrayList;
import java.util.List;

public class Ques14_3 {

	public static void main(String[] args) {
		TreeFunctions obj1=new TreeFunctions();
        Node tree=obj1.createBSTTree();
        int k=3;
        List<Integer> alist=new ArrayList<Integer>();
        Ques14_3 obj=new Ques14_3();
       obj.lastKLargest(tree,alist,k);
       System.out.println(alist);

	}

	private void  lastKLargest(Node tree, List<Integer> alist, int k) {
		if(tree==null || alist.size()>k ) {
			return ;
		}
		lastKLargest(tree.right,alist,k);
		if(alist.size()<k) {
			alist.add(tree.data);
		}
		lastKLargest(tree.left,alist,k);
		
	}

}
