package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
register hansong 123456
register lbx 111111
register aaa 111111
add lbx 111111 2019-12-12 2019-12-12 aaa
add lbx 111111 2019-12-17 2019-12-17 aaa
add lbx 111111 2019-12-12 2019-12-17 aaa
search lbx 111111 2019-12-12 2019-12-17
delete lbx 111111 1
clear lbx 111111
*/

public class Client {

    public static void main(String[] args) throws ParseException_Exception, IOException {
        ServerService hwss = new ServerService();
        Server hws = hwss.getServerPort();
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        String re = "";
        re += "命令格式错误。\n支持命令格式如下：";
        re += "	1.注册用户 register <username> <password>.\n";
        re += "	2.添加事件 add <username> <password> <starttime> <endtime> <description>.\n";
        re+= "	3.删除事件 delete <username> <password> <id>.\n";
        re+= "	4.清除事件 clear <username> <password>.\n";
        re+= "	5.搜索事件 search <username> <password> <starttime> <endtime>.\n";
        re+= "	6.退出管理 quit.\n";
        System.out.println(re);
        System.out.println("请输入命令.");
        while ((line = bufr.readLine()) != null) {
            if ("quit".equals(line)) // 判断输入quit，就结束循环
                break;
            //System.out.println(line);
            System.out.println(hws.service(line));
            System.out.println("请输入命令.");
        }
    }

}