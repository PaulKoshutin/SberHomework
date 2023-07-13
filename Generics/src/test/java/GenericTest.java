import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GenericTest {
    @Test
    public void genericTester() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        List<Double> list = Arrays.asList(2.0, 3.0, 4.5);
        assertEquals(GenericClass.numberCollectionGenericMethod(list), 1);

        GenericClass.wildcardPlaceExchangeMethod(list, 0, 2);
        assertEquals(list.toString(), "[4.5, 3.0, 2.0]");
    }
}
