import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
public @interface NewRepeatableAnnotations {
    NewRepeatableAnnotation[] value();
}
