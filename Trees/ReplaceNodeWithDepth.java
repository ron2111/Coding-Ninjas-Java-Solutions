
public class ReplaceNodeWithDepth {
 //Using helper function to use depth as another arguement
public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
	
        helper(root,0);
	}
    
    public static void helper(BinaryTreeNode<Integer> root, int k)
    {
        if (root==null)
        {                   //Base Case
            return;
        }
        root.data=k;  //Changing the value
        helper(root.left,++k); //Using the pre-increment operator 
        
        helper(root.right,k--);// Very Important step
        
        /* Here k is post decremented because then the value of k is given to
         a particular subtree's left node, it will be same for right node and
             after changing the value of bth the nodes(if they are not null), the
             recursion call returns to the previous call to complete the leftover commands
             where the k is already decremented due to the post decrement operator */
	}

}
	

