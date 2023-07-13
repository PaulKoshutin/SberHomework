import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(NewRepeatableAnnotations.class)
@Target({ElementType.METHOD})
public @interface NewRepeatableAnnotation {

    int priority();

    double dataValue();

    String dataName();

    int dataNumber();
}
