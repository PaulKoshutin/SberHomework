import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class ReflectionTest {
    @Test
    public void ReflectionTester() throws NoSuchFieldException, NoSuchMethodException, IOException {
        InheritedChildClassOverride child1 = new InheritedChildClassOverride();
        InheritedChildClassStd child2 = new InheritedChildClassStd();

        child1.methodB("R", 42, 1.1);
        child2.methodA("R", 42, 1.1);

        NewRepeatableAnnotation[] annotations = child1.getClass().getMethod("methodB", String.class, int.class, double.class).getAnnotation(NewRepeatableAnnotations.class).value();
        Arrays.sort(annotations, Comparator.comparing(NewRepeatableAnnotation::priority));
        for (NewRepeatableAnnotation method : annotations) {
            child1.methodB(method.dataName(), method.dataNumber(), method.dataValue());
        }

        child1.closeStream();
        child2.closeStream();
    }
}
