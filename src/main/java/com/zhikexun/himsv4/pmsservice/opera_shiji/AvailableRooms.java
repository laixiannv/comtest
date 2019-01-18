package com.zhikexun.himsv4.pmsservice.opera_shiji;

/**
 * 查询可用房
 */
public class AvailableRooms {
    private String appId;//手机 App 应用的编号，必填
    private String IMEI;// 在 GJE 注册的酒店，必填
    private String hotelId;//酒店编号
    private String reservationNumber;//此编号表示通过中央预订系统或酒店普通预订生成的订单的订单号
    private String smoking;//房间是否允许吸烟，允许填：S ，不允许填：NS
    private String roomType;//房间类型
    private String rateCode;// 价格码
    private String arrival;//到店日期
    private String departure;//离店日期

    public AvailableRooms(String appId, String IMEI, String hotelId, String reservationNumber, String smoking, String roomType, String rateCode, String arrival, String departure) {

        this.appId = appId;
        this.IMEI = IMEI;
        this.hotelId = hotelId;
        this.reservationNumber = reservationNumber;
        this.smoking = smoking;
        this.roomType = roomType;
        this.rateCode = rateCode;
        this.arrival = arrival;
        this.departure = departure;
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

    public String getSmoking() {
        return smoking;
    }

    public void setSmoking(String smoking) {
        this.smoking = smoking;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRateCode() {
        return rateCode;
    }

    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }
}
