package top.jinhaoplus.Chap16_Mediator;

public interface Mediator {
    public abstract void createColleagues();
    // colleague状态变化通知mediator，再由mediator统一下达实际的指令
    public abstract void colleagueChanged();
}
