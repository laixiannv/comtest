package com.zhikexun.himsv4.pmsservice.opera_shiji;

public class getReservationStatus extends Request{
    public getReservationStatus(String appId, String IMEI, String hotelId, String reservationNumber) {
        super(appId, IMEI, hotelId, reservationNumber);
    }
}
