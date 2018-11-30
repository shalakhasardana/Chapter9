package Chapter14_BinarySearchTrees;

import java.util.ArrayList;
import java.util.List;

public class Ques14_10 {
	
	private static class Interval{
		public int left,right;
		public Interval(int left, int right) {
			this.left=left;
			this.right=right;
		}
	}
	
	public static List<Integer> rangeLookupInBST(Node tree,Interval interval){
		List<Integer> result=new ArrayList<>();
		rangeLookupHelper(tree,interval,result);
		return result;
		
	}

	private static void rangeLookupHelper(Node tree, Interval interval, List<Integer> result) {
		if(tree==null) {
			return;
		}
		if(interval.left<=tree.data && tree.data<=interval.right) {
			    rangeLookupHelper(tree.left,interval,result);
				result.add(tree.data);
				rangeLookupHelper(tree.right,interval,result);
		}else if(tree.data>=interval.left && tree.data>=interval.right) {
			rangeLookupHelper(tree.left,interval,result);
		}else if(tree.data<=interval.left && tree.data<=interval.right) {
			rangeLookupHelper(tree.right,interval,result);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
