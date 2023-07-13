import lombok.NonNull;

@InheritedAnnotation(weekday = 1)
public class InheritedChildClassOverride extends InheritedSuperClass {
    @NewRepeatableAnnotation(priority = 1, dataName = "A", dataNumber = 10, dataValue = 5.0)
    @NewRepeatableAnnotation(priority = 2, dataName = "L", dataNumber = 100, dataValue = 5.5)
    public void methodB(@NonNull String dataName, int dataNumber, double dataValue) {

    }
}
