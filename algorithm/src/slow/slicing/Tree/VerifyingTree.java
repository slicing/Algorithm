package slow.slicing.Tree;

public class VerifyingTree {
	public static boolean isValidBST(TreeNode root){
		boolean flag = true;
		if(root == null){
			flag = true;
			return flag;
		}
		if((root.left!= null && root.left.val >= root.val )||(root.right!=null && root.right.val<= root.val)){
			flag = false;
			return flag;
		}
		else {
			flag = isValidBST(root.left);
			if(flag == false){
				return flag;
			}
			flag = isValidBST(root.right);
			if(flag == false){
				return flag;
			}
			return flag;
		}
	}
}
