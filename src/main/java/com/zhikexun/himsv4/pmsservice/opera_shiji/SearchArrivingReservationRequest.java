package com.zhikexun.himsv4.pmsservice.opera_shiji;

/**
 * 查询订单请求
 */
public class SearchArrivingReservationRequest {
    private String appId;//手机 App 应用的编号，必填
    private String IMEI;// 在 GJE 注册的酒店，必填
    private String hotelId;//酒店编号
    private String confirmationNumber;//确认号
    private String OTANumber;//第三方渠道号
    private String phoneNumber;//生成预订时提供的手机号
    private String lastName;//姓
    private String firstName;//   名
    private String documentNumber;//证件号
    private String name;//证件姓名

    public SearchArrivingReservationRequest(String appId, String IMEI, String hotelId, String confirmationNumber, String OTANumber, String phoneNumber, String lastName, String firstName, String documentNumber, String name) {
        this.appId = appId;
        this.IMEI = IMEI;
        this.hotelId = hotelId;
        this.confirmationNumber = confirmationNumber;
        this.OTANumber = OTANumber;
        this.phoneNumber = phoneNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.documentNumber = documentNumber;
        this.name = name;
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

    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    public String getOTANumber() {
        return OTANumber;
    }

    public void setOTANumber(String OTANumber) {
        this.OTANumber = OTANumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
