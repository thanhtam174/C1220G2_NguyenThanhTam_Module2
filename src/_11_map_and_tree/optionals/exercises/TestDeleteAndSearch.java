package _11_map_and_tree.optionals.exercises;

public class TestDeleteAndSearch {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
        tree.insert(50);
        tree.insert(20);
        tree.insert(37);
        tree.insert(81);
        tree.insert(65);
        tree.insert(58);
        tree.insert(29);
        tree.search(81);
        tree.delete(29);
        tree.inorder();
    }
}
