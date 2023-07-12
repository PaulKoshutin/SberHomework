import lombok.NonNull;

public class InheritedChildClassStd extends InheritedSuperClass {
    @NewRepeatableAnnotation(priority = 1, dataName = "", dataNumber = 0, dataValue = 0.0)
    @NewRepeatableAnnotation(priority = 2, dataName = "B", dataNumber = 22, dataValue = 1.1)
    public void methodA(@NonNull String dataName, int dataNumber, double dataValue) {
    }
}
