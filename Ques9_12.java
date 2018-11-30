package Chapter9;

import java.util.HashMap;
import java.util.Map;

//Construct Tree from given Inorder and Preorder traversals
public class Ques9_12 {
	 static int index=0;
	public static void main(String[] args) {
		 char in[] = { 'D', 'B', 'E', 'A', 'F', 'C' }; 
		 char pre[] = { 'A', 'B', 'D', 'E', 'C', 'F' }; 
		 int length=in.length-1;
		 Map<Character,Integer> nodeToInorderIdx=new HashMap<Character,Integer>();
		 for(int i=0;i<in.length;i++) {
			 nodeToInorderIdx.put(in[i], i);
		 }
		
		// Node root=inorderEnd(pre,0,pre.length,0,in.length,nodeToInorderIdx); 
		 Node root=inorderEnd(in,pre,0,length,nodeToInorderIdx);
		 System.out.println(root);
		

	}

	private static Node inorderEnd(char[] in, char[] pre, int start, int end, Map<Character, Integer> nodeToInorderIdx) {
		if(start>end) {
			return null;
		}
		Node tnode=new Node(pre[index]);
		int getIndexofroot=nodeToInorderIdx.get(pre[index]);
		index++;
		if(start==end) {
			return tnode;
		}
		tnode.left=inorderEnd(in,pre,start,getIndexofroot-1,nodeToInorderIdx);
	    tnode.right=inorderEnd(in,pre,getIndexofroot+1,end,nodeToInorderIdx);
		
		return tnode;
	}

	/*private static Node buldTreeWrap(char[] preorder, int preorderStart, int preorderEnd, int inorderStart, int inorderEnd,
			Map<Character, Integer> nodeToInorderIdx) {
		if(preorderEnd<=preorderStart||inorderStart<=inorderEnd) {
			return null;
		}
		int rootInOrderIdx=nodeToInorderIdx.get(preorder[preorderStart]);
		int leftSubTreeSize=rootInOrderIdx-inorderStart;
		Node tnode=new Node(preorder[preorderStart]);
		tnode.left=buldTreeWrap(preorder,preorderStart+1,preorderStart+1+leftSubTreeSize,inorderStart,rootInOrderIdx,nodeToInorderIdx);
		tnode.right=buldTreeWrap(preorder,preorderStart+1+leftSubTreeSize,preorderEnd,rootInOrderIdx+1,inorderEnd,nodeToInorderIdx);
				return tnode;
	}
*/
	
	
	
}
