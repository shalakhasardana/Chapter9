package Chapter14_BinarySearchTrees;
//find the first key greater than a given value in a bst
//Time complexity-o(h) and space complexity-o(1)
public class Ques14_2 {

	public static void main(String[] args) {
		TreeFunctions obj1=new TreeFunctions();
        Node tree=obj1.createBSTTree();
        int input=16;
        System.out.println(findFirstGreaterThanK(tree,input));
	}

	private static Integer findFirstGreaterThanK(Node tree, int k) {
		Node firstSoFar=null;
		while(tree!=null) {
			if(tree.data>k) {
				firstSoFar=tree;
				tree=tree.left;
			}else {
				tree=tree.right;
			}
		}
		return firstSoFar.data
				;
	}

}
