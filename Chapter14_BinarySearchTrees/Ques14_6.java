package Chapter14_BinarySearchTrees;
//Find three closest elements from given three sorted arrays
public class Ques14_6 {

	public static void main(String[] args) {
		int A[] = {20, 24, 100};
	      int  B[] = {2, 19, 22, 79, 800};
	       int C[] = {10, 12, 23, 24, 119};
        int p = A.length; 
        int q = B.length; 
        int r = C.length; 
      
        // Function calling 
        findClosest(A, B, C, p, q, r); 

	}

	 static void findClosest(int A[], int B[], int C[], 
             int p, int q, int r)  {
		int diff = Integer.MAX_VALUE; // Initialize min diff 
	      
        // Initialize result 
        int res_i =0, res_j = 0, res_k = 0; 
      
        // Traverse arrays 
        int i = 0, j = 0, k = 0; 
        while (i < p && j < q && k < r) 
        { 
           int min=Math.min(A[i], Math.min(B[j],C[k]));
           int max=Math.max(A[i], Math.max(B[j],C[k]));
           if(max-min<diff) {
        	   res_i=i;
        	   res_j=j;
        	   res_k=k;
        	   diff=max-min;
           }
           if(diff==0) {
        	   break;
           }
           if(A[i]==min) {
        	   i++;
           }else if(B[j]==min) {
        	   j++;
           }else if(C[k]==min) {
        	   k++;
           }
        } 
      
        // Print result 
        System.out.println(A[res_i] + " " + 
                           B[res_j] + " " + C[res_k]); 
		
	}

}
