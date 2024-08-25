import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        search(list, root);
        boolean isValid = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                isValid = false;
            }
        }
        return isValid;
    }
    private void search(List<Integer> list, TreeNode root) {
        if(root != null) {
            if(root.left != null) {
                search(list, root.left);
            }
            list.add(root.val);
            if (root.right != null) {
                search(list, root.right);
            }
        }
    }
}