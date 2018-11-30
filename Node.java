package Chapter9;

public class Node {
	int data;
	Node left=null;
	Node right=null;
	Node parent=null;
	Node nextright=null;
	Node levelNext=null;
	static int size=1;
	Node(int data){
		this.data=data;
	}
	
	public void addLeftNode(int d) {
		Node n=new Node(d);
		left =n;
		n.parent=this;
	}
	
	public void addRighttNode(int d) {
		Node n=new Node(d);
		right=n;
		n.parent=this;
	}
	
	public Integer size() {
		Node temp=this;
		return cal(temp,size);
		
	}

	private Integer cal(Node temp, int size) {
		if(temp==null) {
			return 0;
		}
		if(temp.left!=null) {
			size=size+1;
			cal(temp.left,size);
		}
		
		if(temp.right!=null) {
			size=size+1;
			cal(temp.right,size);
		}
	
		return size;
	}
	
	
	

}
