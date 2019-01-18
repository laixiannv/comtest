package com.zhikexun.himsv4.pmsservice.opera_shiji;

/**
 * 酒店床信息
 */
public class Bed {
    private String username;//用户名
    private String phone;//电话
    private String documentNumber;//documentNumber

    public Bed(String username, String phone, String documentNumber) {

        this.username = username;
        this.phone = phone;
        this.documentNumber = documentNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }
}
