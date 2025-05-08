package Lesson_28.src;

public class TaskProgressCallbackImp implements TaskProgressCallback{
    private final TaskFactory factory;

    public TaskProgressCallbackImp(TaskFactory factory) {
        this.factory = factory;
    }

    @Override
    public void updateTask(Task task) {
        factory.updateTask(task);
    }
}
