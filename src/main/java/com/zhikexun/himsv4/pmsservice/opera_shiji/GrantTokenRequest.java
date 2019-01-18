package com.zhikexun.himsv4.pmsservice.opera_shiji;

/**
 * 安全验证
 */
 public class GrantTokenRequest {
     private String appId;//手机 App 应用的编号，必填
     private String IMEI;// 在 GJE 注册的酒店，必填
    private String hotelId;//在 GJE 注册的酒店，节点必填，值可以为空
    private String username;//用户名
    private String password;//密码
    private Integer lifetime;//Token 有效时长，单位分钟，默认值是最大值 1440，非必填

    public GrantTokenRequest(String appId, String IMEI, String hotelId, String username, String password, Integer lifetime) {
        
        this.appId = appId;
        this.IMEI = IMEI;
        this.hotelId = hotelId;
        this.username = username;
        this.password = password;
        this.lifetime = lifetime;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getLifetime() {
        return lifetime;
    }

    public void setLifetime(Integer lifetime) {
        this.lifetime = lifetime;
    }
}
