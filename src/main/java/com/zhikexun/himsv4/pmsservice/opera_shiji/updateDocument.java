package com.zhikexun.himsv4.pmsservice.opera_shiji;

import java.util.List;

/**
 * 更新客人信息
 */
public class updateDocument extends   Request{
private List<Document> documents;//身份信息
    private String IMEI;//设备号
    private String hotelId;//酒店编号
    private String guestNumber;//客人号

    public updateDocument(String appId, String IMEI, String hotelId, String reservationNumber, List<Document> documents, String IMEI1, String hotelId1, String guestNumber) {
        super(appId, IMEI, hotelId, reservationNumber);
        this.documents = documents;
        this.IMEI = IMEI1;
        this.hotelId = hotelId1;
        this.guestNumber = guestNumber;
    }


    @Override
    public String getIMEI() {
        return IMEI;
    }

    @Override
    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    @Override
    public String getHotelId() {
        return hotelId;
    }

    @Override
    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List documents) {
        this.documents = documents;
    }

    public String getGuestNumber() {
        return guestNumber;
    }

    public void setGuestNumber(String guestNumber) {
        this.guestNumber = guestNumber;
    }
}
