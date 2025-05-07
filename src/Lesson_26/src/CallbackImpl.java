package Lesson_26.src;

public class CallbackImpl implements TaskProgressCallback{
    private final TaskFactory factory;

    public CallbackImpl(TaskFactory factory) {
        this.factory = factory;
    }


    @Override
    public void updateTask(Task task) {
        factory.updateTask(task);
    }
}
