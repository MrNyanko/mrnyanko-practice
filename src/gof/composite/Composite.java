package gof.composite;

import java.util.ArrayList;
import java.util.Arrays;

public class Composite extends Component {

    private ArrayList<Leaf> leaves;

    public Composite(Leaf... leaves) {
        this.leaves.addAll(Arrays.asList(leaves));
    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    public Component add() {
        return null;
    }

    public void remove() {
    }

    public Component getChild() {
        return null;
    }
}
