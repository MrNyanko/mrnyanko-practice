package gof.mediator;

public class ConcreteMediator implements Mediator {

    private ConcreteColleague1 concreteColleague1;
    private ConcreteColleague2 concreteColleague2;
    private ConcreteColleague3 concreteColleague3;

    @Override
    public void createColleagues() {
        concreteColleague1 = new ConcreteColleague1();
        concreteColleague2 = new ConcreteColleague2();
        concreteColleague3 = new ConcreteColleague3();

    }

    @Override
    public void colleagueChanged() {

    }
}
