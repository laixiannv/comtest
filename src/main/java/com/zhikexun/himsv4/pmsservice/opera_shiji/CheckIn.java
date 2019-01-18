package com.zhikexun.himsv4.pmsservice.opera_shiji;

/**
 * 办理入住时传入的参数
 */
public class CheckIn {
    private String appId;//手机 App 应用的编号，必填
    private String IMEI;// 在 GJE 注册的酒店，必填
    private String hotelId;//酒店编号
    private String reservationNumber;//此编号表示通过中央预订系统或酒店普通预订生成的订单的订单号
    private Guest guest;//客人信息
    private String OTANumber;//第三方渠道号

    public CheckIn(String appId, String IMEI, String hotelId, String reservationNumber, Guest guest, String OTANumber) {

        this.appId = appId;
        this.IMEI = IMEI;
        this.hotelId = hotelId;
        this.reservationNumber = reservationNumber;
        this.guest = guest;
        this.OTANumber = OTANumber;
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

    public String getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(String reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public String getOTANumber() {
        return OTANumber;
    }

    public void setOTANumber(String OTANumber) {
        this.OTANumber = OTANumber;
    }
}
