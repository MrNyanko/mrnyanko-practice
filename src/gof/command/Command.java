package gof.command;

public abstract  class Command {

    private Invoker invoker;

    public abstract void execute();
}
