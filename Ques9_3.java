package Chapter9;
//Lowest common ancestor in binary Tree
public class Ques9_3 {
	 Node root;

	public static void main(String[] args) {
		Ques9_3 tree=new Ques9_3();
		TreeFunctions obj=new TreeFunctions();
		tree.root=obj.createLCA();
		    /*  LCA(4, 5) = 2
				LCA(4, 6) = 1
				LCA(3, 4) = 1
				LCA(2, 4) = 2  */
		    System.out.println("LCA(4, 5): " + tree.findLCA(4,5)); 
	        System.out.println("LCA(4, 6): " + tree.findLCA(4,6)); 
	        System.out.println("LCA(3, 4): " + tree.findLCA(3,4)); 
	        System.out.println("LCA(2, 4): " + tree.findLCA(2,4)); 
	}

	private Integer findLCA(int node1, int node2) {
		Node n1=findNode(node1);
		Node n2=findNode(node2);
		if(n1==null || n2==null) {
			System.out.println("Either"+ node1 +"or" + node2 +"not exist");
			return null;
		}
		TreeFunctions obj=new TreeFunctions();
		return findLCA(obj.createLCA(),node1,node2).data;
	}

	private Node findLCA(Node node, int n1, int n2) {
	    if(node==null) {
	    	return null;
	    }
	    if(node.data==n1|| node.data==n2) {
	    	return node;
	    }
	    Node leftNode=findLCA(node.left,n1,n2);
	    Node rightNode=findLCA(node.right,n1,n2);
	    if(leftNode!=null && rightNode!=null) {
	    	return node;
	    }
		return leftNode !=null? leftNode:rightNode;
	}

	private Node findNode(int data) {
		TreeFunctions obj=new TreeFunctions();
		return check(data,obj.createLCA());
	}

	private Node check(int x, Node node) {
		if(node==null) {
			return null;
		}
		if(node.data==x) {
			return node;
		}
		return check(x,node.left)!=null? check(x,node.left):check(x,node.right);
		
	}

	

}
