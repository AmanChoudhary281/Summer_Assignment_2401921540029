public class Codec {

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        helper(root, sb);
        return sb.toString();
    }

    void helper(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("null,");
            return;
        }

        sb.append(root.val).append(",");
        helper(root.left, sb);
        helper(root.right, sb);
    }

    public TreeNode deserialize(String data) {
        Queue<String> q = new LinkedList<>(Arrays.asList(data.split(",")));
        return build(q);
    }

    TreeNode build(Queue<String> q) {
        String s = q.poll();

        if (s.equals("null"))
            return null;

        TreeNode root = new TreeNode(Integer.parseInt(s));
        root.left = build(q);
        root.right = build(q);

        return root;
    }
}


