package Lesson_28.src.Employee;

import Lesson_28.src.Task;
import Lesson_28.src.TaskProgressCallback;

public class Designer extends Employee{

    public Designer(String name, TaskProgressCallback callback){
        super(name, Task.Status.ASSEMBLING_REQUIREMENTS, callback);
    }

    @Override
    protected Task getTaskWhenDone(Task task) {
        return new Task(
                Task.Status.READY_TO_DO,
                createDesignLink(task.getId()),
                createTestCase(task.getId()),
                task
        );
    }

    private String createDesignLink(int id){
        return "https//:design_link_of_task_"+id;
    }
    private String createTestCase(int id){
        return "testcase_for_task_"+id;
    }
}
