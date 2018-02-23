package top.jinhaoplus.Chap19_State;

public class NightState implements State {

    private static NightState singleton = new NightState();

    private NightState() {

    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour >= 9 && 17 > hour) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("use vault (Night)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("press alarm(Night)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("record call(Night)");
    }

    @Override
    public String toString() {
        return "Night";
    }
}
