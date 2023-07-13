import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GenericClass {
    public static <T extends Number> int numberCollectionGenericMethod(Collection<T> collection) {
        int even = 0;
        for (T element : collection)
            if (element.doubleValue() % 2 == 0)
                even++;
        return even;
    }

    public static void wildcardPlaceExchangeMethod(Collection<?> collection, int firstElementNum, int secondElementNum) {
        Collections.swap((List<?>) collection, firstElementNum, secondElementNum);
    }

}
