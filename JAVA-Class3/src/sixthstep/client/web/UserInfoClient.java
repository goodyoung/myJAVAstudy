package sixthstep.client.web;

import sixthstep.domain.userinfo.UserInfo;
import sixthstep.domain.userinfo.dao.UserInfoDao;
import sixthstep.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import sixthstep.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("JAVA-Class3/db.properties");
        //파일을 읽어드리는 메서드
        Properties prop = new Properties();
        prop.load(fis); // name : value 페어로 읽어드린다.
        String dbType = prop.getProperty("DBTYPE");
        System.out.println(dbType);

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("user01");
        userInfo.setPasswd("1234");
        userInfo.setUserName("James");

        UserInfoDao userInfoDao = null;


        if(dbType.equals("ORACLE")){
            userInfoDao = new UserInfoOracleDao();
        }else if (dbType.equals("MYSQL")){
            userInfoDao = new UserInfoMySqlDao();
        }else{
            System.out.println("Not support");
        }
        if(userInfoDao != null){
            userInfoDao.insertUserInfo(userInfo);
            userInfoDao.updateUserInfo(userInfo);
            userInfoDao.deleteUserInfo(userInfo);
        }
    }
}
