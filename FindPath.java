import java.util.TreeSet;
import java.util.Comparator;
public class FindPath {
	TreeSet<String> rets = new TreeSet<String>(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
        public String path(TreeNode root, int target) {
			find("",root,target);
			if (rets.size() == 0) return "nopath";
			return rets.first();
        }
		private void find(String route, TreeNode root, int target) {
			if (root == null) return;
			if (root.info == target) rets.add(route);
			find(route + "0", root.left, target);
			find(route + "1", root.right, target);
		}
    }