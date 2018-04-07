package gof.memento;

public class Caretaker {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Memento memento = originator.createMemento();
    }
}
