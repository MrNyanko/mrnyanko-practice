package structure.collection.stack;


import java.util.NoSuchElementException;

public class MyLinkedStack<AnyType> {

    public static class Node<AnyType> {
        public AnyType data;
        public Node<AnyType> next;

        public Node(AnyType d, Node<AnyType> n) {
            data = d;
            next = n;
        }

    }

    private int theSize;
    private int modCount = 0;
    private Node<AnyType> top;

    private void doClear() {
        top = new Node<AnyType>(null, null);
        theSize = 0;
        modCount++;
    }


    //--------- public def ---------//

    public MyLinkedStack() {
        doClear();
    }

    public void clear() {
        doClear();
    }

    public int size() {
        return theSize;
    }

    public boolean isEmpty() {
        return size() == 0;
    }


    public boolean push(AnyType x) {
        top = new Node<>(x, top);
        theSize++;
        modCount++;
        return true;
    }

    public AnyType pop() {
        if (isEmpty())
            throw new NoSuchElementException();
        Node<AnyType> old = top;
        top = top.next;
        old.next = null;
        theSize--;
        modCount++;
        return old.data;
    }

    public AnyType peek() {
        return top.data;
    }

}
