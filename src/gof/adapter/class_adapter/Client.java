package gof.adapter.class_adapter;

public class Client {
    public static void main(String[] args) {
        Target adapter = new Adapter();
        adapter.targetMethod1();
        adapter.targetMethod2();
    }
}
