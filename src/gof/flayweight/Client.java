package gof.flayweight;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();
        flyweightFactory.getFlyweight("");
    }
}
