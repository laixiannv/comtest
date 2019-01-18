package com.zhikexun.himsv4.pmsservice.opera_shiji;

/**
 * 账单查询
 */
public class Invoice {
    private String appId;//手机 App 应用的编号，必填
    private String IMEI;// 在 GJE 注册的酒店，必填
    private String hotelId;//酒店编号
    private String reservationNumber;//此编号表示通过中央预订系统或酒店普通预订生成的订单的订单号、

    public Invoice(String appId, String IMEI, String hotelId, String reservationNumber) {
        this.appId = appId;
        this.IMEI = IMEI;
        this.hotelId = hotelId;
        this.reservationNumber = reservationNumber;
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
}
