package Chapter14_BinarySearchTrees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ques14_5 {
	 static int preIndex = 0;
	
	public static void main(String[] args) {
		List<Integer> alist= new ArrayList(Arrays.asList(43,23,37,29,31,41,47,53));
		Ques14_5 obj=new Ques14_5();
		//Node root=obj.getTree(alist,0,alist.size()-1);
		Node root = obj.constructTree(alist, alist.size()); 
        System.out.println(root);
	}

	private Node constructTree(List<Integer> pre, int size) {
		 
		return constructTreeUtil(pre, pre.get(0), Integer.MIN_VALUE, Integer.MAX_VALUE, size); 
	}

	

	private Node constructTreeUtil(List<Integer> pre, Integer key, int minValue, int maxValue,
			int size) {
		if(preIndex>=size|| minValue>key ||key>maxValue) {
			return null;
		}
		Node root=new Node(key);
		preIndex++;
		if(!(preIndex>=size)) {
		root.left=constructTreeUtil(pre,pre.get(preIndex),minValue,key,size);
		root.right=constructTreeUtil(pre,pre.get(preIndex),key,maxValue,size);
		}
		
		
		return root;
	}

	private Node getTree(List<Integer> alist, int start, int end) {
		if(alist.isEmpty()||alist.size()<start+1) {
			return null;
		}
		if(start>end) {
			return null;
		}
		Node root=new Node(alist.get(start));
		int transition=start+1;
		if(transition<=alist.size()-1) {
		while(alist.get(transition)<alist.get(start)) {
			transition++;
		}
		}
		root.left=getTree(alist,start+1,transition-1);
	    root.right=getTree(alist,transition,end);
		
		return root;
	}

}
