package Lesson_26.src;

import Lesson_26.src.Employee.Employee;

public class EmployeeChain {

    private final Employee employee;
    private EmployeeChain nextEmployeeChain;


    public EmployeeChain(Employee employee) {
        this.employee = employee;
    }

    public void doTask(Task task) {
        if(task.getStatus() == employee.getResponsibleForTaskStatus())
            employee.doTask(task);
        else if(nextEmployeeChain!= null)
            nextEmployeeChain.doTask(task);
        else
            throw new IllegalArgumentException("task can`t be handled");
    }

    public void setNextEmployeeChain(EmployeeChain nextEmployeeChain){
        this.nextEmployeeChain = nextEmployeeChain;
    }
}
