import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

@Repeatable(RepeatableAnnotations.class)
@Target({ElementType.METHOD})
public @interface RepeatableAnnotation {
    int hour ();
    int priority ();
    String description ();
}
