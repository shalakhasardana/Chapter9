package Chapter14_BinarySearchTrees;
//Lowest Common Ancestor in a Binary Search Tree.
public class Ques14_4 {

	public static void main(String[] args) {
		TreeFunctions obj1=new TreeFunctions();
        Node tree=obj1.createLCA();
        Ques14_4 obj=new Ques14_4();
        System.out.println(obj.computeLCA(tree,10,14));
        System.out.println(obj.computeLCA(tree,14,8));
        System.out.println(obj.computeLCA(tree,10,22));

	}

	private Integer computeLCA(Node tree, int n1, int n2) {
		
		if(tree==null) {
			return null;
		}
		
		while(tree!=null) {
			if(n1<tree.data && n2<tree.data) {
				tree=tree.left;
			}else if(n1>tree.data && n2>tree.data) {
				tree=tree.right;
			}else {
				break;
			}
		}
		
		return tree.data;
	}
	
	//using recurssion 

	/*private Integer computeLCA(Node tree, int n1, int n2) {
		if(tree==null) {
			return null;
		}
		
		if(n1<=tree.data && tree.data<=n2) {
			return tree.data;
		}
		if(n1<tree.data && n2<tree.data) {
			return computeLCA(tree.left,n1,n2);
		}
		if(n1>tree.data && n2>tree.data){
			return computeLCA(tree.right,n1,n2);
		}
		return tree.data;
	}*/

}
