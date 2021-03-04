package _11_map_and_tree.optionals.exercises;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }

    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            insert(objects[i]);
    }


    @Override
    public boolean insert(E e) {
        if (root == null)
            root = createNewNode(e);
        else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false;
            }
            if (e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }
        size++;
        return true;
    }

    public TreeNode<E> search(TreeNode<E> root, E element) {
        if (root == null || element.compareTo(root.element) == 0) {
            return root;
        } else if (element.compareTo(root.element) < 0) {
            return search(root.left, element);
        }
        return search(root.right, element);
    }

    public E minElement(TreeNode<E> root) {
        E minElement = root.element;
        while (root.left != null) {
            minElement = root.left.element;
            root = root.left;
        }
        return minElement;
    }

    public TreeNode<E> delete(TreeNode<E> root, E element) {
        if (root == null) {
            return root;
        } else if (element.compareTo(root.element) < 0) {
            root.left = delete(root.left, element);
        } else if (element.compareTo(root.element) > 0) {
            root.right = delete(root.right, element);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.element = minElement(root.right);
            root.right = delete(root.right, root.element);
        }
        return root;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void delete(E element) {
            delete(root, element);
    }

    @Override
    public void search(E element) {
        search(root, element);
        System.out.println("");
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }

    @Override
    public void postorder() {
        postorder(root);
    }

    protected void postorder(TreeNode<E> root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.element + " ");
    }

    @Override
    public void preorder() {
        preorder(root);
    }

    protected void preorder(TreeNode<E> root) {
        if (root == null) return;
        System.out.println(root.element + " ");
        preorder(root.left);
        preorder(root.right);
    }
}

