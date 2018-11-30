package Chapter9;

public class Question9_3_Part2 {
	Node root;
	private static class Status{
		int noOfNodes;
		Node ancestor;
		public Status(int no,Node ancestor) {
			this.noOfNodes=no;
			this.ancestor=ancestor;
		}
	}
	
	
	public static void main(String[] args) {
		Question9_3_Part2 tree=new Question9_3_Part2();
		TreeFunctions obj=new TreeFunctions();
		//tree.root=obj.createLCA();
		    /*  LCA(4, 5) = 2
				LCA(4, 6) = 1
				LCA(3, 4) = 1
				LCA(2, 4) = 2  */
		    System.out.println("LCA(4, 5): " + tree.LCA(tree.root=obj.createLCA(),tree.root.left.left,tree.root.left.right).data); 
	        System.out.println("LCA(4, 6): " + tree.LCA(tree.root=obj.createLCA(),tree.root.left.left,tree.root.right.left).data); 
	        System.out.println("LCA(3, 4): " + tree.LCA(tree.root=obj.createLCA(),tree.root.right,tree.root.left.left).data); 
	        System.out.println("LCA(2, 4): " + tree.LCA(tree.root=obj.createLCA(),tree.root.left,tree.root.left.left).data); 
	}


	private Node LCA(Node node, Node n1, Node n2) {
		
		return LCAhelper(node,n1,n2).ancestor;
	}


	private Status LCAhelper(Node node, Node n1, Node n2) {
		if(node==null) {
			return new Status(0,null);
		}
		
		Status leftStatus=LCAhelper(node.left,n1,n2);
		if(leftStatus.noOfNodes==2) {
			return new Status(2,leftStatus.ancestor);
		}
		Status rightStatus=LCAhelper(node.right,n1,n2);
		if(rightStatus.noOfNodes==2) {
			return new Status(2,rightStatus.ancestor);
		}
	    int number=(leftStatus.noOfNodes) + (  rightStatus.noOfNodes)+ (node.data==n1.data?1:0)+(node.data==n2.data?1:0);
		return new Status(number,number==2?node:null);
	}

}
