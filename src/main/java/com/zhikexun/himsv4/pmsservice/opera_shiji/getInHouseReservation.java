package com.zhikexun.himsv4.pmsservice.opera_shiji;

/**
 * 查询在店订单
 */
public class getInHouseReservation extends Request{
    private String lastName;//客户名
    private String roomNumber;//房间号
    private String documentNumber;//证件号

    public getInHouseReservation(String appId, String IMEI, String hotelId, String reservationNumber, String lastName, String roomNumber, String documentNumber) {
        super(appId, IMEI, hotelId, reservationNumber);
        this.lastName = lastName;
        this.roomNumber = roomNumber;
        this.documentNumber = documentNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }
}
