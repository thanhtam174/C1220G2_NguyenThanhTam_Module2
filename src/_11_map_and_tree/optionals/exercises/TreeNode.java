package _11_map_and_tree.optionals.exercises;

public class TreeNode<E> {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    public TreeNode(E e) {
        element = e;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "element=" + element +
                '}';
    }
}
