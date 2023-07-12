import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GenericTest {
    @Test
    public void GenericTester() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        List<Double> list = Arrays.asList(2.0, 3.0, 4.5);
        assertEquals(GenericClass.NumberCollectionGenericMethod(list), 1);

        GenericClass.WildcardPlaceExchangeMethod(list, 0, 2);
        assertEquals(list.toString(), "[4.5, 3.0, 2.0]");

        ServiceQueryValidatorA queryA = new ServiceQueryValidatorA();
        ServiceQueryValidatorB queryB = new ServiceQueryValidatorB();

        ServiceInteractionClassA inter = new ServiceInteractionClassA();
        ServiceAnswerValidatorA answer = new ServiceAnswerValidatorA();

        UnifiedServiceClass unifiedA = new UnifiedServiceClass<>(queryA, inter, answer);
        assertEquals(unifiedA.UnifiedServiceMethod(), "A 0 0.0");

        UnifiedServiceClass unifiedB = new UnifiedServiceClass<>(queryB, inter, answer);
        assertEquals(unifiedB.UnifiedServiceMethod(), "B 0 0.0");
    }
}
