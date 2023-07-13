import java.lang.reflect.InvocationTargetException;

public class UnifiedServiceClass {
    public <T extends QueryValidationInterface> void unifiedQueryValidation(T queryType) {
      queryType.validateQuery();
    }
    public <T extends InteractionInterface> void unifiedInteraction(T interactionType) {
        interactionType.interact();
    }
    public <T extends AnswerValidationInterface> void unifiedAnswerValidation(T answerType) {
        answerType.validateAnswer();
    }
}
