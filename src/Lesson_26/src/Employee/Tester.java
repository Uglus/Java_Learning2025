package Lesson_26.src.Employee;

import Lesson_26.src.Task;
import Lesson_26.src.TaskProgressCallback;

public class Tester extends Employee{


    public Tester(String name, TaskProgressCallback callback) {
        super(name, Task.Status.READY_FOR_TESTING, callback);
    }

    @Override
    protected Task getTaskWhenDone(Task task) {
        return new Task(
                Task.Status.DONE,
                task
        );
    }
}
