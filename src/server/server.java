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
                return "�û����Ѵ���";
        User newUser = new User(name, password);
        if (users.add(newUser))
            return "�û������ɹ�";
        else
            return "�û�����ʧ��";
    }

    public String addList(String n, String pd, Date sT, Date eT, String des) {
        String re = "";
        int check = checkPassword(n, pd);
        if (check == 0)
            re += "�û�������";
        if (check == 2)
            re += "�û��������";
        if (check == 1)
            for (int i = 0; i < users.size(); i++)
                if (users.get(i).getUserName().equals(n)) {
                    int id = users.get(i).getId() + 1;
                    //server.ToDoList l = new server.ToDoList();
                    users.get(i).setNowId(id);
                    //users.get(i).getList();
                    users.get(i).addList(sT, eT, des, id);
                    re += "�¼������ɹ�";
                }
        return re;
    }

    public String searchList(String n, String pd, Date sT, Date eT) {
        String re = "";
        int check = checkPassword(n, pd);
        if (check == 0)
            re += "�û�������";
        if (check == 2)
            re += "�û��������";
        if (check == 1)
            for (int i = 0; i < users.size(); i++)
                if (users.get(i).getUserName().equals(n))
                    for (int j = 0; j < users.get(i).getList().size(); j++) {
                        ToDoList l = users.get(i).getList().get(j);
                        if ((!l.getStartTime().before(sT)) && (!l.getEndTime().after(eT)))
                            re += "�¼����� " + l.getDescription() + ", ��ʼʱ��Ϊ" + df.format(l.getStartTime()) + ", ����ʱ��Ϊ"
                                    + df.format(l.getEndTime()) + ", idΪ" + l.getId() + "\n";

                    }
        return re;
    }

    public String deleteList(String n, String pd, int id) {
        int check = checkPassword(n, pd);
        if (check == 0)
            return "�û�������";
        if (check == 2)
            return "�û��������";
        if (check == 1)
            for (int i = 0; i < users.size(); i++)
                if (users.get(i).getUserName().equals(n))
                    for (int j = 0; j < users.get(i).getList().size(); j++)
                        if (users.get(i).getList().get(j).getId() == id) {
                            users.get(i).getList().remove(j);
                            return "�¼�ɾ���ɹ�";
                        }
        return "�¼�id����";
    }

    public String clearList(String n, String pd) {
        int check = checkPassword(n, pd);
        if (check == 0)
            return "�û�������";
        if (check == 2)
            return "�û��������";
        if (check == 1)
            for (int i = 0; i < users.size(); i++)
                if (users.get(i).getUserName().equals(n)) {
                    users.get(i).getList().clear();
                    users.get(i).setNowId(0);
                    return "�¼�����ɹ�";
                }
        return "�¼��������";
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
        re += "�����ʽ����\n֧�������ʽ���£�";
        re += "	1.ע���û� register <username> <password>.\n";
        re += "	2.����¼� add <username> <password> <starttime> <endtime> <description>.\n";
        re+= "	3.ɾ���¼� delete <username> <password> <id>.\n";
        re+= "	4.����¼� clear <username> <password>.\n";
        re+= "	5.�����¼� search <username> <password> <starttime> <endtime>.\n";
        re+= "	6.�Ƴ����� quit.\n";
        return re;
    }

    public static void main(String[] args) {
        /**
         * ����1������ķ�����ַ ����2�������ʵ����
         */
        Endpoint.publish("http://localhost:1996/ex4", new server());
        System.out.println("Server Opening Success!");
    }

    // 1��ȷ��2�������0�û�������
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
