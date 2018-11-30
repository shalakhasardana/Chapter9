package Chapter14_BinarySearchTrees;

public class TreeFunctions {
	Node root;
	public Node createLCA() {
	    root = new Node(20); 
        root.left = new Node(8); 
        root.right = new Node(22); 
        root.left.left = new Node(4); 
        root.left.right = new Node(12); 
        root.left.right.left=new Node(10);
        root.left.right.right=new Node(14);
        return root;
     }
	public Node createBSTTree() {
	    root = new Node(3); 
        root.left = new Node(2); 
        root.right = new Node(5); 
        root.left.left = new Node(1); 
        root.left.right = new Node(2); 
        return root;
}
	
	public Node createNonBSTTree() {
	    root = new Node(3); 
        root.left = new Node(2); 
        root.right = new Node(5); 
        root.left.left = new Node(1); 
        root.left.right = new Node(5); 
        return root;
}

	
	
	
}
