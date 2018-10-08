package slow.slicing.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelTraversal {
	public static List<List<Integer>> levelOrder(TreeNode root) {
		List list = new LinkedList();
		Queue queue = new LinkedList();
		queue.add(root);
		while (!queue.isEmpty()) {
			List list1 = new LinkedList();
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode treeNode1 = (TreeNode) queue.poll();
				list1.add(treeNode1.val);
				queue.add(treeNode1.left);
				queue.add(treeNode1.right);
			}
			list.add(list1);
		}
		return list;
	}
}
