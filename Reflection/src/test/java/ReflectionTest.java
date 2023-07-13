import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class ReflectionTest {
    @Test
    public void ReflectionTester() throws NoSuchFieldException, NoSuchMethodException {
        InheritedChildClassOverride child1 = new InheritedChildClassOverride();
        InheritedChildClassStd child2 = new InheritedChildClassStd();

        child1.methodB("R",42,1.1);
        child2.methodA("R",42,1.1);

        System.out.println(child1.dataContainer.getDataName()+" "+child1.dataContainer.getDataNumber()+" "+child1.dataContainer.getDataValue());
        System.out.println(child2.dataContainer.getDataName()+" "+child2.dataContainer.getDataNumber()+" "+child2.dataContainer.getDataValue());
        System.out.println();

        NewRepeatableAnnotation[] annotations = child1.getClass().getMethod("methodB", String.class, int.class, double.class).getAnnotation(NewRepeatableAnnotations.class).value();
        Arrays.sort(annotations, Comparator.comparing(NewRepeatableAnnotation::priority));
        for (NewRepeatableAnnotation method:annotations) {
            child1.methodB(method.dataName(), method.dataNumber(), method.dataValue());
            System.out.println(child1.dataContainer.getDataName()+" "+child1.dataContainer.getDataNumber()+" "+child1.dataContainer.getDataValue());
        }
    }
}
