package com.spartaglobal.fileio;
public class ToDo
{
    private String description;
    private String who;
    private String estimatedTime;
    private String startDate;
    private String finished;

    public ToDo(String description, String who, String estimatedTime, String startDate, String finished) {
        this.description = description;
        this.who = who;
        this.estimatedTime = estimatedTime;
        this.startDate = startDate;
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "description='" + description + '\'' +
                ", who='" + who + '\'' +
                ", estimatedTime='" + estimatedTime + '\'' +
                ", startDate='" + startDate + '\'' +
                ", finished='" + finished + '\'' +
                '}';
    }

    public void setFinished() {
        finished = "true";
    }

    public String getDescription() {
        return description;
    }

    public String getWho() {
        return who;
    }

    public String getEstimatedTime() {
        return estimatedTime;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getFinished() {
        return finished;
    }
}