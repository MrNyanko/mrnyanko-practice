package structure.collection.stack;

public class MyArrayStack<AnyType> {
    public static final int DEFAULT_CAPACITY = 10;
    private int theSize;
    private int topOfStack;
    private AnyType[] theItems;


    private void ensureCapacity(int newCapacity) {
        if (newCapacity < theSize)
            return;
        AnyType[] oldItems = theItems;
        theItems = (AnyType[]) new Object[newCapacity];
//        for (int i = 0; i < size(); i++) {
//            theItems[i] = oldItems[i];
//        }
        System.arraycopy(oldItems, 0, theItems, 0, size());
    }

    private void doClear() {
        theSize = 0;
        topOfStack = -1;
        ensureCapacity(DEFAULT_CAPACITY);
    }

    //--------- public def ---------//

    public int size() {
        return theSize;
    }

    public MyArrayStack() {
        doClear();
    }

    public void clear() {
        doClear();
    }

    public boolean push(AnyType x) {
        if (theItems.length == size())
            ensureCapacity(size() * 2 - 1);

        topOfStack++;
        theItems[topOfStack] = x;

        return true;
    }

    public AnyType pop() {
        if (topOfStack < 0)
            throw new IndexOutOfBoundsException();
        return theItems[topOfStack--];
    }

    public AnyType peek() {
        return theItems[topOfStack];
    }
}
