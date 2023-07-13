import lombok.NonNull;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class InheritedChildClassStd extends InheritedSuperClass {
    @NewRepeatableAnnotation(priority = 1, dataName = "", dataNumber = 0, dataValue = 0.0)
    @NewRepeatableAnnotation(priority = 2, dataName = "B", dataNumber = 22, dataValue = 1.1)
    public void methodA(@NonNull String dataName, int dataNumber, double dataValue) throws NoSuchFieldException, IOException {
        InheritedAnnotation anno = InheritedChildClassStd.class.getAnnotation(InheritedAnnotation.class);

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
