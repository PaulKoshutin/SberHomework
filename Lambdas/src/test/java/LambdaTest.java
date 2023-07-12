import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest {
    @Test
    public void LambdaTester() {
        List<Sounding> list = new ArrayList<>();

        list.add(new Cat());

        list.add(new Dog());

        list.add(new Sounding() {
            @Override
            public void sound() {
                System.out.println("Anonymous");
            }
        });

        list.add(() -> System.out.println("Lambda"));

        list.add(new NonImplementingClass()::sound);

        list.forEach(Sounding::sound);

    }
}
