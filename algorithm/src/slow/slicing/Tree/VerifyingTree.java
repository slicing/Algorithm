package slow.slicing.Tree;

import java.util.Stack;

public class VerifyingTree {
	public static boolean isValidBST1(TreeNode root){//不能考虑到左右子树全部小大于根结点
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
			flag = isValidBST1(root.left);
			if(flag == false){
				return flag;
			}
			flag = isValidBST1(root.right);
			if(flag == false){
				return flag;
			}
			return flag;
		}
	}
	static private Stack<Integer> stack;
	public static boolean isValidBTS(TreeNode root){
		if(root == null){
			return true;
		}
		stack = new Stack<>();
		inOrder(root);
		int i = stack.pop();
		int j;
		while (!stack.isEmpty()){
			j = stack.pop();
			if(i <= j){
				return false;
			}
			i = j;
		}
		return true;
	}

	private static void inOrder(TreeNode root) {
		if(root != null){
			inOrder(root.left);
			stack.push(root.val);
			inOrder(root.right);
		}
	}
}
