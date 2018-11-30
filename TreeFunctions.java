package Chapter9;

public class TreeFunctions {
	Node root;
	public Node createNotBalancedTree() {
		
		 root = new Node(1); 
         root.left = new Node(2); 
         root.right = new Node(3); 
         root.left.left = new Node(4); 
         root.left.right = new Node(5); 
         root.left.left.left = new Node(8); 
         return root; 
	}

	public Node createSymmetricTree() {
		   root = new Node(1); 
		   root.left = new Node(2); 
	       root.right = new Node(2); 
	       root.left.left = new Node(3); 
	       root.left.right = new Node(4); 
	       root.right.left = new Node(4); 
	       root.right.right = new Node(3); 
        return root; 
	}
	
	public Node createNotSymmetricTree() {
		   root = new Node(1); 
		   root.left = new Node(2); 
	       root.right = new Node(2); 
	       root.left.right = new Node(3); 
	       root.right.right = new Node(3); 
     return root; 
	}
	
	public Node createLCA() {
		    root = new Node(1); 
	        root.left = new Node(2); 
	        root.right = new Node(3); 
	        root.left.left = new Node(4); 
	        root.left.right = new Node(5); 
	        root.right.left = new Node(6); 
	        root.right.right = new Node(7); 
	        return root;
	}
	
	public Node createMSB() {
	    root = new Node(1); 
        root.left = new Node(0); 
        root.right = new Node(1); 
        root.left.left = new Node(0); 
        root.left.right = new Node(1); 
        root.left.left.addLeftNode(0);
        root.left.left.addRighttNode(1);
        root.left.addRighttNode(1);
        root.left.right.addRighttNode(1);
        root.left.right.right.addLeftNode(0);
        
        return root;
}
	public Node createLCAUsingParentPointer() {
	    root = new Node(20); 
        root.addLeftNode(8);
        root.addRighttNode(22);
        root.left.addLeftNode(4);
        root.left.addRighttNode(12);
        root.left.right.addLeftNode(10);
        root.left.right.addRighttNode(14);
        return root;
}   
	//Ques9_10
	public Node inOrderSuccessor() {
		root=new Node(20);
		root.addLeftNode(8);
		root.addRighttNode(22);
		root.left.addLeftNode(4);
		root.left.addRighttNode(12);
		root.left.right.addLeftNode(10);
		root.left.right.addRighttNode(14);
        return root;
} 
	//Ques9_6
	public Node createTree() {
	    root = new Node(314); 
        root.left = new Node(6); 
        root.right = new Node(6); 
        root.left.left = new Node(271); 
        root.left.right = new Node(561); 
        root.left.left.addLeftNode(28);
        root.left.left.addRighttNode(0);
        root.left.right.addRighttNode(3);
        root.left.right.right.addLeftNode(17);
        
        return root;
        
}

	
	
	
}
