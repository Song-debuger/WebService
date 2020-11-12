package server;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;


@WebService
public class server {

    Vector<User> users;
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

    public server() {
        users = new Vector<User>();
    }

    public String userRegister(String name, String password) {
        for (int i = 0; i < users.size(); i++)
            if (users.get(i).getUserName().equals(name))
                return "用户名已存在";
        User newUser = new User(name, password);
        if (users.add(newUser))
            return "用户创建成功";
        else
            return "用户创建失败";
    }

    public String addList(String n, String pd, Date sT, Date eT, String des) {
        String re = "";
        int check = checkPassword(n, pd);
        if (check == 0)
            re += "用户不存在";
        if (check == 2)
            re += "用户密码错误";
        if (check == 1)
            for (int i = 0; i < users.size(); i++)
                if (users.get(i).getUserName().equals(n)) {
                    int id = users.get(i).getId() + 1;
                    //server.ToDoList l = new server.ToDoList();
                    users.get(i).setNowId(id);
                    //users.get(i).getList();
                    users.get(i).addList(sT, eT, des, id);
                    re += "事件创建成功";
                }
        return re;
    }

    public String searchList(String n, String pd, Date sT, Date eT) {
        String re = "";
        int check = checkPassword(n, pd);
        if (check == 0)
            re += "用户不存在";
        if (check == 2)
            re += "用户密码错误";
        if (check == 1)
            for (int i = 0; i < users.size(); i++)
                if (users.get(i).getUserName().equals(n))
                    for (int j = 0; j < users.get(i).getList().size(); j++) {
                        ToDoList l = users.get(i).getList().get(j);
                        if ((!l.getStartTime().before(sT)) && (!l.getEndTime().after(eT)))
                            re += "事件描述 " + l.getDescription() + ", 开始时间为" + df.format(l.getStartTime()) + ", 结束时间为"
                                    + df.format(l.getEndTime()) + ", id为" + l.getId() + "\n";

                    }
        return re;
    }

    public String deleteList(String n, String pd, int id) {
        int check = checkPassword(n, pd);
        if (check == 0)
            return "用户不存在";
        if (check == 2)
            return "用户密码错误";
        if (check == 1)
            for (int i = 0; i < users.size(); i++)
                if (users.get(i).getUserName().equals(n))
                    for (int j = 0; j < users.get(i).getList().size(); j++)
                        if (users.get(i).getList().get(j).getId() == id) {
                            users.get(i).getList().remove(j);
                            return "事件删除成功";
                        }
        return "事件id错误";
    }

    public String clearList(String n, String pd) {
        int check = checkPassword(n, pd);
        if (check == 0)
            return "用户不存在";
        if (check == 2)
            return "用户密码错误";
        if (check == 1)
            for (int i = 0; i < users.size(); i++)
                if (users.get(i).getUserName().equals(n)) {
                    users.get(i).getList().clear();
                    users.get(i).setNowId(0);
                    return "事件清除成功";
                }
        return "事件清除错误";
    }

    public String service(String in) throws ParseException {
        String[] ins = in.split(" ");
        if (ins[0].equals("register") && ins.length == 3)
            return userRegister(ins[1], ins[2]);
        else if (ins[0].equals("add") && ins.length == 6)
            return addList(ins[1], ins[2], df.parse(ins[3]), df.parse(ins[4]), ins[5]);
        else if (ins[0].equals("search") && ins.length == 5)
            return searchList(ins[1], ins[2], df.parse(ins[3]), df.parse(ins[4]));
        else if (ins[0].equals("delete") && ins.length == 4)
            return deleteList(ins[1], ins[2], Integer.valueOf(ins[3]));
        else if (ins[0].equals("clear") && ins.length == 3)
            return clearList(ins[1], ins[2]);
        else
            return help();
    }

    private String help() {
        String re = "";
        re += "命令格式错误。\n支持命令格式如下：";
        re += "	1.注册用户 register <username> <password>.\n";
        re += "	2.添加事件 add <username> <password> <starttime> <endtime> <description>.\n";
        re+= "	3.删除事件 delete <username> <password> <id>.\n";
        re+= "	4.清除事件 clear <username> <password>.\n";
        re+= "	5.搜索事件 search <username> <password> <starttime> <endtime>.\n";
        re+= "	6.推出管理 quit.\n";
        return re;
    }

    public static void main(String[] args) {
        /**
         * 参数1：服务的发布地址 参数2：服务的实现类
         */
        Endpoint.publish("http://localhost:1996/ex4", new server());
        System.out.println("Server Opening Success!");
    }

    // 1正确，2密码错误，0用户不存在
    public int checkPassword(String name, String password) {
        for (int i = 0; i < users.size(); i++)
            if (users.get(i).getUserName().equals(name))
                if (users.get(i).getPassword().equals(password))
                    return 1;
                else
                    return 2;
        return 0;

    }

}
