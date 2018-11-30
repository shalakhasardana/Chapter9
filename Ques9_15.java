package Chapter9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//Compute the Exterior of a Binary Tree
public class Ques9_15 {

	public static void main(String[] args) {
		TreeFunctions tree=new TreeFunctions();
		Node root=tree.createLCAUsingParentPointer();
		Set<Node> list=new HashSet<Node>();
		list.add(root);
		exteriorLeft(root.left,list,true);
		exteriorRight(root.right,list,true);
	    Iterator<Node> node=list.iterator();
	    while(node.hasNext()) {
	    	System.out.println(node.next().data);
	    }

	}

	private static void exteriorRight(Node node, Set<Node> list, boolean bool) {
		if(node==null){
			return;
		}
		if(node.left==null && node.right==null|| bool==true) {
			list.add(node);
		}
		exteriorRight(node.right,list,true);
		exteriorRight(node.left,list,node.right!=null?false:true);
	}

	private static void exteriorLeft(Node node, Set<Node> list, boolean bool) {
		if(node==null) {
			return;
		}
		if(node.left==null && node.right==null|| bool==true) {
			list.add(node);
		}
		exteriorLeft(node.left,list,true);
		exteriorLeft(node.right,list,node.left!=null?false:true);
		
	}

}
