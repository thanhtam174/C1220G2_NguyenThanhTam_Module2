package _11_map_and_tree.optionals.exercises;

public interface Tree <E>{
    boolean insert(E e);
    void inorder();
    void postorder();
    void preorder();
    int getSize();
    void delete(E element);
    void search(E element);
}
