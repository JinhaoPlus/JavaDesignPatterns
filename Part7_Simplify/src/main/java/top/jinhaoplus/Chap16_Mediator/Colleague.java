package top.jinhaoplus.Chap16_Mediator;

public interface Colleague {
    public abstract void setMediator(Mediator mediator);
    // mediator向colleague下达指令
    public abstract void setCollegueEnabled(boolean enabled);
}
