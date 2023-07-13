import java.lang.annotation.*;

@Repeatable(NewRepeatableAnnotations.class)
@Target({ElementType.METHOD})
public @interface NewRepeatableAnnotation {

    int priority();

    double dataValue();

    String dataName();

    int dataNumber();
}
