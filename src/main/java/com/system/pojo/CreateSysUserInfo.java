package com.system.pojo;

/**
 * @Auther: 李景然
 * @Date: 2018/6/8 16:38
 * @Description:
 */
public class CreateSysUserInfo {
    private String userName;
    private String userPwd;
    private String userGroup;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }
}
