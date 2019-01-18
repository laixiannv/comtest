package com.zhikexun.himsv4.pmsservice.opera_shiji;

/**
 * 更新订单信息
 */
public class updateReservation {
    private ReservationInfo  reservationInfo;

    public updateReservation(ReservationInfo reservationInfo) {
        this.reservationInfo = reservationInfo;
    }

    public ReservationInfo getReservationInfo() {
        return reservationInfo;
    }

    public void setReservationInfo(ReservationInfo reservationInfo) {
        this.reservationInfo = reservationInfo;
    }
}
