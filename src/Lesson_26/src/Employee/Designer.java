package Lesson_26.src.Employee;

import Lesson_26.src.Task;
import Lesson_26.src.TaskProgressCallback;

public abstract class Designer extends Employee{
    protected Designer(String name, TaskProgressCallback callback) {
        super(name, Task.Status.ASSEMBLING_REQUIREMENTS, callback);
    }

    @Override
    protected Task getTaskWhenDone(Task task) {
        return new Task(
                Task.Status.READY_TO_DO,
                createDesignLinkForTask(task.getId()),
                createTestCase(task.getDescription()),
                task
        );
    }

    private String createDesignLinkForTask(int taskId){
        return "https://project/design_link_for_task_" + taskId;
    }

    private String createTestCase(String taskDescription){
        return taskDescription + " need result: " + Math.random();
    }
}
