import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

@InheritedAnnotation(weekday = 0)
public class InheritedSuperClass {
    protected DataContainer dataContainer;
}
