package Lesson_26.src;

public class Tester extends Employee{


    protected Tester(String name, TaskProgressCallback callback) {
        super(name, Task.Status.READY_FOR_TESTING, callback);
    }

    @Override
    protected Task getTaskWhenDone(Task task) {
        return new Task(
                Task.Status.DONE,
                task
        );
    }

    @Override
    protected String getDetailsAboutProcess(Task task) {
        return "Task has: Id:"+task.getId()+", Description:"+task.getDescription()+
                ", DesignLink:"+task.getDesignLink()+", Testcase:"+task.getTestcase() +
                ", BuildLink:"+task.getBuildLink();
    }
}
