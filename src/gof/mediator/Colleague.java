package gof.mediator;

public abstract class Colleague {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void controlColleague();
}
