public class TreeSome {
        public int count(TreeNode root, int low, int high) {
            if (root == null) return 0;
			if (root.info >= low && root.info <= high) return 1 + count(root.left,low,high) + count(root.right,low,high);
			return count(root.left,low,high) + count(root.right,low,high);
        }
    }