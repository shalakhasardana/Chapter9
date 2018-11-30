package Chapter9;
//compute LCA with parent pointer
public class Ques9_4 {

	public static void main(String[] args) {
		TreeFunctions tree=new TreeFunctions();
		Node node=tree.createLCAUsingParentPointer();
		Ques9_4 obj=new Ques9_4();
	/*	//LCA of 10 and 14 is 12.
		Node n1=node.left.right.left;
		Node n2=node.left.right.right;*/
		//LCA of 8 and 14 is 8
		Node n1=node.left;
		Node n2=node.left.right.right;
		System.out.println(obj.LCAwithParentPointer(node,n1,n2).data);

	}

	private Node LCAwithParentPointer(Node node, Node n1, Node n2) {
		int depth1=calDepth(n1);
	    int depth2=calDepth(n2);
	    int diff=depth1-depth2;
	    if(depth1!=depth2) {
	    	if(depth2>depth1) {
	    		Node temp=n1;
	    		n1=n2;
	    		n2=temp;
	    		diff=-diff;
	    	}
	    	while(diff!=0) {
	    		n1=n1.parent;
	    		diff--;
	    	}
	    }
	    while(n1!=null && n2!=null) {
	    	   if(n1.data==n2.data) {
	    		   return n1;
	    	   }
	    	   n1=n1.parent;
	    	   n2=n2.parent;
	       }
		return null;
	}

	private int calDepth(Node n1) {
		int depth=0;
		while(n1.parent!=null) {
			depth=depth+1;
			n1=n1.parent;
		}
		return depth;
	}

}
