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
        re += "�����ʽ����\n֧�������ʽ���£�";
        re += "	1.ע���û� register <username> <password>.\n";
        re += "	2.����¼� add <username> <password> <starttime> <endtime> <description>.\n";
        re+= "	3.ɾ���¼� delete <username> <password> <id>.\n";
        re+= "	4.����¼� clear <username> <password>.\n";
        re+= "	5.�����¼� search <username> <password> <starttime> <endtime>.\n";
        re+= "	6.�˳����� quit.\n";
        System.out.println(re);
        System.out.println("����������.");
        while ((line = bufr.readLine()) != null) {
            if ("quit".equals(line)) // �ж�����quit���ͽ���ѭ��
                break;
            //System.out.println(line);
            System.out.println(hws.service(line));
            System.out.println("����������.");
        }
    }

}