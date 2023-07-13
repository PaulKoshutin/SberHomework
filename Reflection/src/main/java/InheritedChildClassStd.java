import lombok.NonNull;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class InheritedChildClassStd extends InheritedSuperClass {
    @NewRepeatableAnnotation(priority = 1, dataName = "", dataNumber = 0, dataValue = 0.0)
    @NewRepeatableAnnotation(priority = 2, dataName = "B", dataNumber = 22, dataValue = 1.1)
    public void methodA(@NonNull String dataName, int dataNumber, double dataValue) throws NoSuchFieldException {
        InheritedAnnotation anno = InheritedChildClassStd.class.getAnnotation(InheritedAnnotation.class);
        if (anno.weekday() == 1)
            dataContainer = new DataContainer(dataName,dataNumber, dataValue);
        else
            dataContainer = new DataContainer("",0, 0.0);
    }
}
