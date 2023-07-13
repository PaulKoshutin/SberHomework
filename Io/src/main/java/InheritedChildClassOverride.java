import lombok.NonNull;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

@InheritedAnnotation(weekday = 1)
public class InheritedChildClassOverride extends InheritedSuperClass {
    @NewRepeatableAnnotation(priority = 2, dataName = "L", dataNumber = 100, dataValue = 5.5)
    @NewRepeatableAnnotation(priority = 1, dataName = "A", dataNumber = 10, dataValue = 5.0)
    public void methodB(@NonNull String dataName, int dataNumber, double dataValue) throws NoSuchFieldException, IOException {
        InheritedAnnotation anno = InheritedChildClassOverride.class.getAnnotation(InheritedAnnotation.class);

        Files.createDirectories(Paths.get("./log"));

        if (new File("./log").listFiles().length > 2)
            Arrays.stream(new File("./log").listFiles()).forEach(File::delete);

        if (dataContainer == null)
            dataContainer = new java.io.BufferedWriter((new FileWriter(new File("./log", System.currentTimeMillis() + ".txt"), true)));

        if (anno.weekday() == 1)
            dataContainer.write(dataName + " " + dataNumber + " " + dataValue);
        else
            dataContainer.write("" + " " + 0 + " " + 0.0);
    }
}
