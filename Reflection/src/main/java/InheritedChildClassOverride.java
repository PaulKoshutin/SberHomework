import lombok.NonNull;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

@InheritedAnnotation(weekday = 1)
public class InheritedChildClassOverride extends InheritedSuperClass {
    @NewRepeatableAnnotation(priority = 2, dataName = "L", dataNumber = 100, dataValue = 5.5)
    @NewRepeatableAnnotation(priority = 1, dataName = "A", dataNumber = 10, dataValue = 5.0)
    public void methodB(@NonNull String dataName, int dataNumber, double dataValue) throws NoSuchFieldException {
        InheritedAnnotation anno = InheritedChildClassOverride.class.getAnnotation(InheritedAnnotation.class);
        if (anno.weekday() == 1)
            dataContainer = new DataContainer(dataName,dataNumber, dataValue);
        else
            dataContainer = new DataContainer("",0, 0.0);
    }

}
