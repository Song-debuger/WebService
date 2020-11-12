package server;

import java.util.Date;
import java.util.Vector;

public class User {
    private Vector<ToDoList> list;
    private String userName;
    private String password;
    private int nowid;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.nowid = 0;
        this.list = new Vector<ToDoList>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return nowid;
    }

    public void setNowId(int i) {
        this.nowid = i;
    }

    public Vector<ToDoList> getList() {
        return list;
    }

    public void addList(Date sT, Date eT, String des, int id) {
        ToDoList l = new ToDoList(sT, eT, des, id);
        list.add(l);
    }

}
