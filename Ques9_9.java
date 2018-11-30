package Chapter9;
//compute the kth node in an inorder traversal
public class Ques9_9 {

	public static void main(String[] args) {
		Node root = new Node(10);  
	    root.left = new Node(20);  
	    root.right = new Node(30);  
	    root.left.left = new Node(40);  
	    root.left.right = new Node(50); 
	    int n = 3;
	   System.out.println( NthInorder(root, n).data);
	}

	private static Node NthInorder(Node tree, int k) {
		Node iter=tree;
		while(iter!=null) {
			int leftSize=iter.left!=null? iter.left.size():0;
			if(leftSize+1<k) {
				k=k-(leftSize+1);
				iter=iter.right;
			}else if(k==(leftSize+1)) {
				return iter;
			}else {
				iter=iter.left;
			}
			
		}
		return null;
		
    }
}

