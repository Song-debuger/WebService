package server;

import java.util.Date;

public class ToDoList {
    private Date startTime, endTime;
    private String description;
    private int id;

    public ToDoList(Date sT, Date eT, String des, int i) {
        startTime = sT;
        endTime = eT;
        description = des;
        this.id = i;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }
}
