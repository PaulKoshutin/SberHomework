import java.lang.reflect.InvocationTargetException;

public class UnifiedServiceClass<T1, T2, T3> {
    private T1 serviceQuery;
    private T2 serviceInteraction;
    private T3 serviceAnswer;

    UnifiedServiceClass(T1 serviceQuery, T2 serviceInteraction, T3 serviceAnswer) {
        this.serviceQuery = serviceQuery;
        this.serviceInteraction = serviceInteraction;
        this.serviceAnswer = serviceAnswer;
    }

    public String UnifiedServiceMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return serviceQuery.getClass().getMethod("getValue").invoke(serviceQuery) + " " + serviceInteraction.getClass().getMethod("getValue").invoke(serviceInteraction) + " " + serviceAnswer.getClass().getMethod("getValue").invoke(serviceAnswer);
    }
}
