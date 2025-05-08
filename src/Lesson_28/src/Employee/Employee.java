package Lesson_28.src.Employee;

import Lesson_28.src.*;

public abstract class Employee implements Observer {
    private final String name;
    private final Task.Status responsibleForTasksStatus;
    private final TaskProgressCallback callback;

    public Employee(String name, Task.Status responsibleForTasksStatus, TaskProgressCallback callback) {
        this.name = name;
        this.responsibleForTasksStatus = responsibleForTasksStatus;
        this.callback = callback;
    }

    @Override
    public void handleTask(Task task) {
            System.out.println("working " + getClass().getSimpleName() +
                    " for task " + task.getDescription());
           // try{Thread.sleep(1000);}catch (Exception e){System.out.println("cant sleep");}
            System.out.println("finished " + getClass().getSimpleName() +
                    " for task " + task.getDescription());
            callback.updateTasks(task,getTaskWhenDone(task));
    }

    public final boolean canBeObserverForColumn(Column column){
        return column.contains(responsibleForTasksStatus);
    }

    protected abstract Task getTaskWhenDone(Task task);

    protected String getDetailsAboutProcess(Task task){
        return "The task has this options: " + task.toString();
    }

}
