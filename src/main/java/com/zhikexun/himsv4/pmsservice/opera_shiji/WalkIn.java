package com.zhikexun.himsv4.pmsservice.opera_shiji;

public class WalkIn extends Request {
private Reservation reservation;

    public WalkIn(String appId, String IMEI, String hotelId, String reservationNumber, Reservation reservation) {
        super(appId, IMEI, hotelId, reservationNumber);
        this.reservation = reservation;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
