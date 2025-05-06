package Lesson_26.src;

public class Programmer extends Employee{

    protected Programmer(String name, TaskProgressCallback callback) {
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

    @Override
    protected String getDetailsAboutProcess(Task task) {
        return "Task has: Id:"+task.getId()+", Description:"+task.getDescription()+
                ", DesignLink:"+task.getDesignLink()+", Testcase:"+task.getTestcase();
    }

}
