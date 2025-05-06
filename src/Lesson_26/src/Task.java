package Lesson_26.src;

public class Task {
    private final int id;
    private final Task.Status status;
    private final String description;
    private final String designLink;
    private final String testcase;
    private final String buildLink;

    public Task(int id, Task.Status status, String description, String designLink, String testcase, String buildLink) {
        this.id = id;
        this.designLink = designLink;
        this.status = status;
        this.description = description;
        this.testcase = testcase;
        this.buildLink = buildLink;
    }

    public Task(Task.Status status, Task oldTask) {
        this.status = status;
        this.id = oldTask.id;
        this.designLink = oldTask.designLink;
        this.description = oldTask.description;
        this.testcase = oldTask.testcase;
        this.buildLink = oldTask.buildLink;
    }

    public Task(Task.Status status, String designLink, String testcase, Task oldTask) {
        this.status = status;
        this.designLink = designLink;
        this.testcase = testcase;
        this.id = oldTask.id;
        this.description = oldTask.description;
        this.buildLink = oldTask.buildLink;
    }

    public Task(Task.Status status, String buildLink, Task oldTask) {
        this.status = status;
        this.buildLink = buildLink;
        this.id = oldTask.id;
        this.designLink = oldTask.designLink;
        this.description = oldTask.description;
        this.testcase = oldTask.testcase;
    }



    public int getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public String getDesignLink() {
        return designLink;
    }

    public String getTestcase() {
        return testcase;
    }

    public String getBuildLink() {
        return buildLink;
    }

    public enum Status {
        ASSEMBLING_REQUIREMENTS, READY_TO_DO, IN_PROGRESS, READY_FOR_TESTING, DONE
    }
}
