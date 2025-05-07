package Lesson_26.src.Employee;

import Lesson_26.src.Task;
import Lesson_26.src.TaskProgressCallback;

public class Programmer extends Employee{

    public Programmer(String name, TaskProgressCallback callback) {
        super(name, Task.Status.READY_TO_DO, callback);
    }

    @Override
    protected Task getTaskWhenDone(Task task) {
        return new Task(
                Task.Status.READY_FOR_TESTING,
                createBuildLink(task.getId()),
                task
        );
    }

    private String createBuildLink(int id) {
        return "https://project/build_link_for_task_"+id;
    }

}
