package gof.chain_of_responsibility;

public abstract class Handler {
    private Handler next;

    public void setHandler(Handler handler) {
        this.next = handler;
    }

    public abstract void request();
}
